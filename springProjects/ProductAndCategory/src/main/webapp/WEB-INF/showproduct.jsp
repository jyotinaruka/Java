<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Category</title>
<link rel="stylesheet" href="/css/bootstrap.css"/>
<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
<div id="wrapper">
	<h1>${product.name}</h1>
	
	<div class="row">
		<div class="col">
			<ul>
				<c:forEach var="category" items="${product.categories}">
				<li>${category.name}</li>
				</c:forEach>
			</ul>
			
		</div>
		
		<div class="col">
			<form action="/categories/product/add" method="post">
			<input type="hidden" name="product_id" value="${product.id}"/>
			<div class="form-group row">
				<label for="category_id" class="col-sm-2 col-form-label">Add Category</label>
				<div class="col-sm">
					<select id="category_id" name="category_id" class="form-control">
						<c:forEach var="cat" items="${categories}">
						<option value="${cat.id}">${cat.name}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			
			<div class="form-group row">
				<div class="col-sm">
					<button type="submit" class="btn btn-primary">Add</button>
				</div>
			</div>
		</form>
		</div>
	</div>
</div>
</body>
</html>