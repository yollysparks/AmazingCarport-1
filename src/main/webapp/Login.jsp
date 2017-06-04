<%-- 
    Document   : logger
    Created on : Apr 5, 2017, 7:17:51 PM
    Author     : ivoni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="CSSz.css">
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