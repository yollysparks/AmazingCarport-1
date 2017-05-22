<%-- 
    Document   : Receiptfog
    Created on : 19-05-2017, 13:07:49
    Author     : felesiah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Receipt</title>
    </head>
    <body>
        
        <form action="ReceiptServlet" method="POST">           
<TR>
<TD> Order id: <%=session.getAttribute("idOrder")%></TD><br>
<TD> # of parts: <% out.print(session.getAttribute("numberOfParts"));%></TD><br>
<TD> Payment: <% out.print(session.getAttribute("finalPrice"));%></TD><br>
<TD> Date: <%=session.getAttribute("date")%></TD><br>
<TD> Customer id:<%=session.getAttribute("customerid")%></TD><br>
</TR>    

        </form>
    </body>
</html>
