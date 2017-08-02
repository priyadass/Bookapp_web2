package com.priya.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {

	public static void main(String[] args) throws Exception {

		//Connection con = getConnection();
		//System.out.println(con);

	}
	/*

	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book1", "root", "root");
		System.out.println(con);
		return con;
	}*/
	public static DataSource getDataSource()
	{
           BasicDataSource ds = new BasicDataSource();
           ds.setDriverClassName("com.mysql.jdbc.Driver");
           
           ds.setUrl("jdbc:mysql://35.154.162.204:3337/kvcet_priya_db");
           ds.setUsername("kvcet_priya");
           ds.setPassword("kvcet_priya");     
           return ds;

}

	public static JdbcTemplate getJdbcTemplate(){
	
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		DataSource dataSource = getDataSource();
		jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate;
}
}
