<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h3>user details!</h3>

	<P>The time on the server is ${serverTime}.</p>

	<form >
		<p> User Id :   ${userId}</p>
		<p> User Name : ${userName}</p>
		<p> User age :  ${userAge}</p>
		
		 <a href:"/spring_mvc_hibernate/delete/"${user.id}>delete</a> 
		  <a href:"/spring_mvc_hibernate/delete/"${user.id}>delete</a> 
		 
	</form>
</body>
</html>