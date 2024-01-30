package sampleServlet.http;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletSample extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		System.out.println("3rd Servlet. This is from HTTP Servlet.");
		pw.write("<h1> 3rd Servlet (HTTP) is being used!</h1><p> Use of third servlet is also completed with "
				+ "the use of HTTP Servlet. </p>");
    }
}

