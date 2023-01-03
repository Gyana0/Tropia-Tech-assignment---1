<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create lead</title>

</head>
<body>
	<h2>Create user here....</h2>
	<form action="saveUser" method="post">
		<pre>
	FirstName      <input type="text" name="firstName" required placeholder="gyana"/>
	LastName       <input type="text" name="lastName" placeholder="com"/>
	Date of Birth  <input type="text" name="dateOfBirth" placeholder="Your DOB"/>
	Username       <input type="text" name="username" placeholder="Your DOB"/>
	Email          <input type="email" name="email" required placeholder="gyana@gmail.com"/>
	                   <input type="submit" value="save" class="btn btn-outline-success"/>
	</pre>
	${msg}
		</form>
</body>
</html>