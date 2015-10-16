<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>The application has malfunctioned.</h4>

	<p>Please contact technical support with the following information:</p>

	<h4>
		Exception Name:
		<s:property value="exception" />
	</h4>

	<h4>
		Exception Details:
		<s:property value="exceptionStack" />
	</h4>

	<s:url action="registerInput" var="registerInputLink" />
	${registerInputLink} Server info:
	<%=application.getServerInfo()%><br> Servlet version:
	<%=application.getMajorVersion()%>.<%=application.getMinorVersion()%><br>
	JSP version:
	<%=JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion()%><br>
	Java version:
	<%=System.getProperty("java.version")%><br>
</body>
</html>