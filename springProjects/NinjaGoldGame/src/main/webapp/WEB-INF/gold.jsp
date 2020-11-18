<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold Game</title>
<link rel="stylesheet" href="css/ninja_gold.css" />
</head>
<body>
	<div id="wrapper">
		<h1>Ninja Gold Game</h1>
		<h3>Your Gold:</h3>
		<span>${gold}</span>
		<div id="container">
			<div id="farm">
				<h3>Farm</h3>
				<h4>(earns 10-20 gold)</h4>
				<form action="/process_money" method="POST">

					<input type="hidden" name="action" value="farm"> <input
						id="farm_button" name="submit" type="submit" value="Find Gold!">
				</form>
			</div>

			<div id="cave">
				<h3>Cave</h3>
				<h4>(earns 5-10 gold)</h4>
				<form action="/process_money" method="POST">

					<input type="hidden" name="action" value="cave"> <input
						id="cave_button" name="submit" type="submit" value="Find Gold!">
				</form>
			</div>
			<div id="house">
				<h3>House</h3>
				<h4>(earns 2-5 gold)</h4>
				<form action="/process_money" method="POST">

					<input type="hidden" name="action" value="house"> <input
						id="house_button" name="submit" type="submit" value="Find Gold!">
				</form>

			</div>
			<div id="casino">
				<h3>Casino</h3>
				<h4>(earns/takes 0-50 gold)</h4>
				<form action="/process_money" method="POST">

					<input type="hidden" name="action" value="casino"> <input
						id="casino_button" name="submit" type="submit" value="Find Gold!">
				</form>
			</div>
		</div>

		<div id="activities">
			<h3>Activities:</h3>
			<div id="activity">
				<c:forEach var="activity" items="${activities}">
					<p class="${ activity['money'] < 0 ? 'red' : 'green' }">
						<c:choose>
							<c:when test="${activity['type'] == 'casino'}">

								<c:choose>
									<c:when test="${ activity['money'] < 0}">
							     Entered a ${activity['type']} and lost ${activity['money'] * -1} golds.... Ouch.. (${activity['date']}) 
							    </c:when>
									<c:otherwise>
							     Entered a ${activity['type']}
								and win ${activity['money']} golds... Hurray! (${activity['date']}) 
							    </c:otherwise>
								</c:choose>
							</c:when>
							<c:otherwise>
       						Earned ${activity['money']} from the ${activity['type']}! (${activity['date']}) 
							</c:otherwise>
						</c:choose>
					</p>
				</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>