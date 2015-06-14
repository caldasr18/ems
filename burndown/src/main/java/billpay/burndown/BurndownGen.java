package billpay.burndown;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class BurndownGen {

	public void query() throws ParserConfigurationException, SAXException,
			IOException, XPathExpressionException {
		// Standard of reading a XML file
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder;
		Document doc = null;
		XPathExpression expr = null;
		builder = factory.newDocumentBuilder();
		doc = builder.parse("src/main/resources/template/SearchRequest-11020.xml");

		// Create a XPathFactory
		XPathFactory xFactory = XPathFactory.newInstance();

		// Create a XPath object
		XPath xpath = xFactory.newXPath();

		// Compile the XPath expression
		expr = xpath.compile("//item[type='User Story']/title/text()");
		// Run the query and get a nodeset
		Object result = expr.evaluate(doc, XPathConstants.NODESET);

		// Cast the result to a DOM NodeList
		NodeList nodes = (NodeList) result;
		for (int i = 0; i < nodes.getLength(); i++) {
			System.out.println(nodes.item(i).getNodeValue());
		}

		// New XPath expression to get the number of people with name lars
		expr = xpath.compile("count(//item[type='User Story'])");
		// Run the query and get the number of nodes
		Double number = (Double) expr.evaluate(doc, XPathConstants.NUMBER);
		System.out.println("Number of User Story " + number);

	}

	public static void main(String[] args) throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException {
		BurndownGen process = new BurndownGen();
		process.query();
	}

}
