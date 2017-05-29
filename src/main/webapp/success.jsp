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
           You managed to login/register !
        <% out.println(session.getAttribute("email"));%>
        
        <a href="CarportInput.jsp">Input your measurements to create a sketch!!</a>
    </body>
</html>
