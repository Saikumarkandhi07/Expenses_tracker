/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2024-06-04 09:35:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.jsp.expensetracker.entity.User;
import java.util.Base64;
import com.jsp.expensetracker.service.UserServieImpl;
import com.jsp.expensetracker.service.UserService;

public final class EditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Base64");
    _jspx_imports_classes.add("com.jsp.expensetracker.service.UserServieImpl");
    _jspx_imports_classes.add("com.jsp.expensetracker.service.UserService");
    _jspx_imports_classes.add("com.jsp.expensetracker.entity.User");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>EDIT PROFILE</title>\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/c51795afff.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link rel=\"icon\" href=\"media/expenses-removebg-preview (1).png\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#ep\r\n");
      out.write("{\r\n");
      out.write("margin-left:870px;\r\n");
      out.write("margin-top:30px;\r\n");
      out.write("\r\n");
      out.write("background-color:rgba(153, 50, 204,0.6);\r\n");
      out.write("height:560px;\r\n");
      out.write("width:400px;\r\n");
      out.write("border-left-style:solid;\r\n");
      out.write("border-left-color:blueviolet;\r\n");
      out.write("border-left-width:10px;\r\n");
      out.write("}\r\n");
      out.write("input\r\n");
      out.write("{\r\n");
      out.write("width:300px;\r\n");
      out.write("height:34px;\r\n");
      out.write("text-align:center;\r\n");
      out.write("color:blueviolet;\r\n");
      out.write("font-size:large;\r\n");
      out.write("margin-left:40px;\r\n");
      out.write("border-style:none;\r\n");
      out.write("}\r\n");
      out.write("label\r\n");
      out.write("{\r\n");
      out.write("margin-left:65px;\r\n");
      out.write("font-weight:bold;\r\n");
      out.write("font-size:medium;\r\n");
      out.write("color:white;\r\n");
      out.write("}\r\n");
      out.write("input:placeholder\r\n");
      out.write("{\r\n");
      out.write("text-align:center;\r\n");
      out.write("color:blue;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("#pp\r\n");
      out.write("{\r\n");
      out.write("width:50%;\r\n");
      out.write("height:40px;\r\n");
      out.write("border-style:solid;\r\n");
      out.write("border-color:white;\r\n");
      out.write("border-radius:100px;\r\n");
      out.write("border-width:2px;\r\n");
      out.write("color:white;\r\n");
      out.write("letter-spacing:1px;\r\n");
      out.write("font-weight:bold;\r\n");
      out.write("background-color:rgb(153, 50, 204);\r\n");
      out.write("margin-left:90px;\r\n");
      out.write("z-index:2;\r\n");
      out.write("}\r\n");
      out.write("#pp:hover\r\n");
      out.write("{\r\n");
      out.write("background-color:rgba(153, 50, 204,0.9);\r\n");
      out.write("box-shadow:2px 2px 2px 2px whitesmoke;\r\n");
      out.write("width:52%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("*\r\n");
      out.write("        {\r\n");
      out.write("            margin:0%;\r\n");
      out.write("            padding:0%;\r\n");
      out.write("        }\r\n");
      out.write("        .header\r\n");
      out.write("        {\r\n");
      out.write("            margin:0px;\r\n");
      out.write("            padding:0px;\r\n");
      out.write("            height:90px;\r\n");
      out.write("            width:100%;\r\n");
      out.write("            background-color: rgba(153, 50, 204,0.6);\r\n");
      out.write("            overflow:hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        div b{\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top:5%;\r\n");
      out.write("            left:8%;\r\n");
      out.write("            font-size: 25px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("          body\r\n");
      out.write("        {\r\n");
      out.write("            background-image: url(\"media/bg.png\");\r\n");
      out.write("            background-repeat: no-repeat;\r\n");
      out.write("            background-attachment: fixed;\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            background-size:cover;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("          .header #dd\r\n");
      out.write("        {\r\n");
      out.write("            font-size:large;\r\n");
      out.write("            position:absolute;\r\n");
      out.write("            right:18%;\r\n");
      out.write("            top:5%;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color:black;\r\n");
      out.write("        }\r\n");
      out.write("        #uu\r\n");
      out.write("        {\r\n");
      out.write("        position:absolute;\r\n");
      out.write("        left:17%;\r\n");
      out.write("        top:30%;\r\n");
      out.write("        }\r\n");
      out.write("        #displayImage\r\n");
      out.write("        {\r\n");
      out.write("        position:absolute;\r\n");
      out.write("        left:17%;\r\n");
      out.write("        top:30%;\r\n");
      out.write("        z-index:2;\r\n");
      out.write("        height:360px;\r\n");
      out.write("        width:305px;\r\n");
      out.write("        }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("        <a href=\"index.jsp\"> <img src=\"media/expenses-removebg-preview (1).png\" style=\"height:47px;width:47px;padding:22px;margin-left:33px;\"> </a>    <b>Spring Expenses Tracker</b>\r\n");
      out.write("        <a href=\"home.jsp\" id=\"dd\"><i class=\"fa-solid fa-home\"></i>&nbsp;Home</a>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");

User user=(User) session.getAttribute("userInfo");
UserService service = new UserServieImpl();


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<img src=\"media/updateuser.png\" height=\"340px\" width=\"300px\" id=\"uu\">\r\n");
      out.write("<div id=\"ep\"><br>\r\n");
      out.write("<h2 style=\"color:white;text-align:center;margin-top:4px;letter-spacing:2px;\">UPDATE YOUR PROFILE</h2>\r\n");
      out.write("<form method=\"post\" action=\"UpdateProfile\" enctype=\"multipart/form-data\">\r\n");
      out.write("<input hidden=true value=");
      out.print(user.getUserId() );
      out.write(" name=\"userId\"> <br>\r\n");
      out.write("<label>USER NAME</label><br>\r\n");
      out.write("<input type=\"text\" required value=");
      out.print(user.getUsername() );
      out.write(" name=\"username\">\r\n");
      out.write("<br><br>\r\n");
      out.write("<label>FULL NAME</label><br>\r\n");
      out.write("<input type=\"text\" required value=");
      out.print(user.getFullname() );
      out.write(" name=\"fullname\">\r\n");
      out.write("<br><br>\r\n");
      out.write("<label>EMAIL ID</label><br>\r\n");
      out.write("<input type=\"email\" required value=");
      out.print(user.getEmail() );
      out.write(" name=\"email\">\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("<label>MOBILE</label><br>\r\n");
      out.write("<input type=\"mobile\" required value=");
      out.print(user.getMobile() );
      out.write(" name=\"mobile\">\r\n");
      out.write("<br><br>\r\n");
      out.write("<label>PASSWORD</label><br>\r\n");
      out.write("<input type=\"password\" required value=");
      out.print(user.getPassword() );
      out.write(" name=\"password\">\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<label>PROFILE PHOTO</label><br>\r\n");
      out.write("<input type=\"file\"  accept=\"image/*\" name=\"imageFile\" id=\"fileInput\" ><br>\r\n");
      out.write("<img id=\"displayImage\">\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<input type=\"submit\" value=\"update profile\" id=\"pp\">\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("const fileInput=document.getElementById(\"fileInput\");\r\n");
      out.write("const displayImage=document.getElementById(\"displayImage\");\r\n");
      out.write("const uu=document.getElementById(\"uu\");\r\n");
      out.write("fileInput.addEventListener(\"change\",function()\r\n");
      out.write("		{\r\n");
      out.write("	const file=fileInput.files[0];\r\n");
      out.write("	if(file&&file.type.startsWith(\"image/\"))\r\n");
      out.write("		{\r\n");
      out.write("		const reader=new FileReader();\r\n");
      out.write("		reader.onload=function(e)\r\n");
      out.write("		{\r\n");
      out.write("			displayImage.src=e.target.result;\r\n");
      out.write("			displayImage.style.display=\"block\";\r\n");
      out.write("			uu.style.display=\"none\";\r\n");
      out.write("\r\n");
      out.write("		};\r\n");
      out.write("reader.readAsDataURL(file);\r\n");
      out.write("		}\r\n");
      out.write("		});\r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
