<%@page import="com.ust.usttyspringmvc.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
Employee employee=(Employee)session.getAttribute("emp");
%>
<body>
<div>
<span style="float:right">

<a href="./home">Home</a>
<a href="./logout">Logout</a>

</span>
</div>
<form action="./update" method="post">
		<table>
		<tr>
				<td>ID :</td>
				<td><input type="number" name="id" value="<%=employee.getId()%>" readonly="readonly"></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name" required ="required" value=""></td>
			</tr>
			<tr>
				<td>Dob :</td>
				<td><input type="date" name="date"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password" required ="required" value="<%=employee.getPassword()%>" ></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>

</body>
</html>