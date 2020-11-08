<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.css" />
<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<h1>New Ninja</h1>
		<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
			<div class="form-group row">
				<form:label path="dojo.id" cssClass="col-sm-2 col-form-label">Dojo</form:label>
				<div class="col-sm">
					<form:select path="dojo.id" cssClass="form-control">
						<form:options items="${dojos}" itemValue="id" itemLabel="name" />
					</form:select>
					<form:errors path="dojo.id" cssClass="text-danger" />
				</div>
			</div>
			<div class="form-group row">
				<form:label path="firstName" cssClass="col-sm-2 col-form-label">First Name:</form:label>
				<div class="col-sm">
					<form:input path="firstName" cssClass="form-control" />
					<form:errors path="firstName" cssClass="text-danger" />
				</div>
			</div>
			<div class="form-group row">
				<form:label path="lastName" cssClass="col-sm-2 col-form-label">Last Name:</form:label>
				<div class="col-sm">
					<form:input path="lastName" cssClass="form-control" />
					<form:errors path="lastName" cssClass="text-danger" />
				</div>
			</div>
			<div class="form-group row">
				<form:label path="age" cssClass="col-sm-2 col-form-label">Age:</form:label>
				<div class="col-sm">
					<form:input path="age" cssClass="form-control" type="number" />
					<form:errors path="age" cssClass="text-danger" />
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