<%-- 
    Document   : connectJspToMysql
    Created on : 23-04-2017, 11:39:54
    Author     : felesiah
--%>

<%@page import="Data.PartsMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSSz.css">
        <title>JSP Page</title>
    </head>
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
        <h2>Data from the table 'carport_parts' of database 'carport'</h2>
        <FORM ACTION="PartsServlet" method="get" >
       
        <select name="Parts">
            <option>Flat</option>
            <option>Raised</option>
        </select><input type="submit" value="Get Parts" />
       
</form>
   <TABLE>
<TR>
<TD><FORM ACTION="CarportPriceAndScetch.jsp" method="get" >
<button type="submit">BACK</button></TD>
</TR>
</TABLE>
    
</html>
