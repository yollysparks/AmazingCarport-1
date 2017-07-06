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
