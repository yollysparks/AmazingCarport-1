 <%-- 
    Document   : CarportPartsGenerated
    Created on : Apr 22, 2017, 4:44:11 PM
    Author     : Jack
    
    A JSP that uses lots of dummy data input and hardcoded SVG scetches
--%>

<%@page language='java' contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSSz.css">
        <title>JSP Page</title>
    </head>
    <body>
        <b><font size="+2" color="Black"></b>
        Total Price is : <% out.print(session.getAttribute("finalPrice"));%>
        <br>
        # of parts: <% out.print(session.getAttribute("numberOfParts"));%>
        <br>
        <div>
       <% out.print(session.getAttribute("sideDraw"));%>
       <br>
       <% out.print(session.getAttribute("topDraw"));%>
<TABLE>
    <TR>
        <p><b>Print your sketch!</b> </p> 
    <br>
    <TD><FORM ACTION="receipt.jsp" method="get" >
    <button type="submit">FINALIZE ORDER</button></TD>
    <br>
    </TR>
</TABLE>   
<TABLE>
<TR>
<TD><FORM ACTION="CarportInput.jsp" method="get" >
<button type="submit">BACK</button></TD>
</TR>
</TABLE>
    </body>
</html>
