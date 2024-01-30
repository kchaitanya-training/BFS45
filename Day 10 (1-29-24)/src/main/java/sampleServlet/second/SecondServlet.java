package sampleServlet.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		System.out.println("2nd Servlet. This will be printed in system");
		pw.write("<h1> 2nd Servlet is being used!</h1><p> Use of second servlet is also completed "
				+ "with extension from Generic Servlet class. </p>");
	}

}


