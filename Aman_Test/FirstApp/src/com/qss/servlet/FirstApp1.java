package com.qss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstApp1 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 resp.setContentType("text/html");  
		    PrintWriter out = resp.getWriter();  
		          
		    String n=req.getParameter("username");  
		    String p=req.getParameter("userpass");  
		          
		    if(LoginDao.validate(n, p)){  
		        RequestDispatcher rd=req.getRequestDispatcher("FirstApp");  
		        rd.forward(req,resp);  
		    }  
		    else{  
		        out.print("Sorry username or password error");  
		        RequestDispatcher rd=req.getRequestDispatcher("first.html");  
		        rd.include(req,resp);  
		    }  
		          
		    out.close();  
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
