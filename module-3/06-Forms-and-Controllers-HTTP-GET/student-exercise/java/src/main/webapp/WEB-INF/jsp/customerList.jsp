<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Actors List" />

<%@include file="common/header.jspf"%>
<!-- Form goes here -->


<c:url var="formAction" value="customerList" />
<form method="GET" action="${formAction}">
	<div class="main">
		<div class="formInputGroup">
			<label for="Search">Search: </label> <input
				type="text" name="Search" id="Search" />
		</div>
	</div>

	<div class="formInputGroup">
		<label for="Sort">Sort</label> <select name="Sort"
			id="Sort">


			<option value="last_name">last name</option>
			<option value="email">email</option>
			<option value="activebool">active</option>


		</select>
	</div>
	<input class="formSubmitButton" type="submit" value="Search" />
</form>

<table class="table">
	<tr>
		<th>Name</th>
	</tr>

	<c:forEach items="${customer}" var="customers">

		<tr>
			<th>< c:out value="${customers.firstName} ${customers.lastName} | ${customers.email} |${customers.active} " /></th>
			<th></th>
		</tr>
	</c:forEach>
</table>




<%@include file="common/footer.jspf"%>