<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sp" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<form action='<sp:url value="/loginaction"></sp:url>' method="post">
<div class="form-group">
<label>Enter username</label>
<input type="text" name="username" class="form-control">
</div>
<div class="form-group">
<label>Enter Password</label>
<input type="password" name="password" class="form-control">
</div>
<input type="submit" value="Login" class="btn btn-primary">
<input type="reset" value="Reset" class="btn btn-danger">
</form>
</body>
</html>