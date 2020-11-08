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
	<h1>Dojo List</h1>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Locations</th>			
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dojo" items="${dojos}">
			<tr>
		
				<td><a href="/dojos/${dojo.id}">${dojo.name}</a></td>
				<td>${dojo.location}</td>				
			</tr>
			</c:forEach>
		</tbody>
		
		
	</table>
	
	
</div>

</body>
</html>