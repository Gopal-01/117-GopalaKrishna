<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>users list</h1>

<form action="" method="post">

<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>age</th>
		</tr>
		<c:forEach items="${uList}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.userName}</td>
				<td>${user.userAge}</td>
				<td><a href="/spring_mvc_hibernate/update/"${user.id} >Update</a></td>
				<td><a href="/spring_mvc_hibernate/delete/"${user.id} >Delete</a></td>
			</tr>
		</c:forEach>
	</table>

    
</form>
 

</body>
</html>