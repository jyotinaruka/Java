<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Languages</title>
<link rel="stylesheet" href="css/bootstrap.css"/>
<link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<div id="wrapper">
	<div>
		<a href="/languages">Dashboard</a>
	</div>
		
		<p><c:out value="${language.name}"/></p>
		<p><c:out value="${language.creator}"/></p>
		<p><c:out value="${language.currentVersion}"/></p>
		
		
		<a href="/languages/edit/<c:out value="${language.id}"/>">Edit</a>
		<a href="/languages/delete/<c:out value="${language.id}"/>">Delete</a>
		
	</div>

</body>
</html>