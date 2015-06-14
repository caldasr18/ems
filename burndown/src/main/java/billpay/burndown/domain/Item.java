package billpay.burndown.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Table(name="item")
public class Item {

	public enum TicketTypes{
		TASK("Task"),DEVTASK("Dev-Task"),DEVREVTASK("Dev-ReviewTask"),USERSTORY("User Story"),EPIC("Epic"), DEVBUG("Dev-Bug"), UNKNOWN("Unknown");
		String name;
		TicketTypes(String name){
			this.name = name;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static TicketTypes getTypeByName(String name) {
			TicketTypes res = null;
			if(name.equals(TASK.name)){
				res = TASK;
			} else if(name.equals(USERSTORY.name)){
				res = USERSTORY;
			} else if(name.equals(EPIC.name)){
				res = EPIC;
			} else if(name.equals(DEVTASK.name)){
				res = DEVTASK;
			} else if(name.equals(DEVREVTASK.name)){
				res = DEVREVTASK;
			} else if(name.equals(DEVBUG.name)){
				res = DEVBUG;
			} else {
				res = UNKNOWN;
			}
			return res;
		}
	}
	
	public enum Status{
		CLOSE("Closed"),OPEN("Open"),IN_PROGRESS("In Progress"),IN_TESTING("In Testing"),READY_TO_DEPLOY("Ready to deploy"),CANCELLED("Cancelled"),PENDING("Pending"), UNKOWNSTATUS("Unkown");
		String name;
		Status(String name){
			this.name = name;
		}
		public static Status getStatus(String name) {
			Status res = null;
			if(name.equals(CLOSE.name)){
				res = CLOSE;
			} else if(name.equals(IN_PROGRESS.name)){
				res = IN_PROGRESS;
			} else if(name.equals(IN_TESTING.name)){
				res = IN_TESTING;
			} else if(name.equals(READY_TO_DEPLOY.name)){
				res = READY_TO_DEPLOY;
			} else if(name.equals(CANCELLED.name)){
				res = CANCELLED;
			} else if(name.equals(PENDING.name)){
				res = PENDING;
			} else if(name.equals(OPEN.name)){
				res = OPEN;
			} else {
				res = UNKOWNSTATUS;
			}
			return res;
		}
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="item_id")
	private Long id;
	
	private TicketTypes type;
	private Status status;
	private String sprint;
	private String assignee;
	private String code;
	private String title;
	private String description;
	private String link;
	private BigDecimal remaining;
	private BigDecimal estimated;
	private BigDecimal found;
	
	@Column(name="work_done")
	private BigDecimal workDone;
	
	@ManyToOne
	private DailyWork dailyWork;
	
	public Item(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TicketTypes getType() {
		return type;
	}

	public void setType(TicketTypes type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public BigDecimal getRemaining() {
		return remaining;
	}

	public void setRemaining(BigDecimal remaining) {
		this.remaining = remaining;
	}

	public BigDecimal getEstimated() {
		return estimated;
	}

	public void setEstimated(BigDecimal estimated) {
		this.estimated = estimated;
	}

	public BigDecimal getFound() {
		return found;
	}

	public void setFound(BigDecimal found) {
		this.found = found;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getSprint() {
		return sprint;
	}

	public void setSprint(String sprint) {
		this.sprint = sprint;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("title : " + title);
		str.append("\ndescription : " + description);
		str.append("\ntype : " + type);
		str.append("\nstatus : " + status);
		str.append("\nsprint : " + sprint);
		str.append("\ncode : " + code);
		str.append("\nestimated : " + estimated);
		str.append("\nfound : " + found);
		str.append("\nremaining : " + remaining);
		str.append("\nlink : " + link);
		str.append("\nassignee : " + assignee);
		str.append("\nwork done : " + workDone);
		
		return str.toString();
	}

	public DailyWork getDailyWork() {
		return dailyWork;
	}

	public void setDailyWork(DailyWork dailyWork) {
		this.dailyWork = dailyWork;
	}

	public BigDecimal getWorkDone() {
		return workDone;
	}

	public void setWorkDone(BigDecimal workDone) {
		this.workDone = workDone;
	}

}
