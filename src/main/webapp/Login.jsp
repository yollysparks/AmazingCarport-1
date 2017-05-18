<%-- 
    Document   : logger
    Created on : Apr 5, 2017, 7:17:51 PM
    Author     : ivoni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="CSSz.css">
<div class="login-page">
    <% if(request.getAttribute("login") == null){
        out.print("You eff that up !!!");
    }%>
  <div class="form">
    <form method="POST" action="Login">
      <input type="text" name="email"/>
      <input type="text" name="password"/>
      <button>login</button>
      <p class="message">Not registered? <a href="register.jsp">Create an account</a></p>
    </form>
  </div>
</div>