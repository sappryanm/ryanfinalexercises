<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>fizzbuzz Name</title>
	</head>
<body>
		<c:forEach begin="1" end="100" var="index">	

		<c:choose>
					<c:when test="${index % 15 == 0}">
						<c:set var="rowClassAttribute" value="fizzbuzz" />
						<c:set var="FB" value="fizzbuzz" />
					</c:when>
					<c:when test="${index % 3 == 0}">
						<c:set var="rowClassAttribute" value="fizz" />
						<c:set var="FB" value="fizz" />
					</c:when>
					<c:when test="${index % 5 == 0}">
						<c:set var="rowClassAttribute" value="buzz" />
						<c:set var="FB" value="buzz" />
					</c:when>
					<c:otherwise>
						<c:set var="rowClassAttribute" value="" />
						<c:set var="FB" value="${index}" />
					</c:otherwise>
				</c:choose>			
		
		<li class="${rowClassAttribute}">
		${FB}
		
		</li>			
		</c:forEach>
</body>
</html>