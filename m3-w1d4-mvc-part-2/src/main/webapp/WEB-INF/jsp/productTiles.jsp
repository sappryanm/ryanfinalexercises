<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file = "productHeader.jsp" %>

	<h1>Toy Department</h1>
	<p> Product Tile View </p>
	<div class=container>		
	<c:forEach var="products" items="${productList}">
		
			<div class="column">
			<a href="productDetail?productId=${products.productId}"/><div><img src="<c:url value="img/${products.imageName}"/> " /></div></a>
			<div>
				<p class="productName"><a href="productDetail?productId=${products.productId}">${products.name}</a></p><p id=bestSeller><c:if test="${products.topSeller == true}"> BEST SELLER!</c:if>
			</p>
			</div>

			<p><em>${products.manufacturer}</em></p>
			<div>
			<c:choose>
				<c:when test="${products.remainingStock < 5}">
					<c:set var="style" value="lowStockStyle"/>
					<c:set var="lowStock" value="${products.remainingStock} left in stock"/>
				</c:when>
				<c:otherwise>
					<c:set var="lowStock" value="" />
				</c:otherwise>
			</c:choose>
			<p class="${style}">${lowStock}</p>
			</div>
			<h4 id=price>${products.price}</h4>
			
			<p></p>
			<p><b>Weight:</b> ${products.weightInLbs} lbs</p>
			<c:choose>
				<c:when test="${products.averageRating < 2}">
					<img class="stars" src="img/1-star.png" />
				</c:when>
				<c:when test="${products.averageRating < 3}">
					<img class="stars" src="img/2-star.png" />
				</c:when>
				<c:when test="${products.averageRating < 4}">
					<img class="stars" src="img/3-star.png" />
				</c:when>
				<c:when test="${products.averageRating < 5}">
					<img class="stars" src="img/4-star.png" />
				</c:when>
				<c:otherwise>
					<img class="stars" src="img/5-star.png" />
				</c:otherwise>
			</c:choose>	
			</br>
			<div id=starBottom>
			<img src ="<c:url value="${starCount}"/> "/>
			</div>
			</div>
		
		
	</c:forEach>
    </div>
    <%@include file="productFooter.jsp"%>
