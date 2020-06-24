<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/stylesheet2.css">
</head>
<body>
   <div class="register-box">
      <img src="image/avatar.png" class="avatar">
         <h1>Register Here</h1>
           <form action="registrationServlet">
            <p>FullName</p>
             <input type ="text" name="fullname" placeholder="Enter your name">
             <p>Username</p>
             <input type ="text" name="username" placeholder="Enter Username">
             <p>Password</p>
             <input type ="password" name="password" placeholder="Enter Password">
             <input type="submit" value="Submit">
             
           </form>
    </div>
</body>
</html>