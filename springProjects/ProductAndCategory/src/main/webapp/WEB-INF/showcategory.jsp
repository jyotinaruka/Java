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
	<h1>${category.name}</h1>
	
	<div class="row">
		<div class="col">
			<ul>
				<c:forEach var="product" items="${category.products}">
				<li>${product.name}</li>
				</c:forEach>
			</ul>
			
		</div>
		
		<div class="col">
			<form action="/categories/product/add" method="post">
			<input type="hidden" name="category_id" value="${category.id}"/>
			<div class="form-group row">
				<label for="product_id" class="col-sm-2 col-form-label">Add Product</label>
				<div class="col-sm">
					<select id="product_id" name="product_id" class="form-control">
						<c:forEach var="prod" items="${products}">
						<option value="${prod.id}">${prod.name}</option>
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