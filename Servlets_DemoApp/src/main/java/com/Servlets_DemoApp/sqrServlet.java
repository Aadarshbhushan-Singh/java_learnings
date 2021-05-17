package com.Servlets_DemoApp;

import java.io.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sqrServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
//		out.println("This is sqr Servlet.");
		
		int sum=(int)req.getAttribute("k");
		
		sum=sum*sum;
		
		out.print("Result is: "+sum);
		
		
	}
}
