<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원목록</h2>
<table border="1" style="width:800px">
	<tr>
		<td>아이디</td>
		<td>이름</td>
		<td>이메일</td>
		<td>가입일</td>
	</tr>
	
	<c:forEach var="row" items="${list}">
		<tr>
			<td>${row.userid}</td>
			<td>
			<a href="/member/read?userid=${row.userid}">${row.name}</a>
			</td>
			<td>${row.email}</td>
			<td><fmt:formatDate value="${row.join_date}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
		</tr>
	</c:forEach>
</table>
<input type="button" value="회원등록" onclick="location.href='/member/insert'">
</body>
</html>