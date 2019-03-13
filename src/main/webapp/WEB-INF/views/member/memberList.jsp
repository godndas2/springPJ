<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원목록 </h2>
<table border="1" width="800px">
	<tr>
		<td>아이디</td>
		<td>이름</td>
		<td>이메일</td>
		<td>가입일</td>
	</tr>
	
	<c:forEach var="row" items="${list}">
		<tr>
			<td>${row.userid}</td>
			<td>{row.name}</td>
			<td>${row.email}</td>
			<td><fmt:formatDate value="${row.joinDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>