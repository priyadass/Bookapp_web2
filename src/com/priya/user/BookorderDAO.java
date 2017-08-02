package com.priya.user;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


public class BookorderDAO {
	private JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();

	public void register (BookOrder order)throws Exception,Exception{
				LocalDate p=LocalDate.parse("2014-02-10");
		String sql="insert into Bookorder(User_id,Books_id,status,quantity,Order_date)values(?,?,?,?,?)";
		Object[] params={order.getUserId(),order.getBooksId(),order.getStatus(),order.getQuantity(),order.getOrderdate()};

		int rows=jdbcTemplate.update(sql,params);
		System.out.println(rows);
		}
	
	public List<BookOrder> login() throws Exception{



		String sql="select id,user_id,Books_id,Status,quantity,order_Date from Bookorder ";
        List<BookOrder> orderList=jdbcTemplate.query(sql,(rs,rowNo)-> {

		
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
			
			return order;
		
		});
		System.out.println(orderList);
		
		return orderList;

		
		
	}
	    
}
