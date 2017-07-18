<%-- 
    Document   : employee
    Created on : 16-07-2017, 13:56:45
    Author     : felesiah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Employee Login</title>
    <body>
        <link rel="stylesheet" href="CSSz.css">
   <nav class="navbar navbar-inverse">         
  <div class="container-fluid">  
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
          <li class="active"><a href="index.jsp">Home</a></li>
        <li><a href="Login.jsp">Login</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="employee.jsp">Employee</a></li>
        <li><a href="order.jsp"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
    </nav>
<div class="login-page">
    <div class="form">
    <form method="POST" action="EmployeeServlet">
      <input type="text" name ="name"/>
      <input type="password" name ="password"/>
      <button>login</button>
    </form>
  </div>
</div>
    </body>
    
</html>
