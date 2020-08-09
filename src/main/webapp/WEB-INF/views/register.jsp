<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<sf:form action="${pageContext.request.contextPath}/register" method="post" modelAttribute="user">
<div class="container col-lg-6 col-md-6 col-sm-4" >
<center><h2>Registration form</h2>
<div class="form-group">
<label>Enter First Name</label>
<sf:input path="Fname" cssClass="form-control"/>
<sf:errors path="Fname" cssClass="text-danger"/>
</div>
<div class="form-group">
<label>Enter Last Name</label>
<sf:input path="Lname" cssClass="form-control"/>
</div>
<div class="form-group">
<label>Enter Email</label>
<sf:input path="Email" cssClass="form-control"/>
</div>
<div class="form-group">
<label>Enter User Name</label>
<sf:input path="username" cssClass="form-control"/>
</div>
<div class="form-group">
<label>Enter Password</label>
<sf:password path="password" cssClass="form-control"/>
</div>
<input type="submit" value="Register" class="btn btn-success">
<input type="reset" value="Reset" class="btn btn-danger">
</div>
</center>
</sf:form>
</body>
</html>