<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<form action='<sf:url value="/otp"></sf:url>' method="post">
<div class="container">
<h2>OTP</h2>
<div class="form-group">
<label>Enter OTP</label>
<input type="number" name="userotp">
<input type="number" name="otp" value="${otp }">
<input type="text" name="username" value="${username }">
<input type="submit" value="Validate OTP">
</div>
</div>
</form>
</body>
</html>