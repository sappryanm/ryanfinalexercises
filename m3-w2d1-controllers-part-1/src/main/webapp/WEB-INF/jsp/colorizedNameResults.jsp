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
		
			<p style="${colorSelector}"> ${param.firstName}, ${param.lastName} </p>
		
		
</body>
</html>