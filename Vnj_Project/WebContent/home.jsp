<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" type="text/css" href="css/stylesheet.css">
  
</head>
<body >
    <div class="login-box">
      <img src="image/avatar.png" class="avatar">
         <h1>Login Here</h1>
           <form action="loginServlet" method="post">
             <p>Username</p>
             <input type ="text" name="username" placeholder="Enter Username">
             <p>Password</p>
             <input type ="password" name="password" placeholder="Enter Password">
             <input type="submit" value="Submit">
             <a href="registration.jsp">Don't have an account? Register here</a>
           </form>
    </div>
</body>
</html>