<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
<!-- Form goes here -->


<c:url var="formAction" value="filmList" />
<form method="GET" action="${formAction}">
	<div class="main">
		<div class="formInputGroup">
			<label for="MinimumLength">Minimum Length: </label> <input
				type="text" name="MinimumLength" id="MinimumLength" />
		</div>

	
	</div>
	
	<div class="main">
		<div class="formInputGroup">
			<label for="MaximumLength">Maximum Length: </label> <input
				type="text" name="MaximumLength" id="Maximum Length" />
		</div>

	</div>
	
		<div class="formInputGroup">
				<label for="chooseGenre">Genre:</label> <select
					name="chooseGenre" id="chooseGenre">

					<option value="Action">Action</option>
					<option value="Animation">Animation</option>
					<option value="Children">Children</option>
					<option value="Classics">Classics</option>
					<option value="Comedy">Comedy</option>
					<option value="Documentary">Documentary</option>
					<option value="Drama">Drama</option>
					<option value="Family">Family</option>
					<option value="Foreign">Foreign</option>

				</select>
			</div>
		<input class="formSubmitButton" type="submit" value="Search" />
</form>

<table class="table">
<tr>
<th>Name</th>
</tr>

<c:forEach items="${films}" var="film">

<tr>
<th >< c:out value="${film.title}   |   ${film.description} |  ${film.releaseYear} | ${film.length} | ${film.rating}" /></th>
<th></th>
</tr>
</c:forEach>
</table>




<%@include file="common/footer.jspf"%>