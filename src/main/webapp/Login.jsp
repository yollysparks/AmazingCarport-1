<%-- 
    Document   : logger
    Created on : Apr 5, 2017, 7:17:51 PM
    Author     : ivoni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="CSSz.css">
<title> Welcome to Fog Webshop!!</title>
</head>
<body>
  <ul>
  <li><a class="active" href="index.jsp">Home</a></li>
  <li><a href="Login.jsp">Login</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
  </ul>
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