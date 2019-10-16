<%@page import="com.ust.mywebapp.dto.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page errorPage="error.jsp"  %>
    <%@ include file="index.jsp" %>
    
<jsp:useBean id="emp" class="com.ust.mywebapp.dto.EmployeeInfoBean" scope="application"/>
<%
int i=1/0;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><%= emp.getEmpName() %></h1>
<h1><%= emp.getEmpId() %></h1>

<%
EmployeeInfoBean bean=(EmployeeInfoBean) application.getAttribute("emp");
%>

</body>
</html>