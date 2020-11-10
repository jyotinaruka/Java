<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Person</title>
<link rel="stylesheet" href="/css/bootstrap.css" />
<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
<div id="wrapper">
	<h1>New Person</h1>
			<form:form action="/addperson" method="post" modelAttribute="personObject">		  
			    <h2>
			        <form:label cssClass="label left" path="firstName">First Name:</form:label>
			        <form:input cssClass="box" path="firstName"/>
			    </h2>
			    <h2>
			        <form:label cssClass="label left" path="lastName">Last Name:</form:label>
			        <form:input cssClass="box" path="lastName"/>
			    </h2>
			    <input id="btn" type="submit" value="Create"/>	 
			</form:form>
	
</div>
</body>
</html>