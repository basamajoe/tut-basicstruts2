<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Register</title>
<s:head />
</head>
<body>
	<h3>Register for a prize by completing this form.</h3>
	New
	<s:form action="register">

		<s:textfield key="personBean.firstName" />
		<s:textfield key="personBean.lastName" />
		<s:textfield key="personBean.email" />
		<s:textfield key="personBean.age" />

		<s:submit />

	</s:form>
	<p>
		<a href="register.jsp">Please register</a> for our prize drawing.
	</p>
</body>
</html>