<%@page import="com.ust.usttyspringmvc.dto.Employee"%>
<%@page import="java.util.List"%>
<%@page import="org.w3c.dom.ls.LSInput"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	List<Employee> employees = (List) request.getAttribute("list");
	Employee emp = (Employee) session.getAttribute("emp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="right">
		<span><a href="./update">Update Profile</a> </span> <span><a
			href="./delete?id=<%=emp.getId()%>">Delete Profile</a> </span> <span><a
			href="./logout">Logout</a> </span>

		<div>
			<a href="./home">Home</a>
		</div>
	</div>
	<table style="border: 1px solid black;">
		<tr>
			<th style="border: 1px solid black;">ID</th>
			<th style="border: 1px solid black;">NAME</th>
			<th style="border: 1px solid black;">DOB</th>
			<th style="border: 1px solid black;">EMAIL</th>
		</tr>
		<%
			for (Employee employee : employees) {
		%><tr>
			<td style="border: 1px solid black;"><%=employee.getId()%></td>
			<td style="border: 1px solid black;"><%=employee.getName()%></td>
			<td style="border: 1px solid black;"><%=employee.getDate()%></td>
			<td style="border: 1px solid black;"><%=employee.getEmail()%></td>


		</tr>
		<%
			}
		%>

	</table>

</body>
</html>