<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type=text/css>
body {
	margin: 2em;
}

.table-bordered.card {
	border: 0 !important;
}
.card thead {
	display: none;
}

.card tbody tr {
	float: left;
	width: 25em;
	margin: 0.5em;
	border: 1px solid #bfbfbf;
	border-radius: 0.5em;
	background-color: transparent !important;
	box-shadow: 0.25rem 0.25rem 0.5rem rgba(0, 0, 0, 0.25);
}
.card tbody tr td {
	display: block;
	border: 0;
}

p {
	text-align: center;
	color: limegreen;
	font-size: 1.5em;
	font-weight: bold;
	text-shadow: 1px 1px 2px #000;
	margin-bottom: 1.2em;
}

a:link {
  color: green;
  background-color: transparent;
  text-decoration: none;
}
a:visited {
  color: pink;
  background-color: transparent;
  text-decoration: none;
}
a:hover {
  color: red;
  background-color: transparent;
  text-decoration: underline;
}
a:active {
  color: yellow;
  background-color: transparent;
  text-decoration: underline;
}

</style>

<body>
<p>All Plane details from database</p>
<a href="AdminLogin" color=>Go Back</a></br></br>
<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
	<thead>
		<tr>
	
		
			<th>Manager Id</th>
			<th>Manager Name</th>
			<th>Security Number</th>
			<th>Hanger Id</th>
			<th>Date Of Birth</th>
			<th>Gender</th>
			<th>Mobile Number</th>
			<th>Email</th>
			<th>Address Id</th>
		</tr>
	</thead>
	
	<c:forEach var="lang" items="${managerDetails}">
        <font color="#00CC00"><c:out value="${lang}"/>,</font>

	
	
	<tbody>
		<tr>
			<td>${lang.managerId }</td>
			<td>${lang.managerName }</td>
			<td>${lang.ssNo }</td>
			<td>${lang.hangerId.hangerId }</td>
			<td>${lang.dob }</td>
			<td>${lang.gender }</td>
			<td>${lang.mobNo }</td>
			<td>${lang.email}</td>
			<td>${lang.addressId.getAddressId() }</td>
		
			
		</tr>
		
	</tbody>
	   </c:forEach>
</table>
</body>
</html>