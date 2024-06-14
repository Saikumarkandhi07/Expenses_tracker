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

@WebServlet("/AddExpense")
public class AddExpense extends HttpServlet {

	private ExpenseService expenseService=new ExpenseServiceImpl();
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		Expense expense=new Expense();
		String x=request.getParameter("amount");
		double amo=Double.parseDouble(x);
	    expense.setAmount(amo);
	    expense.setDescription(request.getParameter("description"));
		expense.setCategory(request.getParameter("category"));
		
		expense.setDate(Date.valueOf(request.getParameter("date")));
		
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute("userInfo");
			System.out.println(user);
		int expenseId=expenseService.addExpense(expense, user.getUserId());
		//System.out.println(user.getUserId());
		//PrintWriter writer=response.getWriter();
		//response.setContentType("text/html");
		//writer.print("<h3>Expense Added Successfully</h3>");
		
		if(expenseId!=0)
		{
			List<Expense> list=expenseService.viewExpense(user.getUserId());
			request.setAttribute("expenseslist", list);

			request.setAttribute("succ", "Expense Added Succesfully");
			RequestDispatcher dispatcher=request.getRequestDispatcher("ViewExpenses");
			dispatcher.include(request, response);
		}
		else
		{
			request.setAttribute("msg","please enter valid details");
			
		}
	}
}
