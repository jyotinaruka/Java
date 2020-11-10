<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Survey Results</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/style.css"/>
</head>
<body>
	<div id=wrapper>
		
		<h2>Submitted Info</h2>
		<p>Name:<c:out value="${name}" /></p>
		
			
		<p>Dojo Location:<c:out value="${location}" /></p>
		
		<p>Favorite Language:<c:out value="${language}" /></p>
				
		<p>Comment:<c:out value="${comment}" /></p>
			
			
		<div class="form-group row">
			<div class="col-sm-10">
				<button type="submit" class="btn btn-primary" value="submit"><a href="/">Go
					Back</a></button>
			</div>
		</div>

	</div>

</body>
</html>