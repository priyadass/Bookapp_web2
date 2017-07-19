package com.priya.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;





public class UserDAO {
	public void register (User user)throws Exception,Exception{
	Connection con=ConnectionUtil.getConnection();
	String sql="insert into User(name,email,password)values(?,?,?)";
	PreparedStatement pst=con.prepareStatement(sql);
	pst.setString(1, user.getName());
	pst.setString(2, user.getEmail());
	pst.setString(3, user.getPassword());
	int rows=pst.executeUpdate();
	System.out.println(rows);
	}
    public User login(String email, String password) throws Exception {
	//public static void main(String[] args) throws Exception {
		
	
    	Connection con=ConnectionUtil.getConnection();
    	String sql="select id,name,email,password from User where email = ? and password = ?";
        PreparedStatement pst=con.prepareStatement(sql);
        pst.setString(1,email);
        pst.setString(2,password);
        User user=null;
        ResultSet rs=pst.executeQuery();
        if(rs.next()){
        	int id=rs.getInt("id");
        	String Name=rs.getString("name");
        	String Email=rs.getString("email");
        	String Password=rs.getString("password");
        	user=new User();
        	user.setId(id);
        	user.setName(Name);
        	user.setEmail(Email);
        	user.setPassword(Password);
        }
        System.out.println(user);

       return user;
        
      
 
    }



	

}
