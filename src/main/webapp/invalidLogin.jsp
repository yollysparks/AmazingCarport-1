<%-- 
    Document   : invalidLogin
    Created on : 09-04-2017, 14:50:39
    Author     : felesiah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

    <head>

<link rel="stylesheet" href="CSSz.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invalid Login</title>

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
          <h1>Hello there....... </h1>
          <% session.getAttribute("failed");%>
         <center>
            Sorry, you are not a registered user! Please sign up first.
         </center>
      <div class="login-page">
    <div class="form">
    <form method="POST" action="Login">
      <input type="text" name="email"/>
      <input type="password" name="password"/>
      <button>login</button>
      <p class="message">Not registered? <a href="register.jsp">Create an account</a></p>
    </form>
  </div>
</div>
    </body>
</html>
