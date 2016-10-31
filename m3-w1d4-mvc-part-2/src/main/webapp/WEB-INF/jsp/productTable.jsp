<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="productHeader.jsp"%>
<section id="main-content">
	<div class="section">
	<h1>Table View</h1>
		<table>
			<tr>
			</tr>
			<tr>
				<td></td>
				<c:forEach var="products" items="${productList}">
					
					<td id="tableImageSize"><a href="productDetail?productId=${products.productId}"/><img src="<c:url value="img/${products.imageName}"/> " /></td>
					
				</c:forEach>
			</tr>

			<tr>
				<td class="headers"> Name</td>
				<c:forEach var="products" items="${productList}">
					<td><a href="productDetail?productId=${products.productId}"/><p class="productName">${products.name}</p></td>
				</c:forEach>
			</tr>
			<tr>
			<td class="headers">Rating</td>
				<c:forEach var="products" items="${productList}">
			<c:choose>
				<c:when test="${products.averageRating < 2}">
					<td><img class="stars t" src="img/1-star.png" /></td>
				</c:when>
				<c:when test="${products.averageRating < 3}">
					<td><img class="stars t" src="img/2-star.png" /></td>
				</c:when>
				<c:when test="${products.averageRating < 4}">
					<td><img class="stars t" src="img/3-star.png" /></td>
				</c:when>
				<c:when test="${products.averageRating < 5}">
					<td><img class="stars t" src="img/4-star.png" /></td>
				</c:when>
				<c:otherwise>
					<td><img class="stars t" src="img/5-star.png" /></td>
				</c:otherwise>
			</c:choose>	

				</c:forEach>
			</tr>
			<tr>
				<td class="headers">Manufacturer</td>
				<c:forEach var="products" items="${productList}">
					<td>${products.manufacturer}</td>
				</c:forEach>
			</tr>
			<tr>
				<td class="headers">Price</td>
				<c:forEach var="products" items="${productList}">
					<td>${recipe.ingredients.size()} ingredients</td>
				</c:forEach>
			</tr>
						<tr>
				<td class="headers">Manufacturer</td>
				<c:forEach var="products" items="${productList}">
					<td><p>${products.weightInLbs} lbs</p></td>
				</c:forEach>
			</tr>
			<tr>
			
	</table>
	</div>
<%@include file="productFooter.jsp"%>