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
	<form:form action="/AddPlane" method="post" modelAttribute="Plane_AMS">
		<div class="container">
			<center>
				<h1>Add Plane Details</h1>
			</center>
			<hr>
		
Enter Manufactured Name  <form:input type="text" path="plaName" placeholder="Enter Plane Name"/></br></br>
Enter Registration No  <form:input type="text" path="regNo" placeholder="Enter Registration Number (UNIQUE)"/></br></br>
Enter Model Number  <form:input type="text" path="manufac"  placeholder="Enter Manufactured Name"/></br></br>
Enter plane Name  <form:input type="text" path="modelNo"  placeholder="Enter Model Number"/></br></br>
Enter Capacity  <form:input type="text" path="capacity"  placeholder="Enter Capacity"/></br></br>
Enter Email  <form:input type="text" path="email"  placeholder="Enter Email"/></br></br>

			<div>
				<label> Select OwnerId : </label> <select name="OwnerId"></br>
				</br>
					<c:forEach items="${msg}" var="category">
						<option value="${category.ownerId}">${category.ownerId}</option>
					</c:forEach>
				</select>
			</div>


			<button type="submit" class="registerbtn">Submit</button>
	</form:form>
</body>
</html>
