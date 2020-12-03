<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<form:form action="./choicecheck" method="get" modelAttribute="user">
		<label>Enter Username:</label>
		<form:input path="username" />
		<label>Enter Password:</label>
		<form:password path="password" />
		<br />
		<input type="radio" name="radios" value="create">
		<label>Create an account</label>
		<br />
		<input type="radio" name="radios" value="update">
		<label>Update an account</label>
		<br />
		<input type="radio" name="radios" value="read">
		<label>Read account details</label>
		<br />
		<input type="radio" name="radios" value="delete">
		<label>Delete an account</label>
		<br />
		<input type="submit" value="enter">
	</form:form>

</body>
</html>