package com.jsp.expensetracker.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.expensetracker.entity.User;
import com.jsp.expensetracker.service.UserService;
import com.jsp.expensetracker.service.UserServieImpl;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {

	private UserService  service =new UserServieImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fullname=request.getParameter("fullname");
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String password=request.getParameter("password");
		String cpassword=request.getParameter("cpassword");
		
		
		User user=new User();
		user.setFullname(fullname);
		user.setUsername(username);
		user.setEmail(email);
		user.setMobile(mobile);
		user.setPassword(password);
		
		int userId=service.register(user, cpassword);
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");

		if(userId!=0)
		{
			request.setAttribute("signup_msg", "CREATED ACCOUNT SUCCESSFULLY !!  LOGIN NOW !");
			RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
			dispatcher.include(request, response);
		writer.println("<h2>Registration Successful !!!</h2>");
		writer.println("<h3>USER ID :"+userId+" </h3>");
		}
		else
		{
			request.setAttribute("signup_ms","Account Creation is failed ! Again register");

			RequestDispatcher dispatcher=request.getRequestDispatcher("register.jsp");
			dispatcher.include(request, response);

			writer.println("<h4>YOUR REGISTRATION IS FAILED </h4>");
			
		}
	}

}
