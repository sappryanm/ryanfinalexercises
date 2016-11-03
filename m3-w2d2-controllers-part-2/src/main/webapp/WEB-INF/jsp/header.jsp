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
    		<c:url value="/img/ssg_logo.png" var="logoSrc" />
        <a href="${homePageHref}">
        		<img src="${logoSrc}" alt="Solar System Geek logo" />
        </a>
        <h1>Squirrel Party for Dummmies</h1>
        <p>Tasdasdsaaed 4.6 bil. </p>
          
    </header>
    <nav>
        <h2>Looks whos Talking</h2>
        <p> Use these state of the art web applications to learn more about the Squrriels! </p>
        <ul>
            <li><a href="reviewForumResult">reviews</a></li>
            <li><a href="bookForumInput">Submit a Review</a></li>
       
        </ul>
    </nav>