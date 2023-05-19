package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Connect {
	
	static String url,user,password;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			ResourceBundle a=ResourceBundle.getBundle("rau");
			
			url=a.getString("url");
			user=a.getString("user");
			password=a.getString("password");
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	static Connection getco() throws SQLException {
		return DriverManager.getConnection(url,user,password);
	}
	
	
	static void closeco(Connection c) throws SQLException {
		if(c!=null) {
			c.close();
		}
		
	}
	
	
	

}
