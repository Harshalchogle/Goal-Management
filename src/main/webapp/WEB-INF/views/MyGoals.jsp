<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h2>My Goals</h2>
<table class="table">
<tr>
<td>Goal Name</td>
<td>Microsavings</td>
<td>Transactions</td>
<td>Amount</td>
</tr>
<c:forEach items="${goals}" var="goal">
<tr>
<td>${goal.goalName}</td>
<td>${goal.microsavings}</td>
<td>${goal.nTransactions}</td>
<td>${goal.tAmount}</td>
<td><a href="${pageContext.request.contextPath}/delete?goalid=${goal.goalID}" class="btn btn-danger">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>