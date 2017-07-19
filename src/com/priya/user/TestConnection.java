package com.priya.user;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class TestConnection {
 
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
 
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "password");
        System.out.println(conn);
 
    }
 
}