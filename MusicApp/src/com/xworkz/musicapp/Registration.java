package com.xworkz.musicapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.music.dto.DAO;
import com.xworkz.music.dto.DTO;
import com.xworkz.music.dto.ImplDAO;

public class Registration extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("user");
		String password=req.getParameter("pass");
		String email=req.getParameter("emailId");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
		
DTO dto=new DTO(90,username,  password, email);
DAO dao=new ImplDAO();



	if(dao.checkId(email)) {
		RequestDispatcher redirect=req.getRequestDispatcher("RegistrationPage.html");
		redirect.forward(req, resp);
	}else {
		dao.save(dto);
		RequestDispatcher redirect=req.getRequestDispatcher("login");
		redirect.forward(req, resp);
		
	}
		
		

	}

}
