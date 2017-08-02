<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Add book</title>
</head>
<body>

<form action="AddbookServlet">

Name:<input type="text"name="name"required autofocus>
Price:<input type="number"name="Price"required>
PublishedDate:<input type="Date"name="Publisheddate" required>
<button type="submit">Add book</button>
</form>




</body>
</html>