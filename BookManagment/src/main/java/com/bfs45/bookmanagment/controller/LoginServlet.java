package com.bfs45.bookmanagment.controller;

import java.io.IOException;


import com.bfs45.bookmanagment.model.User;
import com.bfs45.bookmanagment.service.LoginService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String userId=req.getParameter("userId");
		String password=req.getParameter("password");
		// storing the userId in the session
		HttpSession session = req.getSession();
		session.setAttribute("userid", userId);
	
		
		LoginService service=new LoginService();
	User usr;
	try {
		usr = service.validateUser(userId, password);
		String role = usr.getRole();
		session.setAttribute("role", role);
	
		if("admin".equals(role)) {
			RequestDispatcher rd=req.getRequestDispatcher("/bookServlet");
			req.setAttribute("role",role);
			rd.forward(req, resp);
		}else if("user".equals(usr.getRole())) {
			RequestDispatcher rd=req.getRequestDispatcher("/bookServlet");
			req.setAttribute("role", role);
			rd.forward(req, resp);
		}else if (usr==null) {
			throw new Exception("user is not availble");
		}

	} catch (Exception e) {
		RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");
		req.setAttribute("loginerror", e.getMessage());
		rd.forward(req, resp);
	}
		
		
	}

}
