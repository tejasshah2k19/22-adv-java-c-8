<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Cookie</title>
</head>
<body>

<form action="SaveCookieServlet">
	CName : <input type="text" name="cname"><br><BR>
	CValue : <input type="text" name="cvalue"><br><br>
	<input type="submit" value="Save Cookie"/>
</form>
</body>
</html>