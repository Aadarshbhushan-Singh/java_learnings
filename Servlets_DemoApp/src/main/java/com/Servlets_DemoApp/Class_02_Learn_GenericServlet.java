package com.Servlets_DemoApp;
import javax.servlet.*;
import java.io.*;

public class Class_02_Learn_GenericServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		System.out.println("Second Servlet service is running...");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("This is second servlet output.");
	}
}
