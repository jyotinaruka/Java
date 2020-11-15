<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Top ten Songs</title>
<link rel="stylesheet" href="/css/bootstrap.css" />
<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<div class="row">
			<div class="col">
				<h2>Top Ten Songs:</h2>
			</div>
			<div class="col">
				<a href="/dashboard">Dashboard</a>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<ul>
					<c:forEach var="song" items="${topSongs}">
						<li>${song.rating}- <a href="/songs/${song.id}">${song.title}</a>
							- ${song.artist}
						</li>
					</c:forEach>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>