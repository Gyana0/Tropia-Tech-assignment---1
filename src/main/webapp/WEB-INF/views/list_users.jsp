<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All users</title>
</head>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
	text-align: left;
}
</style>
<body>

	<table>

		<tr>
			
			<th>First Name</th>
			<th>Last Name</th>
			<th>Date of Birth</th>
			<th>User Name</th>
			<th>email</th>
			<th> </th>

		</tr>
		<tr>
			
			<td>
				<table>
					<c:forEach var="user" items="${user}">
						<tr>
							<td>${user.firstName}</td>
						</tr>
					</c:forEach>
				</table>
			</td>
			<td>
				<table>
					<c:forEach var="user" items="${user}">
						<tr>
							<td>${user.lastName}</td>
						</tr>
					</c:forEach>
				</table>
			</td>
			<td>
				<table>
					<c:forEach var="user" items="${user}">
						<tr>
							<td>${user.dateOfBirth}</td>
						</tr>
					</c:forEach>
				</table>
			</td>
			<td>
				<table>
					<c:forEach var="user" items="${user}">
						<tr>
							<td>${user.username}</td>
						</tr>
					</c:forEach>
				</table>
			</td>
			<td>
				<table>
					<c:forEach var="user" items="${user}">
						<tr>
							<td>${user.email}</td>
						</tr>
					</c:forEach>
				</table>
			</td>
			<td>
				<table>
					<c:forEach var="user" items="${user}">
						<tr>
							<td><a href="delete?id=${user.id}">Delete</a>/<a
								href="update?id=${user.id}">Edit</a></td>
						</tr>
					</c:forEach>
				</table>
			</td>
			
			</tr>
	</table>






</body>
</html>