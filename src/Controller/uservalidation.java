package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




	

	public class uservalidation {

		public static void validateLoginFields(String email, String password) throws Exception {

			if (email == null || email.equals("") || email.trim().equals("")) {
				throw new Exception("Email cannot be empty");
			} else if (password == null || password.equals("") || password.trim().equals("")) {
				throw new Exception("password cannot be empty");
			}

		}
	}

