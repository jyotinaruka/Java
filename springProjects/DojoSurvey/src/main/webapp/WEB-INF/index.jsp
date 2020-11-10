<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div id=wrapper>
		<form action="/process" method="post">

			<div class="form-group row mt-2">
				<label for="name" class="col-sm-2 col-form-label ">Your Name</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="name" name="name">
				</div>
			</div>
			
			
			
			
			<div class="form-group row">
				<label class="col-sm-2 col-form-label" for="language">Favorite
					Language</label>
				<div class="col-sm-5">
					<select class="form-control" id="language" name="language">
						<option>Python</option>
						<option>Java</option>
						<option>MERN</option>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 col-form-label" for="location">Location</label>
				<div class="col-sm-5">
					<select class="form-control" id="location" name="location">

						<option>Seattle</option>
						<option>Redmond</option>
						<option>Bellevue</option>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 col-form-label" for="comment">Comment</label>
				<div class="col-sm-5">
					<textarea class="form-control" id="comment" name="comment" rows="3"></textarea>
				</div>
			</div>

			<div class="form-group row">
				<div class="col-sm-5">
					<button type="submit" class="btn btn-primary " value="submit">Submit</button>
				</div>
			</div>
		</form>

	</div>
</body>
</html>