package com.jsp.expensetracker.servlets;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.expensetracker.entity.Expense;
import com.jsp.expensetracker.entity.User;
import com.jsp.expensetracker.service.ExpenseService;
import com.jsp.expensetracker.service.ExpenseServiceImpl;

/**
 * Servlet implementation class TotalExpenses
 */
@WebServlet("/TotalExpenses")
public class TotalExpenses extends HttpServlet {
	private ExpenseService expenseService=new ExpenseServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		// FETCH DATA FROM USER USING GET PARAMETER METHOD WHICH RETURNS STRING
		//convert into Date format using valueOf method in Date class

	Date startDate=	Date.valueOf(request.getParameter("sd"));
	Date endDate=Date.valueOf(request.getParameter("ed"));
	System.out.println(startDate);
	System.out.println(endDate);
				
	// GETTING USER ID FOR FETCHING EXPENSES OF PARTICULAR PERSON
	// BY USING SESSION OBJECT WE ARE GETTING USER INFO 
	HttpSession session=request.getSession();
     User user=(User)	session.getAttribute("userInfo");
     System.out.println(user);
	
     
     
     
     //GETTING ALL LIST OF EXPENSES OF PARTICULAR USER
     List<Expense> listOfExpense=expenseService.viewExpense(user.getUserId());
		
     
     				//method calling to return summation of all expenses (amount ) in given date
     
     double re=expenseService.caluclateTotalExpenses(startDate, endDate, user.getUserId());
     System.out.println(re);
     
		request.setAttribute("list", listOfExpense);
		request.setAttribute("startdate", startDate);
		request.setAttribute("enddate", endDate);
     request.setAttribute("processMsg", "TOTAL EXPENSES = Rs ");
     request.setAttribute("result", re);
     RequestDispatcher dispatcher=request.getRequestDispatcher("viewtotalexpense.jsp");
		dispatcher.include(request, response);
	}

}
