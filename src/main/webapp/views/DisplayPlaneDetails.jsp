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
			<th>Plane Id</th>
			<th>Plane Name</th>
			<th>Registration Number</th>
			<th>Manufactured Name</th>
			<th>Model Number</th>
			<th>Capacity</th>
			<th>Email</th>
			<th>OwnerId</th>
			<th>HangerId</th>
		</tr>
	</thead>
	
	<c:forEach var="lang" items="${planeDetails}">
        <font color="#00CC00"><c:out value="${lang}"/>,</font>

	
	
	<tbody>
		<tr>
			<td>${lang.planeId }</td>
			<td>${lang.plaName }</td>
			<td>${lang.regNo }</td>
			<td>${lang.manufac }</td>
			<td>${lang.modelNo }</td>
			<td>${lang.capacity }</td>
			<td>${lang.email }</td>
			<td>${lang.owner_AMS.getOwnerId()}</td>
			<td>${lang.hanger_AMS.getHangerId() }</td>
		
			
		</tr>
		
	</tbody>
	   </c:forEach>
</table>
</body>
</html>