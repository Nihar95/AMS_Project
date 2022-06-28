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

<style>
html,
body {
  height: 100%;
}

body {
  margin: 0;
  background: linear-gradient(45deg, #49a09d, #5f2c82);
  font-family: sans-serif;
  font-weight: 100;
}

.container {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}

table {
  width: 1500px;
  border-collapse: collapse;
  overflow: hidden;
  box-shadow: 0 0 20px rgba(0,0,0,0.1);
}

th,
td {
  padding: 15px;
  background-color: rgba(255,255,255,0.2);
  color: #fff;
}

th {
  text-align: left;
}

thead {
  th {
    background-color: #55608f;
  }
}

tbody {
  tr {
    &:hover {
      background-color: rgba(255,255,255,0.3);
    }
  }
  td {
    position: relative;
    &:hover {
      &:before {
        content: "";
        position: absolute;
        left: 0;
        right: 0;
        top: -9999px;
        bottom: -9999px;
        background-color: rgba(255,255,255,0.2);
        z-index: -1;
      }
    }
  }
}
</style>

<body>
<form action="Allotment">
Select Plane Id <select name="plane"></br></br>
    <c:forEach items="${planeDetails}" var="category">
        <option value="${category.planeId}">${category.planeId}</option>
    </c:forEach>
</select>

Release Hanger<select name="plane"></br></br>
    <c:forEach items="${planeDetails2}" var="category">
        <option value="${category.planeId}">${category.planeId}</option>
    </c:forEach>
</select>
<div class="container">
  <table>
    <thead>

      <tr>
        <th>Hanger Id</th>
        <th>Hanger Location</th>
        <th>Hanger Total Capacity</th>
        <th>Available Hanger Capacity</th>
        <th>Book Hanger</th>
      </tr>
    </thead>
    
  <c:forEach var="lang" items="${availableHanger}">
        <font color="#00CC00"><c:out value="${lang}"/>,</font>
    <tbody>
      <tr>
        <td>${lang.hangerId}</td>
        <td>${lang.hangerLoc}</td>
        <td>${lang.capacity}</td>
        <td>${lang.status}</td>
       
        <td><input type="radio" name="select" value=${lang.hangerId} /></td>
      </tr>
    </tbody>
     </c:forEach>
     
     
  </table>
</div>
<input type="submit" value="submit">
</form>
</body>
</html>