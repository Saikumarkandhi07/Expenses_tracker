<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="com.jsp.expensetracker.entity.User" %>
    <%@page import="java.util.Base64"%>
    <%@page import="com.jsp.expensetracker.service.UserServieImpl"%>
<%@page import="com.jsp.expensetracker.service.UserService"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EDIT PROFILE</title>
    <script src="https://kit.fontawesome.com/c51795afff.js" crossorigin="anonymous"></script>
    <link rel="icon" href="media/expenses-removebg-preview (1).png">

<style>
#ep
{
margin-left:870px;
margin-top:30px;

background-color:rgba(153, 50, 204,0.6);
height:560px;
width:400px;
border-left-style:solid;
border-left-color:blueviolet;
border-left-width:10px;
}
input
{
width:300px;
height:34px;
text-align:center;
color:blueviolet;
font-size:large;
margin-left:40px;
border-style:none;
}
label
{
margin-left:65px;
font-weight:bold;
font-size:medium;
color:white;
}
input:placeholder
{
text-align:center;
color:blue;

}
#pp
{
width:50%;
height:40px;
border-style:solid;
border-color:white;
border-radius:100px;
border-width:2px;
color:white;
letter-spacing:1px;
font-weight:bold;
background-color:rgb(153, 50, 204);
margin-left:90px;
z-index:2;
}
#pp:hover
{
background-color:rgba(153, 50, 204,0.9);
box-shadow:2px 2px 2px 2px whitesmoke;
width:52%;
}

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
            overflow:hidden;
        }

        div b{
            position: absolute;
            top:5%;
            left:8%;
            font-size: 25px;
        }
        
          body
        {
            background-image: url("media/bg.png");
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-position: center;
            background-size:cover;
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
        #uu
        {
        position:absolute;
        left:17%;
        top:30%;
        }
        #displayImage
        {
        position:absolute;
        left:17%;
        top:30%;
        z-index:2;
        height:360px;
        width:305px;
        }
</style>
</head>

<body>
<div class="header">
        <a href="index.jsp"> <img src="media/expenses-removebg-preview (1).png" style="height:47px;width:47px;padding:22px;margin-left:33px;"> </a>    <b>Spring Expenses Tracker</b>
        <a href="home.jsp" id="dd"><i class="fa-solid fa-home"></i>&nbsp;Home</a>

    </div>
<%
User user=(User) session.getAttribute("userInfo");
UserService service = new UserServieImpl();

%>


<img src="media/updateuser.png" height="340px" width="300px" id="uu">
<div id="ep"><br>
<h2 style="color:white;text-align:center;margin-top:4px;letter-spacing:2px;">UPDATE YOUR PROFILE</h2>
<form method="post" action="UpdateProfile" enctype="multipart/form-data">
<input hidden=true value=<%=user.getUserId() %> name="userId"> <br>
<label>USER NAME</label><br>
<input type="text" required value=<%=user.getUsername() %> name="username">
<br><br>
<label>FULL NAME</label><br>
<input type="text" required value=<%=user.getFullname() %> name="fullname">
<br><br>
<label>EMAIL ID</label><br>
<input type="email" required value=<%=user.getEmail() %> name="email">

<br><br>
<label>MOBILE</label><br>
<input type="mobile" required value=<%=user.getMobile() %> name="mobile">
<br><br>
<label>PASSWORD</label><br>
<input type="password" required value=<%=user.getPassword() %> name="password">
<br>
<br>
<label>PROFILE PHOTO</label><br>
<input type="file"  accept="image/*" name="imageFile" id="fileInput" ><br>
<img id="displayImage">
<br>

<input type="submit" value="update profile" id="pp">
</form>
</div>
<script>

const fileInput=document.getElementById("fileInput");
const displayImage=document.getElementById("displayImage");
const uu=document.getElementById("uu");
fileInput.addEventListener("change",function()
		{
	const file=fileInput.files[0];
	if(file&&file.type.startsWith("image/"))
		{
		const reader=new FileReader();
		reader.onload=function(e)
		{
			displayImage.src=e.target.result;
			displayImage.style.display="block";
			uu.style.display="none";

		};
reader.readAsDataURL(file);
		}
		});
</script>
 
</body>
</html>