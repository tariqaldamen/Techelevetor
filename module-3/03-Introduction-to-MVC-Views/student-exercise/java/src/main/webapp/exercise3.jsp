<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 3 - Echo</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 3 - Echo</h1>
		
		<ul>
		
		<li>
	
		<c:set var= "word" value= "Hello"></c:set>
		<c:set var= "count" value= "25"></c:set>
		<c:forEach begin="0" end="25" var = "con">
		<a style="font-size:${count}px;">${word}</a>
		</br>
		<c:set var= "count" value= "${count-1}"> </c:set>
		</c:forEach>
		
		<%--
			Given two query string parameters, "word" and "count":
			
			Add a number of list items equal to "count".  Each list item should contain the value passed in "word".
			
			The font size of the first list item should be equal to "count".  The font size of each subsequent list
			item should be decreased by 1.
			 
			See exercise3-echo.png for example output
		 --%>
		 <li>
		</ul>
		
	</body>
</html>