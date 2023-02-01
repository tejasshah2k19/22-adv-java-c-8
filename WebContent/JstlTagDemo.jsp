<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		int a = 10;
	%>
	<%=a%>
	<br>
	<%
		if (a % 2 == 0) {
	%>
	EVEN
	<%
		}
	%>

	<br>
	<br>
	<c:set var="a" value="10"></c:set>
	<c:out value="${a}"></c:out>
	<c:if test="${a%2 ==0 }">
		EVEN
	</c:if>
	<c:if test="${a%2!=0 }">
		ODD
	</c:if>


	<br>

	<c:forEach var="i" begin="1" end="10" step="2">
		${i}<br>
	</c:forEach>

	<br>

	<c:set var="str" value="mon,tue,wed,thus"></c:set>

	<c:forTokens items="${str}" delims="," var="s">
		${s}
	</c:forTokens>

	<c:remove var="str" />
	<c:if test="${a%2!=0}">
		<c:redirect url="http://www.google.com"></c:redirect>

	</c:if>
</body>
</html>









