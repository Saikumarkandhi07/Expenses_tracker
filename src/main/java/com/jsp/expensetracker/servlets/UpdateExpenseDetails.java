package com.jsp.expensetracker.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.expensetracker.entity.Expense;
import com.jsp.expensetracker.service.ExpenseService;
import com.jsp.expensetracker.service.ExpenseServiceImpl;

/**
 * Servlet implementation class UpdateExpenseDetails
 */
@WebServlet("/UpdateExpenseDetails")
public class UpdateExpenseDetails extends HttpServlet {
	
	private ExpenseService expenseService=new ExpenseServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Expense expense=new Expense();
		double amount=Double.parseDouble(request.getParameter("amount"));
		expense.setAmount(amount);
		expense.setCategory(request.getParameter("category"));
		expense.setDescription(request.getParameter("description"));
		expense.setDate(Date.valueOf(request.getParameter("date")));
		
		//using as argument
		int expenseId=Integer.parseInt(request.getParameter("expenseId"));
		
		System.out.println("backend "+expense);
		System.out.println("bc  exid"+expenseId);
		int result=expenseService.updateExpense(expense, expenseId);
		
		
		System.out.println(result);
		
		if(result!=0)
		{
			System.out.println(result);
			request.setAttribute("updatedMessage", "Record Updated Successfully !!");
			RequestDispatcher dispatcher=request.getRequestDispatcher("ViewExpense.jsp");
			dispatcher.include(request, response);
		}
	}

}
