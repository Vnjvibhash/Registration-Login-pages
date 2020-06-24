<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/stylesheet3.css">
</head>
<body>
   <div class="register-box">
     
         <h1>Enter your url</h1>
           <form action="welcomeServlet" method="post">
           
             <input type ="text" name="url" placeholder="Enter your url here">
             <input type="submit" value="Submit">
             
           </form>
    </div>
</body>
</html>