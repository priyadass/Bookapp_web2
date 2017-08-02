<!DOCTYPE HTML>
<html>
<head>
<title> Bookapp_register</title>
</head>
<body>

<h2>BOOK APPLICATION</h2>

<h2>Login</h2>

<form action="LoginServlet">
<% String message=(String)request.getAttribute("error message");
if( message!=null);
{
	out.println( message);
}
%>
Email:<input type="email"name="email" required autofocus>
password:<input type="password"name="password" required>
<button type="submit">login</button>

</form> 

<a href="Register.html">create account</a>
</body>
</html>