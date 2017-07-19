<%@page import="com.priya.user.BookOrder"%>
<%@page import="com.priya.user.Books"%>
<%@page import="java.util.List"%>
<%@page import="com.priya.user.BookorderDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Order</title>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<h3>List Books</h3>
	
				<%
				BookorderDAO bookdao=new BookorderDAO();
				List<BookOrder>bookorderList=bookdao.login();
				out.println("Books:"+bookorderList);
			%>
			<table border="1">
				<thead><tr>
	
	<th>UserId</th>
	<th>BooksId</th>
	<th>status</th>
	<th>quantity</th>
	<th>Order date</th>
	</tr>
	
	<tbody>
	
			

<%
	for(BookOrder b:bookorderList)
	{
		out.println("<tr>");
		out.println("<td>"+b.getUserId()+"</td>");
		out.println("<td>"+b.getBooksId()+"</td>");
		out.println("<td>"+b.getQuantity()+"</td>");
		out.println("<td>"+b.getStatus()+"</td>");

		out.println("<td>"+b.getOrderdate()+"</td>");

		out.println("</tr>");
		
	}
%>		   
</tbody>
</table>

</body>
</html>