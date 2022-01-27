<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
<div align ="center">
<h1> User list</h1>

<table border="1">
		<tr>
			<th>Id</th>
			<th>Age</th>
			<th>Name</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${uList}" var="usr">
			<tr>
				<td>${usr.id}</td>
				<td>${usr.userAge}</td>
				<td>${usr.userName}</td>
				
				<td><a href="/spring_mvc_hibernate/updateuser/${usr.id}">Update</a></td>
				<td><a href="/spring_mvc_hibernate/delete/${usr.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>