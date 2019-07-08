package com.qss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstApp extends HttpServlet {
 @Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 resp.setContentType("text/html");
	 PrintWriter pw=resp.getWriter();  
	   
	 
	 pw.println("<form action=\"servlet1\" method=\"post\">");  
	 pw.println("Name:<input type=\"text\" name=\"username\"/><br/><br/>");  
	 pw.println("<input type=\"submit\" value=\"login\"/> ");
	 String n=req.getParameter("username");
	 pw.close();//closing the stream
}
 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 doGet(req, resp);	
	
	}
     
 
}
