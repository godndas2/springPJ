<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="600px">
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>내용</td>
		<td>작성자</td>
		<td>작성일</td>
		<td>조회수</td>
	</tr>

	<c:forEach var="board" items="${list}">
		<tr>
			<td>${board.bno}</td>
			<td>
			<a href="/board/detail?bno=${board.bno}">${board.title}</a>
			</td>
			<td>${board.content} </td>
			<td>${board.writer} </td>
			<td><fmt:formatDate value="${board.regdate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			<td>${board.viewcnt} </td>
		</tr>
	</c:forEach>
</table>
<input type="button" value="등록" onclick="location.href='/board/insert'">
</body>
</html>