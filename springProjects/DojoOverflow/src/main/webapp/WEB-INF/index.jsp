<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Overflow</title>
<link rel="stylesheet" href="/css/bootstrap.css" />
<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
	<div id="wrapper">
	<h1>Questions Dashboard</h1>
	<table class="table table-bordered">
			<thead class="table table-striped">
				<tr>
					<th scope="col">Question</th>
					<th scope="col">Tags</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="q" items="${questions}">
				<tr>
					<td>${q.question}</td>
					<td>
						<c:forEach var="tag" items="${q.tags}" varStatus="status">
							${tag.subject}${status.last?'':','}
						</c:forEach>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<a class="float-right"  href="/questions/new">New Question</a>
	
</div>
</body>
</html>