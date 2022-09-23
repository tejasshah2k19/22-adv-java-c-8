<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String firtName = (String) request.getAttribute("firstName");
		String email = (String) request.getAttribute("email");
		String password = (String) request.getAttribute("password");
	%>

	FirstName : <%=firtName%><br> 
	Email :  <%=email%><br> 
	Password :  <%=password%>
	

	
</body>
</html>

