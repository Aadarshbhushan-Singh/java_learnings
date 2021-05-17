package com.Servlets_DemoApp;
import javax.servlet.*;
import java.io.*;
import java.util.Date;

public class Class_01_First_Servlet implements Servlet {
	//Life cycle method of Servlet
	
	ServletConfig conf;
	
	public void init(ServletConfig conf)
	{
		this.conf=conf;
		System.out.println("Creating object...");
	}
	
	public void service (ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
			System.out.println("Servicing...");
			//Set the content type of the response
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			out.println("This is my output from servlet method.");
			out.println("Today's date is: "+new Date()+".");
	}
	
	public void destroy()
	{
		System.out.println("Going to destory this servlet object...");
	}
	
	//Non-life cycle method
	public ServletConfig getServletConfig()
	{
		return conf;
	}
	
	public String getServletInfo()
	{
		return "This servlet is created by Aadarsh";
	}
}
