package com.xworkz.happyyou;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.music.dao.ValidationDAO;
import com.xworkz.music.dto.InformationDTO;
import com.xworkz.music.impl.ValidationDAOImpl;

public class Connector {

	@Override
	public void save(InformationDTO dto) {
		String url="jdbc:mysql://localhost:3306/userinfo";
		String username="root";
		String pass="root123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url, username, pass);
			String songQuery="insert into information  values (?,?,?,?,?);";
			PreparedStatement prep=conn.prepareStatement(songQuery);
			prep.setInt(1, dto.getInfoId());
			prep.setString(2, dto.getUsername());
			prep.setString(3, dto.getPassword());
			prep.setString(4, dto.getMobileNo());
			prep.setString(5, dto.getEmail());
			
			
			int res=prep.executeUpdate(songQuery);
			System.out.println(res);
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public static void main(String[] args) {
		ValidationDAO dao=new ValidationDAOImpl();
		InformationDTO dto=new InformationDTO("uhj", "7889", "email.com", "67890", 8);
		dao.save(dto);
	}
	
		
	
}
