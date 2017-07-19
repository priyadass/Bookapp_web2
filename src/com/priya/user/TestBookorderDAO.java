package com.priya.user;

import java.time.LocalDate;
import java.util.List;

public class TestBookorderDAO{
	public static void main(String[] args) throws Exception
	{
		LocalDate p=LocalDate.parse("2014-05-10");
		BookOrder order=new BookOrder();
		order.setUserId(1);
		order.setBooksId(1);
		order.setStatus("Delivered");
		order.setQuantity(1);
		order.setOrderdate(p);
		
		
		
	BookorderDAO book=new BookorderDAO();
			//book.register(order);
			//System.out.println(book);
	 List<BookOrder> bookList=book.login();
 book.login();
     for(BookOrder b:bookList)
     {
    	System.out.println(b);
     }
}
}

