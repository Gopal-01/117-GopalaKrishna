<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>


<body>
	<h1>update page:</h1>

	<div align="center">

	<form action="/spring_mvc_hibernate/updating"  method="POST">
	<table>
			<tr>
				<td>id: ${Id}</td>
				<td>age: <input type="text" name="userAge" value="${userAge}" ></td>
				<td>name: <input type="text" name="userName" value="${userName}"></td>
			</tr>
			
		</table>	
		<input type=hidden id="id" name="Id" value="${Id}"/>
		 <input type="submit" value="Update">
		
	</form>
	</div>
</body>
</html>
