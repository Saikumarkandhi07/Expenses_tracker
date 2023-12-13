package com.jsp.expensetracker.servlets;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.jsp.expensetracker.entity.User;
import com.jsp.expensetracker.service.UserService;
import com.jsp.expensetracker.service.UserServieImpl;

/**
 * Servlet implementation class UpdateProfile
 */
@WebServlet("/UpdateProfile")
@MultipartConfig
public class UpdateProfile extends HttpServlet {
	UserService userService=new UserServieImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session=request.getSession();
			User user1=(User)session.getAttribute("userInfo");
		User user=new User();

	
		user.setEmail(request.getParameter("email"));
		user.setFullname(request.getParameter("fullname"));
		user.setUsername(request.getParameter("username"));
		user.setMobile(request.getParameter("mobile"));
		user.setPassword(request.getParameter("password"));
		user.setUserId(user1.getUserId());
		Part part=request.getPart("imageFile");
		System.out.println(part.getName());
		System.out.println(part.getSize());
		System.out.println(part.getContentType());
		
		
		InputStream is=request.getInputStream();
		
		int result=userService.updateProfile(user, is);
		System.out.println(result);
		
		
		if(result!=0)
		{
			request.setAttribute("updateMsg", "Profile Updated Successfully");
			RequestDispatcher dispatcher=request.getRequestDispatcher("UpdateUserProfile.jsp");
			dispatcher.include(request, response);
		}
		
		
		
	}

}
