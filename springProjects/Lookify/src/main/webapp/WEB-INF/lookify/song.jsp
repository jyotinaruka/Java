<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Song Info</title>
<link rel="stylesheet" href="/css/bootstrap.css" />
<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
	<div id="wrapper">

		<div><a href="/dashboard">Dashboard</a></div>
		<div class="row">
			<div class="col">Title</div>
			<div class="col">${song.title}</div>
		</div>
		<div class="row">
			<div class="col">Artist</div>
			<div class="col">${song.artist}</div>
		</div>
		<div class="row">
			<div class="col">Rating</div>
			<div class="col">${song.rating}</div>
		</div>
		
	</div>


</body>
</html>