<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Artist</title>
<link rel="stylesheet" href="/css/bootstrap.css" />
<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
	<div id="wrapper">

		<h2>Song by artist: ${artist}</h2>
		<div class="form-group mx-sm-3 mb-4">
			<form action="/search" method="post">
				<input type="search" name="artist" placeholder="Artist"> <input
					class="form " type="submit" value="New Search">

			</form>
		</div>

		<table class="table">
			<thead class="table-dark">
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Rating</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="song" items="${songs}">
					<tr>
						<td><a href="/songs/${song.id}">${song.title}</a></td>
						<td>${song.rating}</td>
						<td><a href="/songs/${song.id}/delete">delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>


	</div>


</body>
</html>