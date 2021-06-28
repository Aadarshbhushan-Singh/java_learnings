package com.Servlets_DemoApp;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Class_07_s2_product extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int number1=Integer.parseInt(request.getParameter("num3"));
		int number2=Integer.parseInt(request.getParameter("num4"));
		
		int product=number1*number2;
				
		request.setAttribute("product", product);
		
		RequestDispatcher rd=request.getRequestDispatcher("Class_06_s1_add");
		rd.include(request, response);
		
	}
}
