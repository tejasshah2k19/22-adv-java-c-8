<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Print Request Header</title>
</head>
<body>
	<%
		Enumeration<String> headers = (Enumeration<String>) request.getAttribute("headers");
	%>


	<%
		while(headers.hasMoreElements()){//1  2  false
		
			String name = headers.nextElement();//1 2  
			out.print(name+" = > "+  request.getHeader(name)  +"<br>");
		
		}
	%>
		
		 
</body>
</html>