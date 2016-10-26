<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 1 - FizzBuzz</title>
		<style>
			li {
				list-style-type: none;
			}
			
			.fizz {
				color: blue;
			}
			
			.buzz {
				color: red;
			}
			
			.fizzbuzz {
				color: purple;
				font-size: 150%;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 1 - FizzBuzz</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) containing each of the numbers from 1 to 100.
				
				if the number is divisible by 3, show "Fizz!" instead and style the item using the "fizz" class
				
				if the number is divisible by 5, show "Buzz!" instead and style the item using the "buzz" class
				
				if the number is divisible by both 3 and 5, show "FizzBuzz!" instead  and style the item using the "fizzbuzz" class
				
				see exercise1-fizzbuzz.png for example output
				if(num>5)num=1;

				scanf("%s",s);
				sprintf(count,"%d",i);

				if((i%3!=0&& i%5!=0 &&strcmp(s,count)!=0)||
					(i%15==0 && strcmp(s,"FizzBuzz")!=0)||
					(i%3==0 && strcmp(s,"Fizz")!=0)||
					(i%5==0 && strcmp(s,"Buzz")!=0)){//fizzbuzz check
						member[num]=0;
				}
				num++;
						<c:set var="rowClassAttribute" value="li" /> 
			 --%>
	
		<c:forEach begin="1" end="100" var="index">	
<%--
		<c:if test="${index % 15 == 0}">
					<c:set var='li' value='fizzbuzz' />
				</c:if>
		<c:if test="${index % 3 == 0}">
					<c:set var='li' value='fizz' />
				</c:if>
		<c:if test="${index % 5 == 0}">
			<c:set var='li' value='buzz' />
			
		</c:if>		
		--%>
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
		</ul>
	</body>
</html>