package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletB extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=(String)req.getAttribute("name");
		String salary=(String)req.getAttribute("salary");
		
		System.out.println("name "+name);
		System.out.println("salary "+salary);
		
	}

}
