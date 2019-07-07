<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section id="review" class="review">
	<h4 id="AlienColor">Add New Review</h4>

	<c:url var="reviewURL" value="addnewreview" />
	
	<form action="${reviewURL}" method="POST">
		<div class="main">

			<div class="review">
				<label for="username">Username  </label> <input
					type="text" name="username" id="username" />
			</div>
			<div class="review">
				<label for="rating">Rating[1-5] </label> <input
					type="text" name="rating" id="rating" />
			</div>
			<div class="review">
				<label for="reviewtitle">Review Title  </label> <input
					type="text" name="reviewtitle" id="reviewtitle" />
			</div>
			<div class="review">
				<label for="reviewtext">Review Text </label> <input
					type="text" name="reviewtext" id="reviewtext" />
			</div>


		</div>
					<input class="review" type="submit" value="submit" />
	</form>
</section>
</body>
</html>