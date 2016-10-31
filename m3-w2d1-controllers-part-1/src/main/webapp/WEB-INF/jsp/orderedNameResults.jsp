<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Ordered Name Results</title>
	</head>
	<body>
		<h1>OrderName</h1>
		<p>First Name: ${ param.firstName } </p><br>
		<p> Middle Inital: ${ param.middleName } </p><br>
		<p> Last Name: ${ param.lastName } <p> <br>
		<p> ORdered Name Format Results: ${ orderFormat } </p>
</body>
</html>