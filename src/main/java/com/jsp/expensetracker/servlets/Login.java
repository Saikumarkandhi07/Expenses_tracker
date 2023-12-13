package com.jsp.expensetracker.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.expensetracker.entity.User;
import com.jsp.expensetracker.service.UserService;
import com.jsp.expensetracker.service.UserServieImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
   
    	private UserService userService=new UserServieImpl();
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	HttpSession session=request.getSession();

	User user=userService.login(username, password);
	

	//PrintWriter writer=response.getWriter();
	if(user!=null)
		
	{
		session.setAttribute("userInfo", user);
		request.setAttribute("msg", "LOGIN SUCCESSFUL");
		System.out.println(user);
		RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");
		dispatcher.include(request, response);
	//	writer.print("LOGIN SUCCESSFUL");
	}
	else
	{
		request.setAttribute("msg", "INVALID CREDENTIALS");
		//writer.println("LOGIN FAILED");
		RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
		dispatcher.include(request, response);
	}
	}

}
