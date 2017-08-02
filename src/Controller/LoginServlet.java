package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.priya.user.User;
import com.priya.user.UserDAO;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		User user=null;
		out.println("LoginServlet");
	
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		UserDAO userdao=new UserDAO();
		try {
			user=userdao.login(email, password);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		out.println(user);
		if(user==null)
		{		                request.setAttribute("error message","invalid login");
		                RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
		                dispatcher.forward(request,response);
		                
		}
		else
		{
			HttpSession session=request.getSession();
			session.setAttribute("Logged_in_user",user);
			response.sendRedirect("ListBooks.jsp");
		}
		
		 
          	
    }
	}
	

	


