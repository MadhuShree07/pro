<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Message Page</title>
<title>Message</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link href="css/custom.css" rel="stylesheet">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">X-workz</a>
		<li class="nav-item active"><a class="nav-link" href="AddAppInfo.jsp">Add App Info</a>
	</nav>
	<br>
	<div>
		<form action="springboot" method="post">
			<label>From: </label> <input type="text" name="fromName"
				placeholder="enter from whom your sending"><br> <label>Enter
				message: </label> <input type="text" name="message"
				placeholder="enter message">
			<div>
				<input type="submit" value="Send" id="send">
				<a class="nav-link" href="AddAppInfo.jsp">AddAppInfo</a>
			</div>
		</form>
	</div>
</body>
</html>