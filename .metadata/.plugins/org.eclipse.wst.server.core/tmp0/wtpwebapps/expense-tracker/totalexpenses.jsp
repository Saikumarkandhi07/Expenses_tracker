<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Total Expenses</title>
    <script src="https://kit.fontawesome.com/c51795afff.js" crossorigin="anonymous"></script>
    <link rel="icon" href="media/expenses-removebg-preview (1).png">
    <link rel="stylesheet" href="totalexpenses.css">
    <style>
    #output
    {
    	margin-top:490px;
    	margin-left:507px;
    }
    </style>
</head>
<body>
  <%
 String popup=  (String) request.getAttribute("processMsg");
    Double result=(Double)request.getAttribute("result");
    if(popup!=null  && result!=null){
    %>
    <script>alert('CALUCLATION IN PROGRES !!');
</script>    
    <%} %>

 <div class="header">
        <a href="index.jsp"> <img src="media/expenses-removebg-preview (1).png" style="height:47px;width:47px;padding:22px;margin-left:33px;"> </a>
            <b>Spring Expenses Tracker</b>
            <a href="home.jsp" id="dd"><i class="fa-solid fa-home"></i>&nbsp;Home</a>

    </div><br><br>
    <center>
    <div class="maib">
<h2>Total Expenses Counter</h2>
<div>
<form method="post" action="TotalExpenses">
    <label>Start Date</label><br><br>
    <input type="date" placeholder="dd-mm-yyyy" name="sd">
    <br><br><br><br>
    <label>End Date</label><br><br>
    <input type="date" placeholder="dd-mm-yyyy" name="ed">
    <br><br><br>
    <%if (result!=null ){ %>
    <b id="output" style="color:blue;font-size:21px;"><%=popup%><%=result %></b>
  <%} %>  <br><br>
    <input type="submit" value="submit" class="lb">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="reset" class="lb">
</form></div>
    </div></center>
    
    
  
</body>
</html>