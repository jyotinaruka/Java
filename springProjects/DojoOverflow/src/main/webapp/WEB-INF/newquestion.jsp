<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Overflow</title>
<link rel="stylesheet" href="/css/bootstrap.css"/>
<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
<div id="wrapper">
	<h1>What is your question?</h1>
	<form:form action="/addquestion" method="post" modelAttribute="newquestion">
			<div class="form-group row">
				<form:label path="question" cssClass="col-sm-2 col-form-label">Question:</form:label>
				<div class="col-sm">
					<form:input path="question" cssClass="form-control" />
					<form:errors path="question" cssClass="text-danger" />
				</div>
			</div>
			
			<div class="form-group row">
				<label for="addtags" class="col-sm-2 col-form-label">Tags:</label>
				<div class="col-sm">
					<input id="addtags" name="addtags" class="form-control" />
					<form:errors  path="tags" cssClass="text-danger" />
				</div>
			</div>
			
			<div class="form-group row">
				<div class="col-sm">
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>
			</div>
			</form:form>
	
</div>
</body>
</html>