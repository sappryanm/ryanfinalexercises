<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Table View</title>
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
	<div class="section">
	<h1>Table View</h1>
		<table>
			<tr>
			</tr>
			<tr>
				<td></td>
				<c:forEach var="products" items="${productList}">
					<td id="tableImageSize"><img src="<c:url value="img/${products.imageName}"/> " /></td>
				</c:forEach>
			</tr>

			<tr>
				<td class="headers"> Name</td>
				<c:forEach var="products" items="${productList}">
					<td><p class="productName">${products.name}</p></td>
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
	
    </section>

</body>
</html>