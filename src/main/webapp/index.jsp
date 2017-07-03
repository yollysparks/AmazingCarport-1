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

        <ul>
  <li><a class="active" href="index.jsp">Home</a></li>
  <li><a href="Login.jsp">Login</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
</ul>


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
