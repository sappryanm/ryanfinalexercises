<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Colorized Name Results</title>
	</head>
	<body>
		<h1>Colorized Name Results</h1>
		<p>First Name: ${param.firstName} </p>,<br>
		<p>Last Name: ${param.lastName} </p>,<br>
		<c:forEach var='colorValue' items='${paramValues.colorSelector}'> 
  			 <p style= color:${colorValue};> ${param.firstName}, ${param.lastName} </p><br>
		</c:forEach>

</body>
</html>