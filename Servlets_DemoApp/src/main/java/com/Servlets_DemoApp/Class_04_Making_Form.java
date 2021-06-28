package com.Servlets_DemoApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Class_04_Making_Form extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("Server Started...");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Welcome to Form created by Java Servlet");
		
		String name=request.getParameter("user_name");
		String password=request.getParameter("user_password");
		String gender=request.getParameter("gender");
		String condition=request.getParameter("agree");
		System.out.println(condition);
		if(condition!=null)
		{
			out.println("User name: "+name);
			out.println("Gender: "+gender);
			
//			RequestDispatcher rq=request.getRequestDispatcher("Successful");
//			rq.forward(request, response);
		}else
		{
			out.println("<h1> You have not accepted terms and condition.</h1>");
			
			//Include index.html in this servlet request
			//Make the object of Request Dispatcher
			RequestDispatcher rq=request.getRequestDispatcher("index.html");
			rq.include(request, response);
			
			
		}
		
	}
}
