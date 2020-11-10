<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New License</title>
<link rel="stylesheet" href="/css/bootstrap.css" />
<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<h1>New License</h1>
		<form:form action="/addlicense" method="post"
			modelAttribute="licenseObject">
			<h2>
			        <form:label path="person">Person:</form:label>
			        <form:select path="person">
						<c:forEach var="per" items="${personslist}" >
							<form:option value="${per.id}"><c:out value="${per.firstName} ${per.lastName}"/>
							</form:option>
						</c:forEach>c:forEach>
					</form:select>
			    </h2>	  
			    <h2>
			        <form:label  path="state">State:</form:label>
    			    <form:select  path="state">
						<c:forEach var="state" items="${states}" >
							<form:option value="${state}"><c:out value="${state}"/></form:option>
						</c:forEach>c:forEach>
					</form:select>
			    </h2>
			    <h2>
			        <form:label  path="expiration_date">Expiration Date:</form:label>
			        <form:input  type="date" path="expiration_date"/>
			    </h2>
			    <input id="btn" type="submit" value="Create"/>	 
			</form:form>
	</div>
</body>
</html>