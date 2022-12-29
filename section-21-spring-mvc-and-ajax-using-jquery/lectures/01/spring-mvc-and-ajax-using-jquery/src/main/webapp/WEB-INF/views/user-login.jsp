<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User login</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script>

$(document).ready(function() {
	console.log("ready function called");
	$("#userId").change(function() {
		console.log("on change function called");
		$.ajax(
			{
				url: "users/id/validation",
				data: {
					id: $("#userId").val()
				},
				success: function(responseText) {
					$("#errorMessage").text(responseText);
					
					if (responseText != "") {
						$("#userId").focus();
					}
				}
			}
		);
	});
});

</script>
</head>
<body>

<form action="registerUser" method="post">
<pre>
Please enter your desired id: <input type="text" name="id" id="userId"/>
<span style="color:#cc0000" id="errorMessage"></span>
Please enter your name: <input type="text" name="name"/>
Please enter your email: <input type="text" name="email"/>
<input type="submit" name="register"/>
</pre>

</form>

<p><%
String message = (String) request.getAttribute("message");
if (message != null) out.println(message); %></p>

</body>
</html>