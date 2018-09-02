<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
<meta charset="UTF-8">
<title>List of all users</title>
</head>

<body>
	<table title="Users" >
		<caption>Users</caption>
		<c:forEach items="${userList}" var="user">
			<br/> 
			<tr>
				<c:out value="${user.email}"></c:out>
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>