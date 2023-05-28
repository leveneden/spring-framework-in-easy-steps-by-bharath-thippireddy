<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "java.util.List,org.example.user.entity.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
</head>
<body>
<%
List<User> users = (List<User>) request.getAttribute("users");
if (users != null && !users.isEmpty()) {
	
	for (User user: users) {
		out.println(user + " --- ");
	}
}

%>
</body>
</html>