package sampleServlet.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Comment: Facing some issue with the annotation method
@WebServlet(name = "annotation HTTP Servlet", urlPatterns = "/sample")
public class WebServletAnnotation extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		System.out.println("4th Servlet. This is from HTTP Servlet with annotation to config servlet.");
		pw.write("<h1> 4th Servlet (HTTP with annotation) is being used!</h1><p> Use of annotations "
				+ "to specify configuration details directly in the servlet classes.  </p>");
    }
}
