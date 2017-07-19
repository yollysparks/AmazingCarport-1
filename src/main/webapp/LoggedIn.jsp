<%-- 
    Document   : LoggedIn
    Created on : 19-07-2017, 17:10:10
    Author     : felesiah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSSz.css">
        <title>JSP Page</title>
    </head>
    <body>
         <body>
<nav class="navbar navbar-inverse">         
  <div class="container-fluid">  
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
          <li class="active"><a href="index.jsp">Home</a></li>
        <li><a href="Login.jsp">Login</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="order.jsp"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
    </nav>
             <FORM ACTION="OrderServlet" method="get" >
          Welcome!! You managed to login/register !    
         Name: <% out.println(session.getAttribute("name"));%>
        
        <br>
        <img src="https://www.johannesfog.dk/globalassets/inriver/resources/9078623_carport_enkelt_360x810mtr_web.jpg" alt="Carport" style="width:100%;height:500px;">
        <br>
    <center>
        <b><a href="order.jsp">see all orders!!</a></b>
    </center>    
     </FORM>
    </body>
</html>
