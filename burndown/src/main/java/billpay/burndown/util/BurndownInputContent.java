package billpay.burndown.util;

public class BurndownInputContent {

	private String summary;
	private String aggregateprogress;
	private Integer aggregatetimespent;
	private Integer aggregatetimeestimate;
	private Integer aggregatetimeoriginalestimate;
	
	public BurndownInputContent() {}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getAggregateprogress() {
		return aggregateprogress;
	}

	public void setAggregateprogress(String aggregateprogress) {
		this.aggregateprogress = aggregateprogress;
	}

	public Integer getAggregatetimespent() {
		return aggregatetimespent;
	}

	public void setAggregatetimespent(Integer aggregatetimespent) {
		Integer days = new Integer((aggregatetimespent/60)/60);
		this.aggregatetimespent = days;
	}

	public Integer getAggregatetimeestimate() {
		return aggregatetimeestimate;
	}

	public void setAggregatetimeestimate(Integer aggregatetimeestimate) {
		Integer days = new Integer((aggregatetimeestimate/60)/60);
		this.aggregatetimeestimate = days;
	}

	public Integer getAggregatetimeoriginalestimate() {
		return aggregatetimeoriginalestimate;
	}

	public void setAggregatetimeoriginalestimate(
			Integer aggregatetimeoriginalestimate) {
		Integer days = new Integer((aggregatetimeoriginalestimate/60)/60);
		this.aggregatetimeoriginalestimate = days;
	}

	public String print(){
		StringBuilder str = new StringBuilder();
		str.append("<table cellspacing='5' cellspadding='5' style='width:600px;'>");
		str.append("<tr style='background-color:#DDDBDE;'>");
		str.append("<td style='vertical-align:top;'>Summary</td>");
		str.append("<td style='vertical-align:top;'>Aggregate Progress</td>");
		str.append("<td style='vertical-align:top;'>Aggregate Time Spent</td>");
		str.append("<td style='vertical-align:top;'>Aggregate Time Estimate</td>");
		str.append("<td style='vertical-align:top;'>Aggregate Time Original Estimate</td>");
		str.append("</tr>");
		str.append("<tr>");
		str.append("<td>" + summary + "</td>");
		str.append("<td>" + aggregateprogress + "</td>");
		str.append("<td>" + aggregatetimespent + "</td>");
		str.append("<td>" + aggregatetimeestimate + "</td>");
		str.append("<td>" + aggregatetimeoriginalestimate + "</td>");
		str.append("</tr>");
		str.append("</table>");
		
		return str.toString();
	}

}
