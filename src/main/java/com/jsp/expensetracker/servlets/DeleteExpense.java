package com.jsp.expensetracker.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.expensetracker.service.ExpenseService;
import com.jsp.expensetracker.service.ExpenseServiceImpl;

/**
 * Servlet implementation class DeleteExpense
 */
@WebServlet("/DeleteExpense")
public class DeleteExpense extends HttpServlet {
	
	private ExpenseService expenseService=new ExpenseServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String eid=request.getParameter("exId");
		if(eid!=null) {
		int expenseId=Integer.parseInt(eid);
		int res=expenseService.deleteExpense(expenseId);
		
		if(res!=0)
		{
			request.setAttribute("mess", "RECORD DELETED SUCCESSFULLY");
			RequestDispatcher dispatcher=request.getRequestDispatcher("ViewExpense.jsp");
			dispatcher.include(request, response);
		}
		}
	}

}
