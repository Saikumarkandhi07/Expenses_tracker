package com.jsp.expensetracker.dao;

import java.sql.Date;
import java.util.List;

import com.jsp.expensetracker.entity.Expense;

public interface ExpenseDao {

	int addExpense(Expense expense,int  userId) throws Exception;
	List<Expense> viewExpense(int userId) throws Exception;
	int deleteExpense(int expenseId) throws Exception;
	Expense findDetailsByExpenseId(int expenseId) throws Exception;
	
	int updateExpenseDetails(Expense expense,int expenseId) throws Exception;
	
	
	double caluclateTotalExpenses(Date startDate,Date endDate,int userId) throws Exception;
}
