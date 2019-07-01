<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Tile View" />
</c:import>

<div id="masonry-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="#" />
	</c:import>

	<!-- Container for all of the Products -->
	<!-- The list of products is available using the `products` variable -->
	<div id="grid" class="main-content">
		<c:forEach var="product" items="${products}">

			<!-- The following HTML shows different examples of what HTML
		 could be rendered based on different rules. For purposes
		 of demonstration we've written it out so you can see it
		 when you load the page up. -->

			<!-- Standard Product -->
			<c:if
				test="${product.topSeller == false && product.remainingStock != 0}">
				<div class="tile  ">
					<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
					<a class="product-image" href="#"> <img
						src="<c:url value="/images/product-images/${product.imageName}" />" />
					</a>
					<div class="details">
						<p class="name">
							<a href="#">${product.name}</a>
						</p>

						<!-- .filled will make the star solid -->
						<div class="rating">
							<c:forEach var="star" begin="1" end="${product.averageRating}">
								<span class="filled">&#9734</span>
							</c:forEach>
							<c:forEach var="no-star" begin="${product.averageRating}" end="4">
								<span>&#9734</span>
							</c:forEach>
						</div>
						<c:if
							test="${product.remainingStock > 0 && product.remainingStock <= 5}">
							<p class="product-alert">${product.remainingStock} REMAINING!</p>
						</c:if>

						<p class="price">$${product.price}</p>
					</div>
				</div>
			</c:if>

			<!-- Add the .top-seller class if the product is considered a Top Seller -->
			
			<c:if
				test="${product.topSeller == true && product.remainingStock != 0}">
				<div class="tile top-seller ">
					<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
					<a class="product-image" href="#"> <img
						src="<c:url value="/images/product-images/${product.imageName}" />" />
					</a>
					<div class="details">
						<p class="name">
							<a href="#">${product.name}</a>
						</p>

						<!-- .filled will make the star solid -->
						<div class="rating">
							<c:forEach var="star" begin="1" end="${product.averageRating}">
								<span class="filled">&#9734</span>
							</c:forEach>
							<c:forEach var="no-star" begin="${product.averageRating}" end="4">
								<span>&#9734</span>
							</c:forEach>
						</div>

						<!-- Add the Top Seller <br/> and product alert if the product is considered a Top Seller -->
						<br />
						<p class="product-alert">Top Seller</p>
						<!-- Add the X remaining product alert if the remaining quantity is greater than 0, but less than or equal to 5 -->
						<c:if
								test="${product.remainingStock > 0 && product.remainingStock <= 5}">
								<p class="product-alert">
									${product.remainingStock} REMAINING!</p>
							</c:if>
						<p class="price">$${product.price}</p>
					</div>
				</div>
			</c:if>
			<!-- Add the .sold-out class if the Remaining Stock is 0 -->
			<c:if
				test="${product.remainingStock == 0}">
			<div class="tile  sold-out">
				<!-- Add the Sold Out banner if the Remaining Stock is 0 -->
				<span class="banner">Sold Out</span>

				<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
				<a class="product-image" href="#"> <img
					src="<c:url value="/images/product-images/${product.imageName}" />" />
				</a>
				<div class="details">
					<p class="name">
						<a href="#">${product.name}</a>
					</p>

					<!-- .filled will make the star solid -->
					<div class="rating">
						<span class="filled">&#9734;</span> <span class="filled">&#9734;</span>
						<span class="filled">&#9734;</span> <span class="filled">&#9734;</span>
						<span>&#9734;</span>
					</div>

					<p class="price">$${product.price}</p>
				</div>
			</div>
				</c:if>
		</c:forEach>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />