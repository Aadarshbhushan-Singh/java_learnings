package com.Servlets_DemoApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Class_03_Learn_HttpServlets extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		System.out.println("This is get method of HttpServlet class.....");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>This is get method of HttpServlet under h1 tag</h1>");
	}
}
