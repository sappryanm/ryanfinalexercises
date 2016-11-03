<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Squirrel PArties for Dummies</title>
    <c:url value="/css/stylesheet.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>

<body>
    <header>
    		<c:url value="/" var="homePageHref" />

        <a href="${homePageHref}">
        		
        </a>
        <h1>Squirrel Party for Dummmies</h1>

          
    </header>
    <nav>
        <h2>Looks whos Talking</h2>
    
        <ul>
        	<li><a href="${homePageHref}">Home</a></li>
            <li><a href="reviewForumResult">reviews</a></li>
            <li><a href="bookForumInput">Submit a Review</a></li>
            
       
        </ul>
    </nav>