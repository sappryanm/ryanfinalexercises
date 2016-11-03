<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Favorite Things Exercise</title>
	</head>
	<body>
		<h1>Hello, <c:out value="" />!</h1>
		
		<h3>Favorite Color: <c:out value="${favorites.color}"/></h3>
		<h3>Favorite Food: <c:out value="${favorites.food}" /></h3>
		<h3>Favorite Season:<c:out value="${favorites.season}"/></h3>
		

	</body>
</html>