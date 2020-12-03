<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hi ${user.username}, enter new user details
	<form:form action="./update" method="get" modelAttribute="newuser">
	enter new name:<form:input path="username" />
	enter new password:<form:password path="password" />
	</form:form>
</body>
</html>