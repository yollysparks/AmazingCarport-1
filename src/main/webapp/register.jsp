<%-- 
    Document   : register
    Created on : 07-04-2017, 13:40:10
    Author     : Casper & Feleiash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSSz.css">
        <title> Register page</title>
        </head>
        <body>
               <ul>
  <li><a class="active" href="index.jsp">Home</a></li>
  <li><a href="Login.jsp">Login</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
</ul>
        <div class="form">
    <form  method="POST" action="Registration">
        
        Email:
        <input type="text" name="email" value="" />
        <br/><br/>
        Password:
        <input type="text" name="password1" value="" />
        <br/><br/>
        Repeat Password:
        <input type="text" name="password2" value="" />
        <br/><br/>
        First Name:
        <input type="text" name="firstName" value="" />
        <br/><br/>
        Last Name:
        <input type="text" name="lastName" value="" />
        <br/><br/>
        Address:
        <input type="text" name="address" value="" />
        <br/><br/>
        Zip:    
        <input type="text" name="zip" value="" />
        <br/><br/>
        Phone:
        <input type="text" name="phone" value="" />
        <br/><br/>
        <button>Register</button>
        
        <br/> <br/>       
             </form> 
         </div>
    </body>
</html>
