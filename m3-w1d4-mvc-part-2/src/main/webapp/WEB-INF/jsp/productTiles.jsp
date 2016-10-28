<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Tiles View</title>
    <link rel="stylesheet" href="css/site.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
           <c:url var="productTable" value="/productTable"></c:url>
			<li><a href="${productTable}"> Product Table</a><li>
           <c:url var="productListpage" value="/productList"></c:url>
			<li><a href="${productListpage}"> Product List</a><li>
        </ul>
        
    </nav>
    <section id="main-content">
	<h1>Toy Department</h1>
	<p> Product Tile View </p>
	<div class=container>		
	<c:forEach var="products" items="${productList}">
		
			<div class="column">
			<img src="<c:url value="img/${products.imageName}"/> " />
			<div>
				<p class="productName">${products.name}</p><p id=bestSeller><c:if test="${products.topSeller == true}"> BEST SELLER!</c:if>
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

       

    </section>
</body>
</html>