package billpay.burndown.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import billpay.burndown.domain.Burndown;
import billpay.burndown.domain.DailyWork;
import billpay.burndown.domain.Item;
import billpay.burndown.exception.BurndownGenException;
import billpay.burndown.repository.BurndownRepository;
import billpay.burndown.repository.DailyWorkRepository;
import billpay.burndown.service.BurndownGenService;
import billpay.burndown.util.BurndownInputContent;
import billpay.burndown.util.BurndownUtils;

@Service
public class BurndownGenServiceImpl implements BurndownGenService {

	@Autowired
	private BurndownRepository repository;

	@Autowired
	private DailyWorkRepository dailyWorkRepository;

	public BurndownGenServiceImpl() {
	}

	public DailyWork getBurndownDailyData(String sprintUrl)
			throws BurndownGenException {
		DailyWork dailyWork = null;
		try {
			URL url = new URL(sprintUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/xml");

			InputStream xml = connection.getInputStream();

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			org.w3c.dom.Document docXml = db.parse(xml);

			NodeList nodes = docXml.getElementsByTagName("item");
			dailyWork = new DailyWork();

			Set<Item> items = new HashSet<Item>();
			BigDecimal remaining = BigDecimal.ZERO;
			BigDecimal estimated = BigDecimal.ZERO;
			BigDecimal found = BigDecimal.ZERO;
			BigDecimal workDone = BigDecimal.ZERO;

			for (int i = 0; i < nodes.getLength(); i++) {
				Node nNode = nodes.item(i);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element el = (Element) nNode;
					String type = el.getElementsByTagName("type").item(0).getTextContent();

					if (!type.equals(Item.TicketTypes.USERSTORY.getName()) /*&&
							!type.equals(Item.TicketTypes.DEVBUG.getName())*/) {
						Item item = new Item();

						item.setTitle(el.getElementsByTagName("title").item(0).getTextContent());
						item.setLink(el.getElementsByTagName("link").item(0).getTextContent());
						item.setType(Item.TicketTypes.getTypeByName(type));
						item.setStatus(Item.Status.getStatus(el.getElementsByTagName("status").item(0).getTextContent()));
						item.setSprint(el.getElementsByTagName("fixVersion").item(0).getTextContent());
						item.setAssignee(el.getElementsByTagName("assignee").item(0).getTextContent());

						Node estimatedNode = el.getElementsByTagName("timeoriginalestimate").item(0);
						if (estimatedNode != null) {
							item.setEstimated(BurndownUtils.convertToHours(new BigDecimal(estimatedNode.getAttributes().getNamedItem("seconds").getNodeValue())));
							estimated = estimated.add(item.getEstimated());
						}

						if (!item.getStatus().equals(Item.Status.CANCELLED)) {
							Node spentNode = el.getElementsByTagName("timespent").item(0);
							BigDecimal timespent = BigDecimal.ZERO;
							
							if (spentNode != null  && item.getEstimated() != null) {
								timespent = BurndownUtils.convertToHours(new BigDecimal(spentNode.getAttributes().getNamedItem("seconds").getNodeValue()));
								
								item.setWorkDone(timespent);
								workDone = workDone.add(timespent);
							}
							
							if(!item.getStatus().equals(Item.Status.CLOSE)){							
								Node remainingNode = el.getElementsByTagName("timeestimate").item(0);
								if (remainingNode != null && item.getEstimated() != null) {
									item.setRemaining(BurndownUtils.convertToHours(new BigDecimal(remainingNode.getAttributes().getNamedItem("seconds").getNodeValue())));
									remaining = remaining.add(item.getRemaining());
								}
								if (item.getEstimated() != null
										&& timespent.compareTo(item.getEstimated()) > 0) {
									BigDecimal foundAux = timespent.subtract(item.getEstimated());
									item.setFound(foundAux);
									found = found.add(foundAux);
								}
								
							}
							
						}

						System.out.println(item.toString());

						items.add(item);
					}
				}
			}

			dailyWork.setItems(items);
			dailyWork.setCreateDate(new Date());
			// TODO:Check Calculate remaining
			dailyWork.setRemaining(remaining.add(found));
			dailyWork.setEstimated(estimated);
			dailyWork.setFound(found);
			dailyWork.setWorkDone(workDone);

		} catch (IOException e1) {
			e1.printStackTrace();
			throw new BurndownGenException(e1);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dailyWork;
	}

	public List<BurndownInputContent> generate() throws BurndownGenException {

		List<BurndownInputContent> contents = null;
		return contents;
	}

	public Burndown saveBurndownBySprint(DailyWork dailyNew)
			throws BurndownGenException {
		Burndown burndown = dailyNew.getBurndown();
		if (burndown != null) {
			burndown.setActive(Boolean.TRUE);
			burndown.setUpdateDate(new Date());
			if (repository.exists(burndown.getSprint())) {
				DailyWork dailyAux = dailyWorkRepository.findOneByDay(dailyNew.getDay());
				if (dailyAux != null) {
					dailyNew.setId(dailyAux.getId());
				} else {
					dailyNew.setId(null);
				}

				dailyNew = dailyWorkRepository.save(dailyNew);

				burndown = repository.findOne(burndown.getSprint());

			} else {
				Set<DailyWork> dailyNews = new HashSet<DailyWork>();
				dailyNews.add(dailyNew);
				burndown.setDailyWorks(dailyNews);

				burndown = repository.save(burndown);
			}
		}

		return burndown;
	}

	public Burndown getBurndownBySprint(String currentSprint)
			throws BurndownGenException {
		Burndown burndown = repository.findOne(currentSprint);

		return burndown;
	}

	public DailyWork getDailyWorkByDay(Integer day) throws BurndownGenException {
		return dailyWorkRepository.findOneByDay(day);
	}

	public Burndown adjustDailyWorkRemainingByEstimated(DailyWork cDaily, Burndown burndown) throws BurndownGenException {
		BigDecimal estimated = cDaily.getEstimated();
		if(burndown != null){
			Set<DailyWork> dailyes = burndown.getDailyWorks();
			if(dailyes != null){
				BigDecimal workDoneCount = BigDecimal.ZERO;
				for (DailyWork daily : dailyes) {
					BigDecimal diff = estimated.subtract(daily.getEstimated());
					if (diff.compareTo(BigDecimal.ZERO) > 0){
						daily.setRemaining(daily.getRemaining().add(diff));
						daily.setEstimated(estimated);
						dailyWorkRepository.save(daily);
					}
					workDoneCount = workDoneCount.add(daily.getWorkDone());
				}
				cDaily.setWorkDone(cDaily.getWorkDone().subtract(workDoneCount));
			}
		}
		return burndown;
	}
	
}
