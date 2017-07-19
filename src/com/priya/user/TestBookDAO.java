package com.priya.user;

import java.time.LocalDate;
import java.util.List;

public class TestBookDAO
{

	 public static void main(String[] args) throws Exception
	 {
		 LocalDate p=LocalDate.parse("2014-02-10");
	     Book1DAO book=new Book1DAO();
	        List<Books> bookList=book.login();
	        for(Books b:bookList)
	        {
	        	System.out.println(b);
	        }

		 
	 }

}
