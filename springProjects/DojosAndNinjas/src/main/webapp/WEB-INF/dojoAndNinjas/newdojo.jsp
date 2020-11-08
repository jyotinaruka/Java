<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Dojo</title>
<link rel="stylesheet" href="/css/bootstrap.css" />
<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
<div id="wrapper">
	<h1>New Dojo</h1>
	
	<form:form action="/dojos/new" method="post" modelAttribute="dojo">		  
			    <div>
			        <form:label path="name">Name:</form:label>
			        <form:input path="name"/>
			    </div>
			    <input class="btn btn-primary" type="submit" value="Create"/>	 
			</form:form>
</div>

</body>
</html>