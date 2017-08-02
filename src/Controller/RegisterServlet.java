package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.priya.user.User;
import com.priya.user.UserDAO;


 
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet 
{
	//private static final long serialVersionUID = 1L;
    //public RegisterServlet() {
    
    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		out.println("RegisterServlet");
	
	    String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String DOB=request.getParameter("DOB");
		
		//out.println("Name=" +name);
		//out.println("email=" +email);
		//out.println("password=" +password);
		//out.println("DOB=" +DOB);
		
		User user=new User();
    	user.setName(name);
    	user.setEmail(email);
    	user.setPassword(password);
        out.println("User=" +user);
        UserDAO userdao=new UserDAO();
        try {
			userdao.register(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

		
	
	}


	
