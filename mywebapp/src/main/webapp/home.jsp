<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="bean" class="com.ust.mywebapp.dto.EmployeeInfoBean" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="right">
<a href="./delete?id=<%=bean.getEmpId()%>">Delete Profile</a>
</div>
<div align="right">
<a href="./Logout">Logout</a>
</div>
<h1>Welcome<%=bean.getEmpName() %></h1>

</body>
</html>