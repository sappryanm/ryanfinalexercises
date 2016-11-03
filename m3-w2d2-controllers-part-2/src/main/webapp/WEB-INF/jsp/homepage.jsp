<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />

<section id="inner-planets" class="planets">
    <h1>The Book </h1>
    <section class="planet">
        <h2>SqurrielsForDummies</h2>
        
		<img src=img/forDummies.png alt="Mercury">
        <p> I love Squrirresl!!!!!!!!!!!!!!ight planets in the Solar System, with an orbital period of about 88 Earth days. Seen from Earth, it appears to move around its orbit in about 116 days, which is much faster than any other planet in the Solar System. It has no known natural satellites. The planet is named after the Roman deity Mercury, the messenger to the gods.</p>
        <p>Mercury is gravitationally locked and rotates in a way that is unique in the Solar System. As seen relative to the fixed stars, it rotates on its axis exactly three times for every two revolutions it makes around the Sun. As seen from the Sun, in a frame of reference that rotates with the orbital motion, it appears to rotate only once every two Mercurian years. An observer on Mercury would therefore see only one day every two years.</p>
    </section>

</section>
    <div style="background-color: white">
        <h2>Read Reviews</h2>
        
        <div>

 			<iframe name="reviewForumResult" src="reviewForumResult" width=100%>
 		</div>	
		<div class="posts">
		<c:forEach var="index" items="${allReviews}" begin="0" end="15" > 
  			
  			  <div  class="post">
  			 <h2>${index.title} </h2>
  			<p> ${index.rating } </p>
  			 <h3> by: ${index.username} Time ${index.dateSubmitted }</h3>
  			 <p> Message: ${index.text } </p>
  			  </div>
  			
 		</c:forEach> 
		 </div>
    </div>


<c:import url="/WEB-INF/jsp/footer.jsp" />