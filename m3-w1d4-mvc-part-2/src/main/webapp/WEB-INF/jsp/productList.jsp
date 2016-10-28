<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product List View</title>
    <link rel="stylesheet" href="css/site.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
            <li><a href="#">Link 1</a></li>
            <li><a href="#">Link 2</a></li>
        </ul>
        
    </nav>
    <section id="main-content">
	<h1>Toy Department</h1>
	<p> Product Tile View </p>

	<c:forEach var="products" items="${productList}">
			<div id="listViewPictures">
			<img src="<c:url value="img/${products.imageName}"/> " />
			</div>
			<table class="productlistview">
			<tbody>
			<tr>
			<td><p class="productName">${products.name}</p><p id=bestSeller><c:if test="${products.topSeller == true}"> BEST SELLER!</c:if></p></td></td>
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
 

    </section>
</body>
</html>