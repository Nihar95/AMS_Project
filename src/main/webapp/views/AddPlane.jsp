<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body background="https://th.bing.com/th/id/OIP.dZccnbpb_thPx-UwI0eWcgHaE7?pid=ImgDet&rs=1">
<form:form action="/AddPlane" method="post" modelAttribute="Plane_AMS">
Enter Manufacturer NAme  <form:input type="text" path="plaName"/></br></br>
Enter Registration No  <form:input type="text" path="regNo"/></br></br>
Enter Model Number  <form:input type="text" path="manufac"/></br></br>
Enter plane NAme  <form:input type="text" path="modelNo"/></br></br>
Enter Capacity  <form:input type="text" path="capacity"/></br></br>
Enter Email  <form:input type="text" path="email"/></br></br>


Select OwnerId <select name="OwnerId"></br></br>
    <c:forEach items="${msg}" var="category">
        <option value="${category.ownerId}">${category.ownerId}</option>
    </c:forEach>
</select>

</br></br> <input type="submit" value="Submit" />
</form:form>
<c:out value = "${msg}"/>

</body>
</html>