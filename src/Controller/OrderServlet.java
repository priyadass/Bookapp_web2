package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.priya.user.BookOrder;
import com.priya.user.BookorderDAO;

@WebServlet("/DeliverServlet")
public class OrderServlet extends HttpServlet
{

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   {

   PrintWriter out=response.getWriter();
   out.println("DeliverServlet");
	String userid=request.getParameter("userid");
	String bookid=request.getParameter("bookid");
	String quantity=request.getParameter("quantity");
	System.out.println("User Id=" + userid+", BooksId="+ bookid+", quantity="+ quantity);
	
	int u=Integer.parseInt(userid);
	int b=Integer.parseInt(bookid);
	int q=Integer.parseInt(quantity);
	
	BookOrder bookorder=new BookOrder();
	bookorder.setUserId(u);
	bookorder.setBooksId(b);
	bookorder.setQuantity(q);
	bookorder.setStatus("Delivered");
	out.println("bookorder");
	
BookorderDAO bookorderdao =new BookorderDAO();
try {
	bookorderdao.register(bookorder);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


   }
	
	
}


