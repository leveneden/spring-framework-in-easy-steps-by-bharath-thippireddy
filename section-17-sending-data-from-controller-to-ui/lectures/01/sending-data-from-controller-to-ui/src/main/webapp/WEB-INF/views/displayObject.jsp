<%@page import="org.example.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mirio the Great Hero</title>
</head>
<body>
<h1>Hello, stranger... My name is Togata Mirio!</h1>
<%
org.example.Employee mirio = (org.example.Employee) request.getAttribute("employee");
%>
<p>I am <b><% out.println(mirio.getName()); %></b>. I possess a unique Identifier which is <b><% out.println(mirio.getId()); %></b>
 and, in return for being a hero, I get paid <b><% out.println(mirio.getSalary()); %></b> JPY a year.
 
</body>
</html>