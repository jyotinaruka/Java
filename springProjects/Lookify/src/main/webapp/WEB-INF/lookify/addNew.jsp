<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Songs</title>
<link rel="stylesheet" href="/css/bootstrap.css" />
<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
	<div id="wrapper">

			<a href="/dashboard">Dashboard</a>

			<form:form action="/songs/new" method="post" modelAttribute="newSong">
				<p>
					<form:label path="title">Title</form:label>
					<form:input path="title" />
					<form:errors path="title" />
				</p>

				<p>
					<form:label path="artist">Artist</form:label>
					<form:input path="artist" />
					<form:errors path="artist" />
				</p>

				<p>
					<form:label path="rating">Rating</form:label>
					<form:input path="rating" />
					<form:errors path="rating" />
				</p>

				<button type="submit" class="btn btn-primary mb-2 float-right">Add
					Song</button>

			</form:form>

	</div>
</body>
</html>