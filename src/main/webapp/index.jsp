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
        <% if(session.getAttribute("customer") == null){
            out.print("You need to log in or register");
        }
        %>
        <b> <a href="Login.jsp"> Press here to login or register</a></b>
        <br>
    </body>
</html>
