<%-- 
    Document   : Receiptfog
    Created on : 19-05-2017, 13:07:49
    Author     : felesiah
--%>

<%@page import="Business.DomainModel.Order"%>
<%@page import="Data.OrderMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSSz.css">
        <title>Receipt</title>
    </head>
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
        <form action="ReceiptServlet" method="POST">   
                    
<TR> 
    <TD> Order id: <% out.print(session.getAttribute("idOrder"));%></TD><b>
<TD> # of parts: <% out.print(session.getAttribute("numberOfParts"));%></TD><br>
<TD> Payment: <% out.print(session.getAttribute("finalPrice"));%></TD><br>
<TD> Date: <% out.print (session.getAttribute("date"));%></TD><br>
<TD> Customer id:<%=session.getAttribute("customerid")%></TD><br>
</TR>    

        </form>
    </body>
</html>
