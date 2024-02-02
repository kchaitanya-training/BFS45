package com.takeo.bookmanagement.controller;

import java.io.IOException;

import com.takeo.bookmanagement.model.User;
import com.takeo.bookmanagement.service.UserRegisterService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class UserRegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String role = req.getParameter("role");
		
		User user = new User(username, password, role);
		UserRegisterService service = new UserRegisterService();
		String userId = service.userCreation(user);
		
		RequestDispatcher rd=req.getRequestDispatcher("/successreg.jsp");
		req.setAttribute("userid", userId);
		rd.forward(req, resp);

	}
	
}
