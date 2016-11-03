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
        <h1>SQuirrel Party for Dummmies</h1>
        <p>Tasdasdsaaed 4.6 billion years ago from the gravitational collapse of a giant interstellar molecular cloud. The vast majority of the system's mass is in the Sun, with most of the remaining mass contained in Jupiter. The four smaller inner planets, Mercury, Venus, Earth and Mars,
         are terrestrial planets, being primarily composed of rock and metal. The four outer
          planets are giant planets, being substantially more massive than the terrestrials. </p>
          
    </header>
    <nav>
        <h2>Looks whos Talking</h2>
        <p> Use these state of the art web applications to learn more about the Squrriels! </p>
        <ul>
            <li><a href="reviews">reviews</a></li>
            <li><a href="submitReviews">Submit a Review</a></li>
       
        </ul>
    </nav>