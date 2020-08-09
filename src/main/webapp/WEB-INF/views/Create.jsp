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
<sf:form action="${pageContext.request.contextPath}/create" method="post" modelAttribute="goal">
<div class="container">
<h2>Create Yor Goal!!!</h2>
<div class="form-group">
<label>Set Goal Name</label>
<sf:input path="goalName" cssClass="form-control"/>
</div>
<div class="form-group">
<label>Enter Transaction Amount</label>
<sf:input path="tAmount" cssClass="form-control"/>
</div>
<div class="form-group">
<label>Enter No. of Transactions</label>
<sf:input path="nTransactions" cssClass="form-control"/>
</div>
<div class="form-group">
<label>Enter Microsavings</label>
<sf:input path="microsavings" cssClass="form-control"/>
</div>
<div class="form-group">
<label>Enter Expiration Duration(in months)</label>
<sf:input path="Duration" cssClass="form-control"/>
</div>
<input type="submit" value="Create Goal" class="btn btn-primary"/>
<input type="reset" value="Reset" class="btn btn-danger"/>
</div>
</sf:form>
</body>
</html>