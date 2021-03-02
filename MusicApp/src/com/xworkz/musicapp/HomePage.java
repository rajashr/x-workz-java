package com.xworkz.musicapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePage extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("i am in servlet");
		//i want to redirect from home page to the registration page
		//i want to give response in form of html page so we write html content itself but now we redirectiong request to the 
		//anothere html html page or servlet so when clicks on click heere take them them to another html page 
//		String htmlItsel="<html>"
//				+ "<body>"
//				+ "<h1>you are in the home page  plz login here</h1>"
//				+ "</body>"
//				+ "</html>";
//		PrintWriter out=resp.getWriter();
//		out.write(htmlItsel);
		RequestDispatcher redirectToHtmlPage=req.getRequestDispatcher("Registration.html");
		redirectToHtmlPage.forward(req, resp);
	
		
	}

}
