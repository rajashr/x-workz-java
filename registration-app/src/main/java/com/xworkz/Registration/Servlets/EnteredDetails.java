package com.xworkz.Registration.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.Registration.dao.UserInfoDAO;
import com.xworkz.Registration.dao.UserInfoDAOImpl;
import com.xworkz.Registration.dto.UserInformationDTO;
import com.xworkz.Registration.service.UserServiceDAO;
import com.xworkz.Registration.service.UserServiceImpl;

public class EnteredDetails extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName=req.getParameter("firstName");
		String LastName=req.getParameter("lastName");
		String UserName=req.getParameter("userName");
		String Password=req.getParameter("password");
		System.out.println(firstName);
		System.out.println(LastName);
		System.out.println(UserName);
		System.out.println(Password);
		UserInformationDTO userInfoDTO=new UserInformationDTO(firstName, LastName, UserName, Password);
		//UserInfoDAO dao=new UserInfoDAOImpl();
		//dao.saveUserDetails(dto);
		UserInfoDAO dao=new UserInfoDAOImpl();
		UserServiceDAO servicedao=new UserServiceImpl(dao);
		servicedao.validateAndSave(userInfoDTO);
	}

}
