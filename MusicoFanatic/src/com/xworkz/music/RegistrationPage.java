package com.xworkz.music;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.music.dao.ValidationDAO;
import com.xworkz.music.dto.InformationDTO;


public class RegistrationPage extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//InformationDTO dto=new InformationDTO("uname", "pass", "email", "phoneNo",5);
	InformationDTO dto1=new InformationDTO(req.getParameter("uname"),req.getParameter("pass"),
				req.getParameter("email"),req.getParameter("phoneNo"),5);
		
		
		
//		ValidationDAO dao=new ValidationDAOImpl();
//		dao.save(dto1);
//		
		ValidationDAO dao=new Tester();
		//InformationDTO dto=new InformationDTO("rani", "67889", "rajashtrr@gmail.com", "678998777", 10);
		dao.save(dto1);
	
		
		
	}

}
