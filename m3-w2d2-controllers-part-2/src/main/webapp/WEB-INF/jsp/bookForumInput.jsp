<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />

<div style="background-color: white">
	<form action="bookForumInput" method="POST">
		<label for="spaceForum" style="color: black">Enter Your Username</label><br>
		<input type="text" name="username" id="user"/><br>
		<label for="spaceForum" style="color: black">title</label><br>
		<input type="text" name="title" id="title"/><br>
		<label for="spaceForum" style="color: black">tet</label><br>
		<input type="text" name="text" id="text"/><br>
		<input type="submit" value="Submit">
	</form>
</div>
<c:import url="/WEB-INF/jsp/footer.jsp" />