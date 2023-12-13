<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <script src="https://kit.fontawesome.com/c51795afff.js" crossorigin="anonymous"></script>
        <link rel="icon" href="../media/expenses-removebg-preview (1).png">

<style>
   *
        {
            margin:0%;
            padding:0%;
        }
        
        
         .header
        {
            margin:0px;
            padding:0px;
            height:90px;
            width:100%;
            background-color: rgba(153, 50, 204,0.6);
        }
        #ddi
        {
            margin-top:19px;
        height:589px;
        width:740px;
        background-color:rgb(70, 0, 211);
        border-radius: 20px;
        }
        div
        {
            margin-top:30px;
        height:640px;
        width:740px;
        background-color:rgb(70, 0, 211);
        }
        div b{
            font-size: 27px;
            font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
        }
        div input
        {
            height:54px;
            width:686px;
            padding-left:15px;
            border-style:none;
            border-radius:2px;
        }
         #bb{
            position: absolute;
            top:5%;
            left:8%;
            font-size: 25px;
        }
        #btt
        {
            height:48px;
            width:703px;
            border-radius:2px;
            background-color: rgba(0, 128, 0,0.9);
            color:white;
        }
    </style>

</head>
<body>
 <div class="header">
     <a href="index.jsp">   <img src="media/expenses-removebg-preview (1).png" style="height:47px;width:47px;padding:22px;margin-left:33px;"></a>     <b id="bb">Spring Expenses Tracker</b>
         </div>
 <center>
        <div id="ddi">
            <br>
            <b style="color:white;letter-spacing: 2px;">CREATE ACCOUNT</b>
                <br><br>
                <form method="post" action="Registration">
                <input type="text" required placeholder="Your Name" autocomplete="off" name="fullname">
                <br><br>
                <input type="text" required placeholder="Your Username" autocomplete="off" name="username">
                <br><br>
                <input type="email" required placeholder="Your Email" autocomplete="off" name="email">
                <br><br>
                <input type="tel" required placeholder="Your Mobile" autocomplete="off" name="mobile">
                <br><br>
                <input type="password" required placeholder="Password" autocomplete="off" name="password">
                <br><br>
                <input type="password" required placeholder="Rematch Your Password" autocomplete="off" name="cpassword">
                <br><br>
                <input type="submit" required value="SIGN UP" id="btt">
                <br><br>
                <span style="color:white;">Already have an account? </span>&nbsp;<a href="login.jsp" style="color:white;">Login now</a>
            
        </div>
    </center>
    
    <%
String message=(String) request.getAttribute("msg");
if(message !=null)
{
%>
<script>alert('<%= message %> Create an account now !!');</script>

<br>
<%}
%>







 <%
   String m=(String) request.getAttribute("signup_ms");
    if(m!=null){
    %>
    <script>
    alert('<%= m %>')
    
    </script>
    <%} %>
</body>
</html>