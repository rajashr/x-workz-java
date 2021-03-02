package com.xworkz.music.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ImplDAO implements DAO{

	@Override
	public void save(DTO dto) {

Connection conn=null;
			
			String url="jdbc:mysql://localhost:3306/userinfo";
			String username="root";
			String password="root123";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				 conn=DriverManager.getConnection(url, username, password);
				//conn.setAutoCommit(false);
				String songQuery="insert into info values (?,?,?,?);";
				PreparedStatement prep1=conn.prepareStatement(songQuery);
				prep1.setInt(1, dto.getId());
				prep1.setString(2, dto.getUser());
				
				prep1.setString(3, dto.getPassword());
				
				prep1.setString(4, dto.getEmail());
				
				int res=prep1.executeUpdate();
			
				System.out.println(res);
				
				
				//conn.commit();
				
				
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			
		
		
	}

	@Override
	public boolean checkId(String newemail) {
		Connection conn=null;
		
		String url="jdbc:mysql://localhost:3306/userinfo";
		String username="root";
		String password="root123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 conn=DriverManager.getConnection(url, username, password);
			 String query2="select COUNT(*) from info where exists(select * from info where email_id=?)";
			 PreparedStatement prep5=conn.prepareStatement(query2);
			 prep5.setString(1, newemail);
			 ResultSet result=prep5.executeQuery();
			 int rows=0;
			 while(result.next()) {
				 rows=result.getInt(1);
			 }if(rows>=1) {
				 return true;
			 }else {
				 return false;
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

		return false;
	}



}
