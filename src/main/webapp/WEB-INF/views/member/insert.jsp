<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h2>회원 등록</h2>
<form action="/member/insert" method="post" name="form1">
<table border="1" width="800px">
	<tr>
		<td>아이디</td>
		<td><input name="userid"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input name="passwd" type="password"></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input name="name"></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><input name="email"></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="submit" value="확인">
	</tr>
</table>
</form>
</body>
</html>