package com.priya.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.jdbc.core.JdbcTemplate;





public class UserDAO {
	private JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
	public void register (User user)throws Exception,Exception
	{
	String sql="insert into User(name,email,password)values(?,?,?)";
	Object[] params={user.getName(),user.getEmail(),user.getPassword()};
	
	
	int rows=jdbcTemplate.update(sql,params);
	System.out.println(rows);
	}
    public User login(String email, String password) throws Exception {
	//public static void main(String[] args) throws Exception {
		
	
    	String sql="select id,name,email,password from User where email = ? and password = ?";
    	Object[] params={email,password};
    	User user=jdbcTemplate.queryForObject(sql, params,(rs,rowno)->{
    		
        	int id=rs.getInt("id");
        	String Name=rs.getString("name");
        	String Email=rs.getString("email");
        	String Password=rs.getString("password");
        	
        	User user1=new User();
        	user1.setId(id);
        	user1.setName(Name);
        	user1.setEmail(Email);
        	user1.setPassword(Password);
        
        

       return user1;
    	});
    	return user;
    }
}
      
 
    



	


