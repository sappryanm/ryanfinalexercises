<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>FizzBuss Revisted</title>
	</head>
<body>
		<c:url var="formResult" value="/fizzBuzzRevistedResult" />
		<form action="${formResult}" method="GET">
		<table>
			<tr>
				<td>
					<label for="divisableone" style="color: black">Divisable By:</label>
				</td>
				<td>
					<input type="int" name="divisiableOne" id="divisableOne"/>
				</td>
			</tr>
			<tr>
				<td>
					<label for="divisabletwo" style="color: black">Divisable By:</label>
				</td>
				<td>
					<input type="int" name="divisiableTwo" id="divisiableTwo"/>
				</td>
			</tr>
			<tr>
				<td>
					<label for="altFizz" style="color: black">Alternative Fizz</label>
				</td>
				<td>
					<input type="text" name="alternativeFizz" id="alternativeFizz"/>
				</td>
			</tr>
			<tr>
				<td>
					<label for="altBuzz" style="color: black">Alternative Buzz:</label>
				</td>
				<td>
					<input type="int" name="alternativeBuzz" id="dalternativeBuzz"/>
				</td>
			</tr>

			<tr>
				<td></td>
				<td>
					<input type="submit" value="Calculate">
				</td>
			</tr>
			</table>
		</form>
</body>
</html>