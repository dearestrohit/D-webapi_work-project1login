<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sorry! something went wrong...</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="Css/Css.css" type="text/css">

</head>
<body>

<div class="container text-center">
<img src="img/error.png " class="img-fluid">
<h3 class="display-3">Sorry! something went wrong...</h3>
 <%=exception %>
 <br>
<a href="index.jsp" class="btn primary-background btn-lg text-white mt-3">Home</a>
</div>



</body>
</html>