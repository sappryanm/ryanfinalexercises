<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Favorite Food</title>
	</head>
	<body>
		<h1>Hello, </h1>
		
		<form method="POST" action="page2">
			<label for="color"> What is your favorite food?</label>
			<input type="text"	name="food" id="food" />
			<input type="submit" value="Next Page" />
		
		</form>
	</body>
</html>