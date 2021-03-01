package com.xworkz.musicapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("i am in login servlet");
//		String htmlcontent="<html>"
//				+ "<body>"
//				+ "<h1>You are in login page</h1>"
//				+ "<a href='login'>click here</a>"
//				+ "</body>"
//				+ "</html>";
//		PrintWriter out=resp.getWriter();
//		out.write(htmlcontent);
		RequestDispatcher redirecting=req.getRequestDispatcher("login.html");
		redirecting.forward(req, resp);
	}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("i am in login servlet");
//			String html="<html>"
//					+ "<body>"
//					+ "<h1>You are in login page</h1>"
//					+ "<a href='login'>click here</a>"
//					+ "</body>"
//					+ "</html>";
//			PrintWriter out=resp.getWriter();
//			out.write(html);
			
			RequestDispatcher redirecting=req.getRequestDispatcher("login.html");
			redirecting.forward(req, resp);
	}

}
