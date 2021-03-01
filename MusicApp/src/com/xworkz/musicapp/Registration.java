package com.xworkz.musicapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("user");
		String password=req.getParameter("pass");
		String email=req.getParameter("emailId");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
		

	if(email.equals("rani@gmail.com") ) {
		RequestDispatcher redirect=req.getRequestDispatcher("RegistrationPage.html");
		redirect.forward(req, resp);
	}else {
		RequestDispatcher redirect=req.getRequestDispatcher("login");
		redirect.forward(req, resp);
	}
		
		
//		String output=null;
//		
//		if(email.equals("rani@gmail.com")) {
//			output="<html>"
//					+ "<body>"
//					+ "<h1>This emailId has already registered try to login</h1>"
//					+ "<a href='login'>click here</a>"
//					+ "</body>"
//					+ "</html>";
//		}else {
//			output="<html>"
//					+ "<body>"
//					+ "<h1>successfully registered now click here to login</h1>"
//					+ "<a href='login'>click here</a>"
//					+ "</body>"
//					+ "</html>";
//		}
//		PrintWriter out=resp.getWriter();
//		out.write(output);
	}

}
