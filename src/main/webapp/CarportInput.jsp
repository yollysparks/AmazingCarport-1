<%-- 
    Document   : CarportPartsGenerator
    Created on : Apr 22, 2017, 3:52:28 PM
    Author     : Jack
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSSz.css">
        <title>Carport Generator 0.1</title>
    </head>
    <body>
 <ul>
  <li><a class="active" href="index.jsp">Home</a></li>
  <li><a href="Login.jsp">Login</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
</ul>
        <h1>Carport Generator 0.1</h1>
        <form action="CarportInput" method="POST">
            Width (CM)
            <select id="width" name="width">
                <option value="300">300</option>
                <option value="360">360</option>
                <option value="390">390</option>
                <option value="600">600</option>
            </select>
            <br>
            Length (CM)
            <select id="length" name="length">
                <option value="480">480</option>
                <option value="540">540</option>
                <option value="600">600</option>
                <option value="720">720</option>
                <option value="810">810</option>
                <option value="870">870</option>
                <option value="910">910</option>
                <option value="990">990</option>
            </select>
            <br>
            <input type="submit" value="Generate">
        </form>
    <br>
<TR>
<TD><FORM ACTION="Login.jsp" method="get" >
<button type="submit">BACK</button>
</TD>
</TR>
</body>
</html>
