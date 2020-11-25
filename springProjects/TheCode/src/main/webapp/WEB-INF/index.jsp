<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Secret Code</title>
<link rel="stylesheet" href="css/style.css" />

</head>
<body>
	<div id="wrapper">
		<p><c:out value="${error}"/></p>
		<h1>What is the code?</h1>
		<form action="/code" method="post">
			<p>
				<input id="field" type="text" name="code">
			</p>
			<p>
				<input id="btn" type="submit" value="Try Code">
			</p>
		</form>

	</div>
</body>
</html>