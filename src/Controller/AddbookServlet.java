package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.priya.user.Book1DAO;
import com.priya.user.Books;


@WebServlet("/AddbookServlet")
public class AddbookServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
	out.println("AddbookServlet");
		
	    
	    String name=request.getParameter("name");
	    
		String Price=request.getParameter("Price");
		String publisheddate=request.getParameter("Publisheddate");
		
		out.println("name");
		out.println("Price");
		out.println("Publisheddate");
		
		int p=Integer.parseInt(Price);
	    LocalDate d=LocalDate.parse(publisheddate);
	
		
		Books book=new Books();
		book.setName(name);
		book.setPrice(p);
		book.setPublisheddate(d);
		out.println(book);
		
		Book1DAO bookdao=new Book1DAO();
		try {
			bookdao.register(book);
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//response.sendRedirect("Add book.jsp");
		
		

	
	}
}


