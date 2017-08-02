package com.priya.user;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class Book1DAO 
{
	private JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();

	public void register(Books book)throws Exception
	{
		LocalDate  p=LocalDate.parse("2014-05-19");
		String sql="insert into Books(name,price,publisheddate)values(?,?,?)";
		Object[] params={book.getName(),book.getPrice(),book.getDate()};

		
		
		int rows=jdbcTemplate.update(sql,params);
		System.out.println(rows);
		
	}
		
	//public static void main(String[] args) throws Exception 
	public List<Books> listBooks() throws Exception{
		JdbcTemplate con=ConnectionUtil.getJdbcTemplate();
	
	
		String sql="select id,name,price,publisheddate from Books";
        List<Books> bookList=jdbcTemplate.query(sql,(rs,rowNo)-> {
        
        	int Id=rs.getInt("id");
        	String Name=rs.getString("name");
        	int price=rs.getInt("price");
        	Date publisheddate=rs.getDate("publisheddate");
        	Books book=new Books();
        	book.setId(Id);
        	book.setName(Name);
        	book.setPrice(price);
        	book.setDate(publisheddate.toLocalDate());
        	return book;
        });
        System.out.println(bookList);
        return bookList;
	
        
        //for(Books book:bookList)
       // {
        //	System.out.println(book);
     
        //}
	}
}
