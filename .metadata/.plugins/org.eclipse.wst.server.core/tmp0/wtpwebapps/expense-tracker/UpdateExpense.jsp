<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@page import="com.jsp.expensetracker.entity.Expense" %>
        <%@page import="com.jsp.expensetracker.service.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Expense Details</title>
    <script src="https://kit.fontawesome.com/c51795afff.js" crossorigin="anonymous"></script>
    <link rel="icon" href="media/expenses-removebg-preview (1).png">
    <link rel="stylesheet" href="addexpenses.css">
    <style>
    label
    {
    	margin-left:18px;
    	color:blueviolet;
    	font-style:italic;
    	font-size:19px;
    	letter-spacing:1px;
    }
    .child2
    {
    padding-top:77px;
    
    }
    input,textarea{
    color:blueviolet;
    font-size:20px;
    }
    
     #parent
        {
           margin-left:70px;
           margin-top:40px;
           height:545px;
           width:90%; 
           background-image: linear-gradient(to top left,rgba(0,200,255,0.4),rgba(255, 170, 0,0.3),rgba(255, 255, 0,0.4),rgba(174, 46, 46,0.5),rgba(0, 0, 255, 0.3));

        }
        #lb
        {
        	background-color:blueviolet;
        	color:white;
        }
    </style>
</head>
<body>
<div class="header">
        <a href="index.jsp"> <img src="media/expenses-removebg-preview (1).png" style="height:47px;width:47px;padding:22px;margin-left:33px;"> </a>    <b>Spring Expenses Tracker</b>
        <a href="home.jsp" id="dd"><i class="fa-solid fa-home"></i>&nbsp;Home</a>

    </div>
<%
 ExpenseService expenseService=new ExpenseServiceImpl();
		
String expId=request.getParameter("expenseId");
			int eid=Integer.parseInt(expId);
			
			Expense ex= expenseService.findDetailsByExpenseId(eid);
%>

<div id="parent">
        
<div class="child1">
<img src="media/update.png" height="320px" width="310px" style="margin-left:80px;">
</div>
<div class="child" style="padding:1px;">
    <h3 style="color:blueviolet;">UPDATE EXPENSES</h3>
    <div class="child2" >

<form method="post" action="UpdateExpenseDetails">
<input hidden=true value=<%=eid %> name="expenseId">
<label>Amount</label><br>
<input type="text" required value=<%=ex.getAmount() %> name="amount">
<br><br>
  <label>Date</label><br>  <input type="date" value=<%=ex.getDate() %> required name="date">
    <br><br>
   <label>Category</label> <br>  <input list="category" name="category" required value=<%=ex.getCategory() %>>
    <datalist id="category">
    	<option value="Utilities">Utilities</option>
        <option value="Transportation">Transportation</option>
        <option value="Groceries">Groceries</option>
        <option value="DiningOut">DiningOut</option>
        <option value="Entertainment">Entertainment</option>
        <option value="HealthCare">HealthCare</option>
        <option value="Education">Education</option>
        <option value="PersonalCare">PersonalCare</option>
        <option value="Clothing">Clothing</option>
        <option value="Home&maintanence">Home&maintanence</option>
        <option value="Gift&Donations">Gift&Donations</option>
        
      </datalist><br><br>  
         <label>Description</label><br>
 <textarea rows="6" cols="15" name="description" > <%=ex.getDescription() %></textarea>
    <br><br>
    <center>
<input type="submit" value="Update" id="lb"></center>
</form>



</div>
</div>
</div>

</body>
</html>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        