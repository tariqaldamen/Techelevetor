<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Exercise 1 - FizzBuzz</title>
<style>
li {
	list-style-type: none;
}

.fizz {
	color: blue;
}

.buzz {
	color: red;
}

.fizzbuzz {
	color: purple;
	font-size: 150%;
}
</style>
</head>
<body>
	<h1>Exercise 1 - FizzBuzz</h1>
	<ul>
	<li>
		<c:forEach begin="1" end="100" var="inches">
			<c:choose>
				<c:when test="${inches % 3 == 0 && inches % 5 == 0}">
					<c:set var="FizzBuzz" value="FizzBuzz!" />
					<a class = "fizzbuzz">${FizzBuzz}</a>
					</br>
				</c:when>
				<c:when test="${inches % 5 == 0}">
					<c:set var="Buzz" value="Buzz!" />
					<a class = "buzz">${Buzz}</a>
					</br>
				</c:when>
				<c:when test="${inches % 3 == 0}">
					<c:set var="Fizz" value="Fizz!" />
					<a class = "fizz">${Fizz}</a>
					</br>
				</c:when>
				<c:otherwise>
					<a>${inches}</a>
					</br>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<li>
	</ul>
</body>
</html>