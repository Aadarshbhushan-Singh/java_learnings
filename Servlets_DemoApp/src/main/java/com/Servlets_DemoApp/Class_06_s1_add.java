package com.Servlets_DemoApp;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

public class Class_06_s1_add extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int number1=Integer.parseInt(request.getParameter("num3"));
		int number2=Integer.parseInt(request.getParameter("num4"));
		
		int sum=number1+number2;
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("The Sum is: "+sum);
		out.println("Hey buddy");
		
		int product = (int)request.getAttribute("product");
		out.println("Product is: "+product);
		
		out.println("HI man!");
	}
}
