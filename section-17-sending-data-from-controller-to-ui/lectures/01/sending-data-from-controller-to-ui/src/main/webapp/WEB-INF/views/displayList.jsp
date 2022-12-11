<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.example.Employee,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Employee> employees = (List<Employee>) request.getAttribute("employees");

for (Employee e: employees) {
	// dosn't print the new lines, for some reason
	String format = "\nEmployee:\nId: %s\nName: %s\nSalary: %s\n";
	out.print(String.format(format, e.getId(), e.getName(), e.getSalary()));
}
%>
</body>
</html>