<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Flipped the Last two letters</title>
	</head>
	<body>
		<c:forEach var="index" begin="0" end="${original.size() - 1}">
			${original[index] } : ${flipped[index]}<br/>
		</c:forEach>
</body>
</html>