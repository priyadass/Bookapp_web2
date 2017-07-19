<%@page import="com.priya.user.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Order Books</h2>
<Form action="OrderServlet">
<%			User user=(User)session.getAttribute("Logged_in_user");
 %>
 welcome<%=user.getName() %>
<input type="hidden" name="userid" value="<%=user.getId() %>"autofocus required></br>
Select book;m
<select name="bookid" required></br>
<option value="1">Java</option>
<option value="2">Adc</option>

</select>
</br>
Quantity:<input type="number" name="quantity" required></br>
<button type="submit">submit</button>

</Form>

</body>
</html>