package com.priya.user;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class BookorderDAO {
	public void register (BookOrder order)throws Exception,Exception{
		Connection con=ConnectionUtil.getConnection();
		LocalDate p=LocalDate.parse("2014-02-10");
		String sql="insert into Bookorder(User_id,Books_id,status,quantity,Order_date)values(?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1,order.getUserId());
		pst.setInt(2,order.getBooksId());
		pst.setString(3,order.getStatus());
		pst.setInt(4,order.getQuantity());
		pst.setDate(5,Date.valueOf(p));
		int rows=pst.executeUpdate();
		System.out.println(rows);
		}
	
	public List<BookOrder> login() throws Exception

	{
		Connection con=ConnectionUtil.getConnection();
		String sql="select id,user_id,Books_id,Status,quantity,order_Date from Bookorder ";
		PreparedStatement pst=con.prepareStatement(sql);
		List<BookOrder>orderList=new ArrayList<BookOrder>();
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			int Id=rs.getInt("id");
			int userId=rs.getInt("user_id");
			int BookId=rs.getInt("Books_id");
			String status=rs.getString("Status");
			int quantity=rs.getInt("Quantity");
			Timestamp order_date=rs.getTimestamp("order_date");
			BookOrder order=new BookOrder();
			order.setId(Id);
			order.setUserId(userId);
			order.setBooksId(BookId);
			order.setStatus(status);
			order.setQuantity(quantity);
			order.setOrderdate(order_date.toLocalDateTime());
			
			
			orderList.add(order);
		}
		System.out.println(orderList);
		
		return orderList;

		
		
	}
	    
}
