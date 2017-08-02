package Controller;

public class Testuservalidation{
	

	public static void main(String[] args) {
	
		String email = "sd,sadm,";
		String password =" ss";
		
		try {
			uservalidation.validateLoginFields(email, password);
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
