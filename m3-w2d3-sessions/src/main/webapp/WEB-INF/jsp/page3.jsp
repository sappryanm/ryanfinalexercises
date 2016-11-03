<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Favorite Color</title>
	</head>
	<body>
		<h1>Hello, </h1>
		
		<form method="post" action="page3">
			<label for="season"> What is your favorite season</label>
			  <input type="radio" name="season" value="spring"> Spring<br>
			  <input type="radio" name="season" value="summer"> Summer<br>
			  <input type="radio" name="season" value="fall"> Fall<br>
			  <input type="radio" name="season" value="winter"> Winter<br>
			<input type="submit" value="Next Page" />
		
		</form>
	</body>
</html>