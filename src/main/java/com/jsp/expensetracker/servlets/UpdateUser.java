package com.jsp.expensetracker.servlets;

import java.io.IOException;

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
 * Servlet implementation class UpdateUser
 */
@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
	private UserService userService=new UserServieImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int userId=Integer.parseInt(request.getParameter("userId"));
		int result=0;
		
		try {
			User user=new User();
						user.setUsername(request.getParameter("username"));
						user.setFullname(request.getParameter("fullname"));
						user.setEmail(request.getParameter("email"));
						user.setMobile(request.getParameter("mobile"));
						user.setPassword(request.getParameter("password"));
						
			result=userService.updateUser(user, userId);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("pu"+result);
		if(result!=0)
		{
			request.setAttribute("updateMsg", "Profile Updated Successfully");
			RequestDispatcher dispatcher=request.getRequestDispatcher("UpdateUserProfile.jsp");
			dispatcher.include(request, response);
		}
		
		
		
	}

}
