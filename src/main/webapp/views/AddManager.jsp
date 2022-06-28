<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Calibri, Helvetica, sans-serif;
	background-color: pink;
}

.container {
	padding: 50px;
	background-color: lightblue;
}

input[type=text], input[type=password], textarea {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: orange;
	outline: none;
}

div {
	padding: 10px 0;
}

hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

.registerbtn {
	background-color: #4CAF50;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	
	width: 100%;
	opacity: 0.9;
}

.registerbtn:hover {
	opacity: 1;
}
</style>
</head>
<body>
	<form:form action="/AddManager" method="post" modelAttribute="Manager_AMS">
		<div class="container">
			<center>
				<h1>Add Pilot Details</h1>
			</center>
			<hr>
	


	
Enter Manager Name  <form:input type="text" path="managerName" placeholder="Manager Name"/></br></br>
Enter Security No  <form:input type="text" path="ssNo" placeholder="Security Number"/></br></br>
Enter DOB Number  <form:input type="text" path="dob" placeholder="Date Of Birth"/></br></br>
Enter gender <form:input type="text" path="gender" placeholder="Enter Gender"/></br></br>
Enter mobile Number <form:input type="text" path="mobNo" placeholder="Enter MobNumber"/></br></br>
Enter Email  <form:input type="text" path="email" placeholder="Enter Email"/></br></br>


		


			<button type="submit" class="registerbtn">Submit</button>
	</form:form>
</body>
</html>
