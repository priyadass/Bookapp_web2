package com.priya.user;

public class TestUserDAO {
	 
	    public static void main(String[] args) throws Exception {
	 
	       // User user = new User();
	        //user.setName("priya");
	        //user.setEmail("priya336");
	        //user.setPassword("ani");
	 
	        UserDAO userDAO = new UserDAO();
	       String email="priya336";
	       String password="ani";
	       User user= userDAO.login(email,password);
	       System.out.println(user);
	 
	    }
	 
	}


