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
<div class="login-page">
    <div class="form">
      <form class="form-horizontal" name ="CustomerLoginForm" action="ConsumerServlet" method="POST">
         <input type="hidden" name="formName" value="CustomerLoginForm"/>
    <form method="POST" action="Login">
      <input type="text" name ="email"/>
      <input type="password" name ="password"/>
      <button>login</button>
      <p class="message">Not registered? <a href="register.jsp">Create an account</a></p>
    </form>
  </div>
</div>
</body>
</html>
