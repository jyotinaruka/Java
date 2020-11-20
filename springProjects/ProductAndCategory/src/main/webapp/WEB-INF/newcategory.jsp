<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Product</title>
<link rel="stylesheet" href="/css/bootstrap.css" />
<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<h1>New Category</h1>
		<form:form action="/categories/new" method="post"
			modelAttribute="category">


			<div class="form-group row">
				<form:label path="name" cssClass="col-sm-2 col-form-label">Name:</form:label>
				<div class="col-sm">
					<form:input path="name" cssClass="form-control" />
					<form:errors path="name" cssClass="text-danger" />
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm">
					<button type="submit" class="btn btn-primary">Create</button>
				</div>
			</div>
		</form:form>

	</div>
</body>
</html>