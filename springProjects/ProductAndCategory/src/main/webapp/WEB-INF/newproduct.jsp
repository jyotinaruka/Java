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
		<h1>New Product</h1>
		<form:form action="/products/new" method="post" modelAttribute="product">
			<div class="form-group row">
				<form:label path="name" cssClass="col-sm-2 col-form-label">Name:</form:label>
				<div class="col-sm">
					<form:input path="name" cssClass="form-control" />
					<form:errors path="name" cssClass="text-danger" />
				</div>
			</div>
			<div class="form-group row">
				<form:label path="description" cssClass="col-sm-2 col-form-label">Description:</form:label>
				<div class="col-sm">
					<form:input path="description" cssClass="form-control" />
					<form:errors path="description" cssClass="text-danger" />
				</div>
			</div>
			<div class="form-group row">
				<form:label path="price" cssClass="col-sm-2 col-form-label">Price:</form:label>
				<div class="col-sm">
					<form:input path="price" cssClass="form-control" type="number" step="0.01" min="0" />
					<form:errors path="price" cssClass="text-danger" />
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