<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Date</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div id="wrapper">

		<div class="row m-5">
			<div class="col text-success">
				<fmt:formatDate pattern = "h:mm a" value = "${time}" />
			</div>
		</div>
	</div>
	<script src="js/time.js"></script>
</body>
</html>