package com.priya.user;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Book1DAO 
{
	public void register(Books book)throws Exception
	{
		LocalDate p=LocalDate.parse("2014-05-10");
		Connection con=ConnectionUtil.getConnection();
		String sql="insert into Books(name,price,publisheddate)values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1,book.getName());
		pst.setInt(2,book.getPrice());
		pst.setDate(3,Date.valueOf(p));
	
		
		
		int rows=pst.executeUpdate();
		System.out.println(rows);
		
	}
		
	//public static void main(String[] args) throws Exception 
	public List<Books> listBooks() throws Exception{
	
	
		Connection con=ConnectionUtil.getConnection();
		String sql="select id,name,price,publisheddate from Books";
        PreparedStatement pst=con.prepareStatement(sql);
        List<Books> bookList=new ArrayList<Books>();
        ResultSet rs=pst.executeQuery();
        while(rs.next())
        {
        	int Id=rs.getInt("id");
        	String Name=rs.getString("name");
        	int price=rs.getInt("price");
        	Date publisheddate=rs.getDate("publisheddate");
        	Books book=new Books();
        	book.setId(Id);
        	book.setName(Name);
        	book.setPrice(price);
        	book.setDate(publisheddate.toLocalDate());
        bookList.add(book);
        }
        System.out.println(bookList);
        return bookList;
        //for(Books book:bookList)
       // {
        //	System.out.println(book);
     
        //}
	}
	}
