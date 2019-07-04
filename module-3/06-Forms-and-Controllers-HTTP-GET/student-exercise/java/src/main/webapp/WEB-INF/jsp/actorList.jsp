<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
<!-- Form goes here -->


<c:url var="formAction" value="actorList" />
<form method="GET" action="${formAction}">
	<div class="main">
		<div class="formInputGroup">
			<label for="Actors">Enter Last name For The Actors </label> <input
				type="text" name="Actors" id="Actors" />
		</div>

		<input class="formSubmitButton" type="submit" value="Search" />
	</div>
</form>

<table class="table">
<tr>
<th>Name</th>
</tr>

<c:forEach items="${actors}" var="actor">

<tr>
<th><c:out value="${actor.firstName}     ${actor.lastName}" /></th>
</tr>
</c:forEach>
</table>

<%@include file="common/footer.jspf"%>