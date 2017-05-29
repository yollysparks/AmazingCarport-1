<%-- 
    Document   : receipt
    Created on : 03-05-2017, 22:28:17
    Author     : felesiah
--%>

<%@page import="Business.DomainModel.Order"%>
<%@page import="Data.OrderMapper"%>
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
    <body>
        <h2>Carport Receipt.</h2>


<font size="+3" color="red">
<% 
    try{
    int id = 0;
    Order order = OrderMapper.getOrderByID(id);
      
                order =  OrderMapper.getOrderByID(1); 
                session.setAttribute("idOrder", order.getIdOrder());
                session.setAttribute("date",order.getDate());
                session.setAttribute("payment",order.getPayment());
                session.setAttribute("customerId",order.getCustomerId());
                response.sendRedirect("Receiptfog.jsp");
           
} catch (Exception ex) {
%>
<font size="+3" color="red"></b>
<%
out.println("Unable to connect to database.");
}

     
%>
<font size="+2" color="Black">
<TABLE>
    <TR>
        <td>Get your receipt! </td> 
    <br>
    <button type="submit">PRINT</button></TD>
    </TR>
    <br><TD><FORM ACTION="connectJspToMysql.jsp" method="get" >
        <button type="submit">GET YOUR PARTS LIST.</button></TD>
<TR>
<TD><FORM ACTION="CarportInput.jsp" method="get" >
<button type="submit">BACK</button></TD>
</TR>
</TABLE>
 </body>
</html>