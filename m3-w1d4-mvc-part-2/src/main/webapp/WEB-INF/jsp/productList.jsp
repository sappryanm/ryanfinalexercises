<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="productHeader.jsp"%>
    <section id="main-content">
	<h1>Toy Department</h1>
	<p> Product List View </p>


	<c:forEach var="products" items="${productList}">
			<div id="listViewPictures">
			<a href="productDetail?productId=${products.productId}"><img src="<c:url value="img/${products.imageName}"/> " /></a>
			</div>
			<table class="productlistview">
			<tbody>
			<tr>
			<td><a href="productDetail?productId=${products.productId}"><p class="productName">${products.name}</p></a><p id=bestSeller><c:if test="${products.topSeller == true}"> BEST SELLER!</c:if></p></td></td>
			</tr>
			<tr>
			<td><p><em>${products.manufacturer}</em></p></td>
			</tr>
			
			<c:choose>
				<c:when test="${products.remainingStock < 5}">
					<c:set var="style" value="lowStockStyle"/>
					<td><c:set var="lowStock" value="${products.remainingStock} left in stock"/></td>
				</c:when>
				<c:otherwise>
					<c:set var="lowStock" value="" />
				</c:otherwise>
			</c:choose>
			<tr>
			<td><p class="${style}">${lowStock}</p></td>
			</tr>
			
			<tr>
			<td><h4 id=price>${products.price}</h4></td>
			</tr>

			<tr>
			<td><b>Weight:</b> ${products.weightInLbs} lbs</p></td>
			</tr>
			<c:choose>
				<c:when test="${products.averageRating < 2}">
					<td><img class="stars" src="img/1-star.png" /></td>
				</c:when>
				<c:when test="${products.averageRating < 3}">
					<td><img class="stars" src="img/2-star.png" /></td>
				</c:when>
				<c:when test="${products.averageRating < 4}">
					<td><img class="stars" src="img/3-star.png" /></td>
				</c:when>
				<c:when test="${products.averageRating < 5}">
					<td><img class="stars" src="img/4-star.png" /></td>
				</c:when>
				<c:otherwise>
					<td><img class="stars" src="img/5-star.png" /></td>
				</c:otherwise>
			</c:choose>	

			
			<tr>
			<td><img src ="<c:url value="${starCount}"/> "/></td>
			</tr>
	
			</tbody>
     </table>
     <div class="hline"> </div> 
	</c:forEach>
<%@include file="productFooter.jsp"%>