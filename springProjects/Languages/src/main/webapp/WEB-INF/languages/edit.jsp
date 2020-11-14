<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Languages</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div id="wrapper">
		<div>
			<a href="">Delete</a> 
			<a href="/languages">Dashboard</a>
		</div>

		<form:form action="/languages/edit/${language.id}" method="put" modelAttribute="language">
			
			<form:hidden path="id" />
			
			<p>
				<form:label  path="name">Name</form:label>
				<form:input  path="name" />
				<form:errors path="name" />
			</p>
			
			<p>
				<form:label  path="creator">Creator</form:label>
				<form:input  path="creator" />
				<form:errors path="creator" />
			</p>
			
			<p>
				<form:label  path="currentVersion">Version</form:label>
				<form:input  path="currentVersion" />
				<form:errors path="currentVersion" />
			</p>
			
			<input id="btn" type="submit" value="Submit" />
			
		</form:form>
	</div>

</body>
</html>