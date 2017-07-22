<%-- 
    Document   : index
    Created on : May 16, 2017, 8:20:10 AM
    Author     : ivoni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSSz.css">
        <title>Fog Carport Generator</title>
    </head>
    <body>
<nav class="navbar navbar-inverse">         
  <div class="container-fluid">  
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
          <li class="active"><a href="index.jsp">Home</a></li>
        <li><a href="Login.jsp">Customer Login</a></li>
        <li><a href="employee.jsp">Employee Login</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="order.jsp"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
    </nav>

        <% if(session.getAttribute("customer") == null){
            out.print("You need to log in or register");
        }
        %>
    <center>
        <b> <a href="Login.jsp"> Press here to login or register</a></b>
    </center>
        <br>
        <center>
        <img src="https://www.johannesfog.dk/globalassets/inriver/resources/9078633_carport_enkelt_300x62m_web.jpg" style="width:80%;height:50%;">
        </center>
        <br>
    </body>
</html>
