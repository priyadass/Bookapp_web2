package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

  

	

	
	

		public class Ordervalidation {

			public static void validateOrder(String bookId, String quantity) throws Exception {

				if (bookId == null || bookId.equals("") || bookId.trim().equals("")) {
					throw new Exception("Please select a Book");
				}

				try {
					int bId = Integer.parseInt(bookId);
				}
				catch (Exception e) {
					throw new Exception("Invalid BookId");
				}
			}
		}

					


