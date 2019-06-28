<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
		
		<c:set var = "n1" value = "0"/>
		<c:set var = "n2" value = "1"/>
		<c:set var = "n3" value = "1"/>
			<c:forEach begin="2" end="26" var="fibonacci">
			<c:set var = "n3" value = "${n1+n2}"/>
			<a>${n3}</a>
			</br>
			<c:set var = "n1" value = "${n2}"/>
			<c:set var = "n2" value = "${n3}"/>
		
			</c:forEach>
	
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
		</ul>
	</body>
</html>