package com.sampleServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SampleServlet implements Servlet
{

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("It is a simple servletconfig class");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("It is only for adding some properties in "
				+ "servlet config for my specifications.");
		return this.getServletConfig();
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("it is for business logic");
		// set response content type
		res.setContentType("text/html");
		// actual logic goes here
		PrintWriter pw = res.getWriter();
		pw.println("<h1>" + "testing"+"</h1>");
	}

	@Override
	public String getServletInfo() {
		//just for server info
		return this.getServletInfo();
	}

	@Override
	public void destroy() {
		// if the server stops or there are some issues in the program.
		
	}
}