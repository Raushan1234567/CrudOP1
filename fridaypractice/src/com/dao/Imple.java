package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dto.Student;
import com.exception.Something;

public class Imple implements Interface{

	@Override
	public void adddata(Student a) {
		
		Connection c=null;
		
		try {
			c=Connect.getco();
			
			String q="insert into student values(?,?,?)";
			
			PreparedStatement u=c.prepareStatement(q);
			
			u.setInt(1, a.getRool());
			u.setString(2, a.getName());
			u.setString(3, a.getAddress());
			
			u.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void Delete(int roll) throws Something {
	
		Connection c=null;
		
		try {
			c=Connect.getco();
			
			String q="Delete from student where roll=?";
			
			PreparedStatement ps=c.prepareStatement(q);
			
			ps.setInt(1, roll);
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			 throw new Something("some thing went wrong ");
		}
		
	}

}
