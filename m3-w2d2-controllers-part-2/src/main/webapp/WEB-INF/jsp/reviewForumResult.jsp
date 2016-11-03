<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />

<div style="background-color: white">

<h1>Book Review Forum</h1>
		<p><a href="bookForumInput" >Reviews</a></p>
		<div class="posts">
		<c:forEach var='index' items='${allReviews}' begin="0" end="${allReviews.size()-1}"> 
  			
  			  <div  class="post">
  			 <h2>${index.title} </h2>
  			<c:set var="starCount" scope="page" value="${index.rating }"/>
  			<c:set var="stars" scope="page" value="img/star.png"/>
  			 <c:forEach var="v" begin="1" end="${starCount}">
    			<img src="img/star.png"/>
				</c:forEach>
				
			<p> ${index.rating } </p>
  			 <h3> by: ${index.username} Time ${index.dateSubmitted }</h3>
  			 <p> Message: ${index.text } </p>
  			  </div>
  			
		</c:forEach>

		 </div>


<c:import url="/WEB-INF/jsp/footer.jsp" />