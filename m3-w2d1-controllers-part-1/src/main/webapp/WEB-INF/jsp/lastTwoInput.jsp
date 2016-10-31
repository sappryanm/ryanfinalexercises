<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Swap the Last two letters</title>
	</head>
	<body>
		<c:url var="formResult" value="/lastTwoResult" />
		<form action="${formResult}" method="GET">
			<label for="word1">Word1:</label>
			<input type="text" name="word1" id="word1"/></br>
			<label for="word2">Word2:</label>
			<input type="text" name="word2" id="word2"/></br>
			<label for="word3">Word3:</label>
			<input type="text" name="word3" id="word3"/></br>
			<label for="word4">Word4:</label>
			<input type="text" name="word4" id="word4"/></br>
			<label for="word5">Word5:</label>
			<input type="text" name="word5" id="word5"/></br>
			<label for="word6">Word6:</label>
			<input type="text" name="word6" id="word6"/></br>
			<label for="word7">Word7:</label>
			<input type="text" name="word7" id="word7"/></br>
			<label for="word8">Word8:</label>
			<input type="text" name="word8" id="word8"/></br>
			<label for="word9">Word9:</label>
			<input type="text" name="word9" id="word9"/></br>
			<label for="word10">Word10:</label>
			<input type="text" name="word10" id="word10"/></br>
			<input type="submit" value="Submit"/>
		</form>
	</body>
</html>