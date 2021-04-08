<%@page import="com.project1login.helper.connectionProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="Css/Css.css" type="text/css">



</head>


<body>
<%@include file="navbar.jsp" %>

<div class="container-fluid p-0 m-0">
<div class="jumbotron primary-background text-white">
<h3>Welcome to Buyzigar</h3>
<a href="">About </a>

<br>



<a href="RegisterPage.jsp" class="btn btn-outline-light btn-lg"><span><i class="fa fa-user-plus" aria-hidden="true">  </i></span>Start! its Free</a>
<a href="LoginPage.jsp" class="btn btn-outline-light btn-lg"><span><i class="fa fa-user-circle-o fa-spin" aria-hidden="true"></i> </span>Login</a>
</div>
</div>

<div class="container">
<div class="row">
<div class="col-md-4">
<div class="card" >
  <div class="card-body">
    <h5 class="card-title">Java</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-background text-white">Read More</a>
  </div>
</div>
</div>
<div class="col-md-4">
<div class="card" >
  <div class="card-body">
    <h5 class="card-title">Python</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-background text-white">Read More</a>
  </div>
</div>
</div>
<div class="col-md-4">
<div class="card" >
  <div class="card-body">
    <h5 class="card-title">Html</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-background text-white">Read More</a>
  </div>
</div>
</div>
<div class="col-md-4">
<div class="card" >
  <div class="card-body">
    <h5 class="card-title">Css</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-background text-white">Read More</a>
  </div>
</div>
</div>
<div class="col-md-4">
<div class="card" >
  <div class="card-body">
    <h5 class="card-title">MySql</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-background text-white">Read More</a>
  </div>
</div>
</div>
<div class="col-md-4">
<div class="card" >
  <div class="card-body">
    <h5 class="card-title">Big Data</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-background text-white">Read More</a>
  </div>
</div>
</div>
</div>
</div>



<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="js/myJs.js" type="text/javascript"> </script> 
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>                 
</body>
</html>

