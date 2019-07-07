<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<c:url value="/css/solarsystemgeek.css" var="cssHref" />
<link rel="stylesheet" href="${cssHref}">
</head>
<head>
<title>Hello Spring MVC</title>
</head>
<body>
	<div id="img">
		<c:url value="img/forDummies.png" var="logoSrc" />
		<img id="img1" src="${logoSrc}" alt="forDummies.png" />
	</div>
		<section id="Alienweight" class="planets">
	<h4 id="AlienColor">Add New Review</h4>

	<c:url var="formAction" value="newreview" />
	<form method="POST" action="${formAction}">
		<div class="main">
			<input class="ADD New review" type="submit"
				value="submit
			" />
		</div>
	</form>
</section>
	<c:forEach items="${reviews}" var="review">

		<tr>
			<td><c:out value="${review.title}" /></td>
			<br>
			<td><c:out value="${review.dateSubmitted}" /></td>
			<br>
			<c:forEach var="no-star" begin="1" end="${review.rating}">
				<img id="star" src="img/star.png" alt="star.png" />
			</c:forEach>
	
			<br>
			<td><c:out value="${review.text}" /></td>
			<p>---------------------------------------------------</p>
			
		</tr>



	</c:forEach>

</body>
</html>

