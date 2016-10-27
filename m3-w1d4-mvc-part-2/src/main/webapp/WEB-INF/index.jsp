<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>MVC Views Part 2</title>
		
		<style>
			* {
				font-size: 14pt;
			}
		
			td {
				border: 1px solid black;
				padding: .5em;
			}
			
			code {
				color: red;
			}
		</style>
	</head>
	<body>
		<h1>MVC Views Part 2</h1>
		<table>
			<tr>
				<td><a href="productList">Product List</a></td>
				<td>
					Check out <code>ProductController.java</code> and <code>productList.jsp</code> 
					for a simple example of using "request attributes" to pass data between 
					a controller (i.e. Servlet) and a view (i.e. JSP).
				</td>
			</tr>
			<tr>
				<td><a href="productList">Product Table</a></td>
				<td>
					Check out <code>ProductController.java</code> and <code>productTable.jsp</code> 
					for a simple example of using "request attributes" to pass data between 
					a controller (i.e. Servlet) and a view (i.e. JSP).
				</td>
			</tr>
			<tr>
				<td><a href="productList">Product Tiles</a></td>
				<td>
					Check out <code>ProductController.java</code> and <code>productTiles.jsp</code> 
					for a simple example of using "request attributes" to pass data between 
					a controller (i.e. Servlet) and a view (i.e. JSP).
				</td>
			</tr>
				
		</table>
	</body>
</html>