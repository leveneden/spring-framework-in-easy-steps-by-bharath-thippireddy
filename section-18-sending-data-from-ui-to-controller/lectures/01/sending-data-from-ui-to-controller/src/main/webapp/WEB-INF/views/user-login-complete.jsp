<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.example.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User registered</title>
</head>
<body>
<h2>User registered successfully!</h2>
<p>User details are:</p>
<% User user = (User) request.getAttribute("user"); %>
<p>Id: <% out.println(user.getId()); %>
<br/>Name: <% out.println(user.getName()); %>
<br/>Email: <% out.println(user.getEmail()); %></p>
</body>
</html>