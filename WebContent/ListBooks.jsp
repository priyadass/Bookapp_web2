<!DOCTYPE HTML>
 <%@page import="com.priya.user.User"%>
<%@page import="com.priya.user.Books"%>
<%@page import="com.priya.user.Book1DAO"%>
<%@page import="java.util.List"%>
<html>
		<head>
			<title>List books</title>
			</head>
			<body>
			<% User user=(User)session.getAttribute("Logged_in_user");
			%>
			welcome<%=user.getName()
			%>!!!
			<a href="LogoutServlet">Logout</a>
			
		
	<h3>List Books</h3>
				<%
				Book1DAO bookdao=new Book1DAO();
				List<Books>bookList=bookdao.listBooks();
				//out.println("Books:"+bookList);
			%>
			<table border="1">
				<thead><tr>
	<th>id</th>
	<th>name</th>
	<th>price</th>
	<th>published date</th>
	</tr>
	</thead>
	<tbody>
	
			

<%
	for(Books b:bookList)
	{
		out.println("<tr>");
		out.println("<td>"+b.getId()+"</td>");
		out.println("<td>"+b.getName()+"</td>");
		out.println("<td>"+b.getPrice()+"</td>");
		out.println("<td>"+b.getDate()+"</td>");
		out.println("</tr>");
		
	}
%>		   
<body>
   
</tbody>
</table>
 	</body>
</html>