<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
 <link rel="icon" href="media/expenses-removebg-preview (1).png">
    <script src="https://kit.fontawesome.com/c51795afff.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="fgpw.css">

</head>
<body>
  <div class="header">
        <a href="index.jsp"> <img src="media/expenses-removebg-preview (1).png" style="height:47px;width:47px;padding:22px;margin-left:33px;"> </a>    <b>Spring Expenses Tracker</b>
          <a href="login.jsp"> <img src="media/account.png" height="29px" width="29px" style="position:absolute;right:3%;top:5%;"></a>
   
    </div>
    <div id="im">
        <img src="media/fgpw_preview.png" height="500px" width="420px">
    </div>
    <div id="frm">
        <center>
            <div>
                <h4>Forgot Password ?   </h4>                  
                <br>
                	<form method="post"    action="ForgotPassword">
   			<img src="media/email.png" height="38px" width="35px" style="position:absolute;top:50%;right:36%;">	<input type="email" required placeholder="Enter Your Email " name="email" id="ma" >
                <br><br>
                <input type="submit" value="Submit" class="bta">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Reset" class="bta">
           			</form>
            </div>
        </center>
    </div>
    
    		<%
String message=(String) request.getAttribute("msg");

%>
  
</body>
</html>