package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestOrderValidation {
	
	



			public static void main(String[] args) {

				String bookId = "123";
				String quantity = "";
				
				try {
					Ordervalidation.validateOrder(bookId, quantity);
					System.out.println("Success");
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}

			}

		

		
		
	
	}


