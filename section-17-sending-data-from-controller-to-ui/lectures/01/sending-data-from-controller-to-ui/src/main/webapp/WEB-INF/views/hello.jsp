<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
<h1>Hello, stranger... I am on a quest</h1>
<p>I am <b><% out.println(request.getAttribute("name")); %></b>. I possess a unique Identifier which is <b><% out.println(request.getAttribute("id")); %></b>
 and, in case you were wondering, I usually collect around <b><% out.println(request.getAttribute("salary")); %></b> souls per day while exploring the archives.
 
 <!-- This doesn't work, for some reason
 <p>I am <b>${name}</b>. I possess a unique Identifier which is <b>${id}</b>
 and, in case you were wondering, I usually collect around <b>${salary}</b> souls per day while exploring the archives.
</p>
 -->
</body>
</html>