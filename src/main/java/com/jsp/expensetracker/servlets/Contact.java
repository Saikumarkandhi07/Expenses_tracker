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

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private UserService userService=new UserServieImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un=request.getParameter("username");
		String em=request.getParameter("email");
		String co=request.getParameter("comment");
		int res=userService.addFeedback(un, em, co);
		System.out.println(res);
		if(res!=0) {
			request.setAttribute("feemes", "THANKS OR GIVING FEEDBCAK");
			RequestDispatcher dispatcher=request.getRequestDispatcher("rating.jsp");
			dispatcher.include(request, response);

		}
			
		
		
	}

}
