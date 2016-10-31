<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Ordered Name</title>
	</head>
	<body>
		<c:url var="formResult" value="/orderedNameResults" />
		<form action="${formResult}" method="GET">
		<table>
			<tr>
				<td>
					<label for="first" style="color: black">Enter Your First Name</label>
				</td>
				<td>
					<input type="string" name="firstName" id="firstName"/>
				</td>
			</tr>
			<tr>
				<td>
					<label for="mi" style="color: black">Enter Your Middle Intial</label>
				</td>
				<td>
					<input type="string" name="middleName" id="middleName"/>
				</td>
			</tr>
			<tr>
			<tr>
				<td>
					<label for="last" style="color: black">Enter Your Last Name</label>
				</td>
				<td>
					<input type="string" name="lastName" id="lastName"/>
				</td>
			</tr>
			<tr>
				<td>
					  <input type="radio" name="nameOrder" value="firstMiLast"> First MI Last<br>
					  <input type="radio" name="nameOrder" value="firstLast"> First Last<br>
					  <input type="radio" name="nameOrder" value="lastFirstMi"> Last First MI<br>
					  <input type="radio" name="nameOrder" value="lastFirst"> Last First<br>
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