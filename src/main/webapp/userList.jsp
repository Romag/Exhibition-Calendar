<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<table title="Users" >
		<caption>Users</caption>
		<c:forEach items="userList">
		
		</c:forEach>
	</table>
	
	
</body>
</html>