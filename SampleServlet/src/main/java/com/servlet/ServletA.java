package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletA extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String salary=req.getParameter("salary");
		
		System.out.println("name "+name);
		System.out.println("salary "+salary);
		
	RequestDispatcher reqDispatcher=	req.getRequestDispatcher("sampleB");
	
	req.setAttribute("name", "arvindh kumar");
	req.setAttribute("salary", "2500");
	reqDispatcher.forward(req, resp);
		
	}

}
