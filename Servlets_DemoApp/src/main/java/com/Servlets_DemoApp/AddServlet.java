package com.Servlets_DemoApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * With post doPost()
 * with get doGet()
 * with both post and get service() method should be used
 * */
public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		
		int sum=a+b;
		
//		PrintWriter out=res.getWriter();		
//		out.println("Sum is: "+sum);
		
		req.setAttribute("k", sum);
		
		RequestDispatcher rd=req.getRequestDispatcher("sqr");
		rd.forward(req, res);
	}
	
}
	