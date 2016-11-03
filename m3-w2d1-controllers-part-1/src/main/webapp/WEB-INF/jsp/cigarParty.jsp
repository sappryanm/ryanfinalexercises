<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>FizzBuss Revisted</title>
	</head>
<body>
<div> <img src="img/smoking-squirrel.png"></img></div>
	<c:url var="formResult" value="/cigarPartyResult" />
		<form action="${formResult}" method="GET">
		<table>
			<tr>
				<td>
					<label for="squrriel" style="color: black">Number of Squirrels</label>
				</td>
				<td>
					<input type="text" name="numberSqurriels" id="numberSqurriels"/>
				</td>
			</tr>

				<td>
					  <input type="checkbox" name="weekend" value="weekend" > Is it the weekend?<br>

				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Submit">
				</td>
			</tr>
			</table>
		</form>
</body>
</html>