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
	<form:form action="/AddAddress" method="post" modelAttribute="Address_AMS">
		<div class="container">
			<center>
				<h1>Add Address Details</h1>
			</center>
			<hr>
	

	
	
Enter  House Number <form:input type="text" path="houseNo" placeholder="Enter House Number"/></br></br>
Enter  Locality  <form:input type="text" path="Locality" placeholder="Enter Locality"/></br></br>
Enter  City  <form:input type="text" path="city" placeholder="Enter City"/></br></br>
Enter  State <form:input type="text" path="State" placeholder="Enter State"/></br></br>
Enter  Country <form:input type="text" path="country" placeholder="Enter Country"/></br></br>
Enter  Pin Number  <form:input type="text" path="pinNo" placeholder="Enter PinNumber"/></br></br>


		


			<button type="submit" class="registerbtn">Submit</button>
	</form:form>
</body>
</html>
