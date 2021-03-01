package com.xworkz.musicapp.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.musicapp.dao.UserDAO;
import com.xworkz.musicapp.dto.UserInfoDTO;

public class UserDAOImpl implements UserDAO{

	@Override
	public  Connection getConnection() throws SQLException {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo", "root", "root123");
			return conn;//if the method return conn due to some syntatical errors it should throw the sqlException
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		throw new SQLException();
	
	}

	@Override
	public boolean verifyMail() {
		return false;
	}

	@Override
	public void save(UserInfoDTO dto) {
		Connection conn=null;
		try {
			conn=getConnection();
			String queryToSave="insert into user values(?,?,?);";
			
			PreparedStatement stmt=conn.prepareStatement(queryToSave);
		   stmt.setString(1, dto.getName());
		   stmt.setString(2, dto.getPassword());
		   stmt.setString(3, dto.getEmailId());
			
			int res=stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
