<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}
</style>
</head>

<body>
<div class= "justify-content-center">
<h1>Welcome to your personal To-do List!</h1></div>

<form action = '/login.do' method='POST'>
<font color ="red">${errorMessage}</font>

  <!-- Email input -->
  <div class="form-outline mb-4 justify-content-center">
    <label class="form-label">Username</label>
    <input type="name" name="name"/>
    
  </div>

  <!-- Password input -->
  <div class="form-outline mb-4 justify-content-center">
     <label class="form-label">Password</label>
  
    <input type="password" name="password" />
  </div>


 

  <!-- Submit button -->
  <button type="submit" class="btn btn-primary">Sign in</button>

 

</form>
</body>
</html>