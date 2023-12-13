package com.jsp.expensetracker.servlets;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.expensetracker.service.UserService;
import com.jsp.expensetracker.service.UserServieImpl;



@WebServlet("/ForgotPassword")
public class ForgotPassword  extends HttpServlet {
	private UserService userService=new UserServieImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * TODO
		 * 1. Fetch  email  from forgot password jsp file
		 * 2. call forgotpassword() method from userservice interface
		 * 3.perform servlet chaining 
		 * 4.transfer data  
		 */
		String email=request.getParameter("email");
		
	String mail=userService.forgotPassword(email);
		if(mail!=null)
		{
			request.setAttribute("userInfo", mail);
			request.setAttribute("msg", "Your password is "+mail);
			RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
			dispatcher.include(request, response);
		}
		else
		{
			request.setAttribute("msg", "EMAIL DOES NOT EXIST");
			//writer.println("LOGIN FAILED");
			RequestDispatcher dispatcher=request.getRequestDispatcher("register.jsp");
			dispatcher.include(request, response);
		}
		
	}

}
