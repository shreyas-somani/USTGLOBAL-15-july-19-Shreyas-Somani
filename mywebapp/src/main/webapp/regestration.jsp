<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<form action="./regester" method="post">
		<table>
			<tr>
				<td>Id :</td>
				<td><input type="number" name="id">
			</tr>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name">
			</tr>
			<tr>
				<td>Age :</td>
				<td><input type="number" name="age">
			</tr>
			<tr>
				<td>Salary :</td>
				<td><input type="number" name="salary">
			</tr>
			<tr>
				<td>Designation :</td>
				<td><input type="text" name="designation">
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password">
			</tr>
			<tr>
				<td><input type="reset" value="reset"></td>
				<td><input type="submit" value="submit"></td>

			</tr>
		</table>
	</form>
</body>
</html>