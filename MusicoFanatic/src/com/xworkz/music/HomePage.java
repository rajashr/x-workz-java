package com.xworkz.music;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePage extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("i am in servlet");
	String html="<html>"
			+"<body>"
			+"<h2> <mark> Music is the wine that fills the cup of silence</mark></h2>"
			+"</body>"
			+"</html>";
	PrintWriter out=resp.getWriter();
	out.write(html);
	
	}

}
