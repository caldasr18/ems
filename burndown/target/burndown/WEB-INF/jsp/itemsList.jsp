<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title><spring:message code="spring.data.jpa.example.title"/></title>
    
   	<link type="text/css" href="static/css/burndown.css" rel="stylesheet" />
    
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="http://www.google.com/jsapi"></script>
	<script type="text/javascript" src="static/js/burndown-functions.js"></script>
	<script type="text/javascript" src="static/js/burndown-startup.js"></script>
</head>
<body>
    <h1><spring:message code="spring.data.jpa.example.homepage.title"/></h1>
	<div id="mainItemsListContainer" class="myform">
		<input id="width" type="hidden" value="${dimension.width}" />

		<input id="height" type="hidden" value="${dimension.height}" />
		
		<form:form modelAttribute="dailyNew" method="post">
			<div id="configuration">
				<div class="items">
					<table id="totals">
				   	    <tr>
				   	    	<td colspan="2">
				   	    		<form:errors path="*" />
				   	    	</td>
				   	    <tr>
		        			<td><form:label path="burndown.sprint">Sprint</form:label></td>
		        			<td><form:input path="burndown.sprint" /></td>
		    			</tr>
				   	    <tr>
		        			<td><form:label path="day">Day</form:label></td>
		        			<td>
		        				<form:input path="day" />
		        			</td>
		    			</tr>
				   	    <tr>
		        			<td>
		        				<form:label path="remaining">Total Remaining</form:label></td>
		        			<td><form:input path="remaining" /></td>
		    			</tr>
				   	    <tr>
		        			<td><form:label path="estimated">Total Estimated</form:label></td>
		        			<td><form:input path="estimated" /></td>
		    			</tr>
				   	    <tr>
		        			<td><form:label path="found">Total Found</form:label></td>
		        			<td><form:input path="found" /></td>
		    			</tr>
				   	    <tr>
		        			<td><form:label path="workDone">Total Work Done</form:label></td>
		        			<td><form:input path="workDone" /></td>
		    			</tr>
		    			<tr>
		        			<td colspan="2">
		            			<input type="submit" value="Add Day Data" />
		        			</td>
		    			</tr>
					</table>
				</div>
				<div id="previousDays" class="items">
					<div class="item">
						<c:if test="${!empty currentBurndown.dailyWorks}">
							<table>
								<thead>
									<tr>
										<th>Sprint</th><th>Day</th><th>Remaining</th><th>Estimated</th><th>Work Done</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="daily" items="${currentBurndown.dailyWorks}">
										<tr id="row_${currentBurndown.sprint}_${daily.day}">	
											<td>
												<span class="sprint">${currentBurndown.sprint}</span>
											</td>
											<td>
												<span class="day">${daily.day}</span>
											</td>
											<td>
												<span class="remaining">${daily.remaining}</span>
											</td>
											<td>
												<span class="estimated">${daily.estimated}</span>
											</td>
											<td>
												<span class="workDone">${daily.workDone}</span>
											</td>
										</tr> 	
									</c:forEach>
								</tbody>
							</table>
						</c:if>
					</div>
				</div>
				<c:forEach var="item" items="${dailyNew.items}">
			      <div class="items">
				      <div class="item">
				      	<label>Title:</label><span>${item.title}</span>
				      </div>
				      <div class="item">
				      	<label>Status:</label><span>${item.status}</span>
				      </div>
				      <div class="item">
				      	<label>Sprint:</label><span>${item.sprint}</span>
				      </div>
				      <div class="item">
				      	<label>Assignee:</label><span>${item.assignee}</span>
				      </div>
				      <div class="item">
				      	<label>Code:</label><span>${item.code}</span>
				      </div>
				      <div class="item">
				      	<label>Type:</label><span>${item.type}</span>
				      </div>
				      <div class="item">
				      	<label>Description:</label><span>${item.description}</span>
				      </div>
				      <div class="item">
				      	<label>Link:</label><span>${item.link}</span>
				      </div>
				      <div class="item">
				      	<label>Remaining:</label><span>${item.remaining}</span>
				      </div>
				      <div class="item">
				      	<label>Estimated:</label><span>${item.estimated}</span>
				      </div>
				      <div class="item">
				      	<label>Found:</label><span>${item.found}</span>
				      </div>
				      <div class="item">
				      	<label>Work Done:</label><span>${item.workDone}</span>
				      </div>
				    </div>
			   	</c:forEach>
		   	</div>
		   	
		   	<div id="dashboard">
		   		<spring:url value="/fullScreen" var="url"/>
 				<a href="${url}">Full screen >></a>
		   		<div id="visualization"></div>
		   	</div> 
	   	</form:form>
	</div>
</body>
</html>