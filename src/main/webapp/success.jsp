<%-- 
    Document   : success
    Created on : May 13, 2017, 5:37:54 PM
    Author     : ivoni
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

  <ul>
  <li><a class="active" href="index.jsp">Home</a></li>
  <li><a href="Login.jsp">Login</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
</ul>
    
          Welcome!! You managed to login/register !    
       Email: <% out.println(session.getAttribute("email"));%>
        
        <br>
        <img src="https://www.johannesfog.dk/globalassets/inriver/resources/9078623_carport_enkelt_360x810mtr_web.jpg" alt="Carport" style="width:100%;height:500px;">
        <br>
    <center>
        <b><a href="CarportInput.jsp">Input your measurements to create a sketch!!</a></b>
    </center>    

    </body>
</html>
