<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>fizzbuzz Name</title>
	</head>
<body>
<div>
<p>Divisable By: ${param.divisiableOne} </p>
<p>Divisable By: ${param.divisiableTwo} </p>
<p>Divisable By Both: ${param.divisiableOne} and ${param.divisiableTwo} </p> <br>
<p>Alternative Fizz: ${param.alternativeFizz} </p> 
<p>Alternative Fizz: ${param.alternativeBuzz} </p>
</div>
		<c:forEach begin="1" end="100" var="index">	

		<c:choose>
			<c:when test="${(index % param.divisiableOne == 0) && (index % param.divisiableTwo == 0)}">
				<c:set var="FB" value="${param.alternativeFizz}${param.alternativeBuzz}" />
			</c:when>
			<c:when test="${index % param.divisiableOne == 0}">
				<c:set var="FB" value="${param.alternativeFizz}" />
			</c:when>
			<c:when test="${index % param.divisiableTwo == 0}">
				<c:set var="FB" value="${param.alternativeBuzz}" />
			</c:when>
			<c:otherwise>
				<c:set var="FB" value="${index}" />
			</c:otherwise>
		</c:choose>			
		<div>
		<p>${FB}</p>
		</div>	
		</c:forEach>
</body>
</html>