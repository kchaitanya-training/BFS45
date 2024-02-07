package com.bfs45.bookmanagment.controller;

import java.io.IOException;

import com.bfs45.bookmanagment.model.User;
import com.bfs45.bookmanagment.service.UserRegistryService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registry")
public class UserRegistryServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String role=req.getParameter("role");
	
		
		User user=new User(username,password,role);

		UserRegistryService service=new UserRegistryService();
		String userId=service.userCreation(user);
		
		RequestDispatcher rd=req.getRequestDispatcher("/successreg.jsp");
		req.setAttribute("userid", userId);
	rd.forward(req, resp);

	}

}
