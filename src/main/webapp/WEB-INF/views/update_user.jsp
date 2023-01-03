<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
	<h2>Update user here....</h2>
	<form action="updateLead" method="post">
		<pre>
		<input type="hidden" name="id" value="${user.id}"/>
	FirstName      <input type="text" name="firstName" value="${user.firstName}" />
	LastName       <input type="text" name="lastName" value="${user.lastName}" />
	Date of Birth  <input type="text" name="dateOfBirth" placeholder="Your DOB"/>
	Username       <input type="text" name="username" placeholder="Your DOB"/>
	Email          <input type="email" name="email" required placeholder="gyana@gmail.com"/>
	                   <input type="submit" value="save" class="btn btn-outline-success"/>
	</pre>
	
		</form>
		
</body>
</html>