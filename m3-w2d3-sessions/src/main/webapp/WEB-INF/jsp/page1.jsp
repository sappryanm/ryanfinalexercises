<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Favorite Color</title>
	</head>
	<body>
		<h1>Hello, <c:out value="" />!</h1>
		
		<form method="post" action="page">
			<label for="color"> What is your favorite color</label>
			<input type="text"	name="color" id="color" />
			<input type="submit" value="Next Page" />
		
		</form>
	</body>
</html>