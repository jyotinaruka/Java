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
		<table class="table table-striped table-hover table-bordered tblbrd">
		    <thead class="table-dark">
		        <tr>
		            <th scope="col">Name</th>
		            <th scope="col">Creator</th>
		            <th scope="col">Version</th>
		            <th scope="col">Action</th>
		        </tr>
		    </thead>

		    <tbody>
		        <c:forEach var="lang" items="${languages}">
		        <tr>
		            <td><a href="languages/<c:out value="${lang.id}"/>">
		            	<c:out value="${lang.name}"/></a></td>
		            <td><c:out value="${lang.creator}"/></td>
		            <td><c:out value="${lang.currentVersion}"/></td>
		            <td><a href="/languages/delete/<c:out value="${lang.id}"/>">Delete</a>
		             <a href="languages/edit/<c:out value="${lang.id}"/>">Edit</a></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
		<hr>
		<div>
			<form:form action="/languages" method="post" modelAttribute="addNew">		  
			    <p>
			        <form:label path="name">Name</form:label>
			        <form:input  path="name"/>
			        <form:errors path="name"/>

			    </p>
			    <p>
			        <form:label path="creator">Creator</form:label>
			        <form:input  path="creator"/>
    				<form:errors path="creator"/>
			    </p>
			    <p>
			        <form:label  path="currentVersion">Version</form:label>
			        <form:input  path="currentVersion"/>
     		 		<form:errors path="currentVersion"/>
			    </p>
			    <input type="submit" value="Submit"/>
			</form:form>
		</div>
	</div>

</body>
</html>