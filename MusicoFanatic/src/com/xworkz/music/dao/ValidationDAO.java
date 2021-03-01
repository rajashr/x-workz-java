package com.xworkz.music.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.xworkz.music.dto.InformationDTO;

public interface ValidationDAO {
	//public boolean checkEmailId();
	//write a method to check whether a email id is there in dataBase or not
	//Connection connectToDB() throws SQLException;
	public void save(InformationDTO dto);

}
