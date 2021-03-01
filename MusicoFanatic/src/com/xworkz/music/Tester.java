package com.xworkz.music;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.music.dao.*;
import com.xworkz.music.dto.InformationDTO;

	public class Tester implements ValidationDAO{

		

		@Override
		public void save(InformationDTO dto) {
Connection conn=null;
			
			String url="jdbc:mysql://localhost:3306/userinfo";
			String username="root";
			String password="root123";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				 conn=DriverManager.getConnection(url, username, password);
				//conn.setAutoCommit(false);
				String songQuery="insert into information values (?,?,?,?,?);";
				PreparedStatement prep1=conn.prepareStatement(songQuery);
				prep1.setInt(1, dto.getInfoId());
				prep1.setString(2,dto.getUsername());
				prep1.setString(3, dto.getPassword());
				prep1.setString(4, dto.getMobileNo());
				prep1.setString(5, dto.getEmail());
				
				int res=prep1.executeUpdate();
			
				System.out.println(res);
				
				
				//conn.commit();
				
				
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			
		}
		public static void main(String[] args) {
			ValidationDAO dao=new Tester();
			InformationDTO dto=new InformationDTO("rani", "67889", "rajashtrr@gmail.com", "678998777", 16);
			dao.save(dto);
		}

	}


	


