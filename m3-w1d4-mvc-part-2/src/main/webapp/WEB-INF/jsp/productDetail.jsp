<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="productHeader.jsp" %>
	<c:set var="ID" value="${param.productId}" />
        <img class="detailview" src="img/${product.imageName}"/>
        <div class="detailview">
        <p><b>${product.name}</b> <p id=bestSeller><c:if test="${product.topSeller == true}"> BEST SELLER!</c:if></p> </p]>
		<table>
			<tbody>
			<c:choose>
				<c:when test="${products.averageRating < 2}">
					<td><img class="stars" src="img/1-star.png" /></td>
				</c:when>
				<c:when test="${products.averageRating < 3}">
					<td><img class="stars" src="img/2-star.png" /></td>
				</c:when>
				<c:when test="${products.averageRating < 4}">
					<td><img class="stars" src="img/3-star.png" /></td>
				</c:when>
				<c:when test="${products.averageRating < 5}">
					<td><img class="stars" src="img/4-star.png" /></td>
				</c:when>
				<c:otherwise>
					<td><img class="stars" src="img/5-star.png" /></td>
				</c:otherwise>
			</c:choose>	
			</tbody>
		</table>
        <p> by ${product.manufacturer}</p>

		<h4 id=price>${product.price}</h4>
		<p><b>Weight:</b> ${product.weightInLbs} lbs</p>
        <p>${product.description}</p>
		</div>
		<div class="line">   </div>
        <a href="productTable">Back to Table</a>


<%@include file="productFooter.jsp" %>