package com.xworkz.musicapp.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.xworkz.musicapp.dto.UserInfoDTO;

public interface UserDAO {
	Connection getConnection() throws SQLException ;
	public boolean verifyMail();
	public void save(UserInfoDTO dto);

}
