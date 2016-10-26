<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
				public static void main (String[] args) {
    int f = 0;
    int g = 1;

    for (int i = 1; i <= 10; i++) {
        System.out.print(f + " ");
        f = f + g;
        g = f - g;
    } 

    System.out.println();
}
fib= a+b
a=b
b = fib;
return fib
public static int fibonacci(int number){ if(number == 1 || number == 2){ return 1; } return fibonacci(number-1) + fibonacci(number -2); //tail recursion }

public static int fibonacci2(int number){ if(number == 1 || number == 2){ return 1; }
 int fibo1=1, fibo2=1, fibonacci=1; for(int i= 3; i<= number; i++)
 { //Fibonacci number is sum of previous two Fibonacci number 
 fibonacci = fibo1 + fibo2; fibo1 = fibo2; fibo2 = fibonacci; } 
 return fibonacci; //Fibonacci number


			 --%>
		<c:set var='fib1' value="0"/>
		<c:set var="fib2" value="1" />
		 <c:set var="fib" value="${fib1 + fib2}" />			
		<c:forEach begin="0" end="25" var="index">	
		<%-- 
		<li>${fib1}</li>
		<li>${fib2}</li>
		 --%>
		 <li> ${fib}</li>
		<c:set var='fib' value="${fib1 + fib2}"/>
		<c:set var="fib1" value="${fib2}" />
		<c:set var="fib2" value="${fib}" />
		

		</c:forEach>
		
		</ul>
	</body>
</html>