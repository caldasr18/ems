<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title><spring:message code="spring.data.jpa.example.title"/></title>
    
   	<link type="text/css" href="static/css/burndown.css" rel="stylesheet" />
    
    <script type="text/javascript" src="http://www.google.com/jsapi"></script>
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="static/js/burndown-functions.js"></script>
	<script type="text/javascript" src="static/js/burndown-startup.js"></script>
</head>
<body>
	<div id="mainMaximizedDashboardContainer">
		<input id="width" type="hidden" value="${dimension.width}" />
		<input id="height" type="hidden" value="${dimension.height}" />
		
		<div id="dashboard">
			<spring:url value="/" var="url"/>
 			<a href="${url}">Back >></a>
		   	<div id="visualization"></div>
		</div>
	</div>
</body>
</html>