<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.jsp.expensetracker.entity.User" %>
        <%@page import="com.jsp.expensetracker.service.*" %>
        
         <%@page import="java.util.Base64"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User Profile</title>
 <script src="https://kit.fontawesome.com/c51795afff.js" crossorigin="anonymous"></script>
    <link rel="icon" href="media/expenses-removebg-preview (1).png">
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

        div b{
            position: absolute;
            top:5%;
            left:8%;
            font-size: 25px;
        }
        .header #dd
        {
            font-size:large;
            position:absolute;
            right:18%;
            top:5%;
            text-decoration: none;
            color:black;
        }
        
        
          #box
        {
            animation-name: turn;
            animation-duration:3s;
            animation-delay:0s;
            animation-iteration-count: 1;
            animation-direction: reverse;
            animation-timing-function:ease-out ;
            transform:rotateX(0deg);
            display:block;
            z-index:3;
        }
@keyframes turn{
    
   to
   {
            transform:rotateX(90deg);
   }
}

        #profile
        {
            margin-top:90px;
            margin-left:540px;
            border-style:groove;
            border-color:blueviolet;
            border-radius: 10px;
            border-width:5px;
            height:475px;
            width:430px;
            animation-name: changebg;
            animation-duration: 3s;
            animation-iteration-count: infinite;
            animation-direction: normal;
        }
        @keyframes changebg {
            33%
            {
                background-image:linear-gradient(to  right,rgba(238, 129, 238,0.4),rgba(76, 0, 130,0.4),rgba(0, 0, 255,0.4),rgba(0, 128, 0,0.4),rgba(255, 255, 0,0.4),rgba(255, 165, 0,0.4),rgba(255, 0, 0,0.4));
            }
            66%
            {
                background-image:linear-gradient(to top right,rgba(238, 129, 238,0.4),rgba(76, 0, 130,0.4),rgba(0, 0, 255,0.4),rgba(0, 128, 0,0.4),rgba(255, 255, 0,0.4),rgba(255, 165, 0,0.4),rgba(255, 0, 0,0.4));

            }
            100%
            {
                background-image:linear-gradient(to bottom,rgba(238, 129, 238,0.4),rgba(76, 0, 130,0.4),rgba(0, 0, 255,0.4),rgba(0, 128, 0,0.4),rgba(255, 255, 0,0.4),rgba(255, 165, 0,0.4),rgba(255, 0, 0,0.4));

            }
           
            
        }
        #ip
        {
            
            height:440px;
            width:380px;
            margin-top: 15px;
            margin-left: 15px;
        }
       i{
        padding:9px;
        font-size: large;
       }
       #bnt
       {
        width:60%;
        height:33px;
        letter-spacing:2px;
        font-size:medium;
        border-style: none;
        color:white;
       background-color:rgba(0, 0, 0,0.8);
       border-radius:100px;
       
       }
       #bnt:hover
       {
        box-shadow:1px 1px 2px 2px lightgrey;
        background-color:black;

       }
       #hed
       {
        letter-spacing: 2px;
        font-size: 25px;
        text-decoration: underline;
        color:black;
        text-shadow: 1px 1px white;
       }
       .ud
       {
        font-size:large;
        font-weight:bold;
       }
       
               body
        {
            background-image: url(media/bg.png);
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-position: center;
            background-size: cover;
        }
    </style>
</head>
<body>
<div class="header">
        <a href="index.jsp"> <img src="media/expenses-removebg-preview (1).png" style="height:47px;width:47px;padding:22px;margin-left:33px;"> </a>    <b>Spring Expenses Tracker</b>
        <a href="home.jsp" id="dd"><i class="fa-solid fa-home"></i>&nbsp;Home</a>

    </div>
<%
 UserService userService=new UserServieImpl();

User user=(User) session.getAttribute("userInfo");
					
					User user1=userService.findUserById(user.getUserId());
			%>		
 <div id="box">
    <div id="profile">
        
        <div id="ip"><br>
           <center> <h4 id="hed">USER DETAILS</h4></center><br>

            <center><img src="media/user.png" height="70px"></center>
            <br><br>
            <i>Your UserName :</i>&nbsp;<span class="ud"><%=user1.getUsername() %></span>
            <br> <br>
            <i>Your FullName :</i>&nbsp;<span class="ud"><%=user1.getFullname() %></span>
            <br> <br>
            
            <i>Your Email-Id :</i>&nbsp;<span class="ud"><%=user1.getEmail() %></span>
            <br><br>
            <i>Your MobileNo:</i>&nbsp;<span class="ud"><%=user1.getMobile() %></span>
            <br><br>
            <i>Your Password :</i>&nbsp;<span class="ud"><%=user1.getPassword() %></span>
            <br><br><br>
        <center > <a href="EditProfile.jsp" style="text-decoration:none;">  <button type="submit"  id="bnt" ><i class="fa-solid fa-pencil "></i>UPDATE</button></a></center>
        </div>
    
    </div></div>
    
    <%
   String proUpdate= (String) request.getAttribute("updateMsg");
    if(proUpdate!=null)
    {
    %>
    <script>alert('<%=proUpdate%>')
    </script>
    <%} %>
    

       
    
   
</body>
</html>