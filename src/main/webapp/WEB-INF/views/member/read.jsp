<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	
		<tr>
			<td>아이디 </td>
			<td><input name="userid" value="${read.userid}" readonly></td>
		</tr>
		
		<tr>
			<td>비밀번호 </td>
			<td><input name="passwd" value="${read.passwd}"> </td>
		</tr>
	
		<tr>
			<td>이름 </td>
			<td><input name="name" value="${read.name }"> </td>
		</tr>
		
		<tr>
			<td>이메일  </td>
			<td><input name="email" value="${read.email }"> </td>
		</tr>
		
		
		<tr>
			<td colspan="2" align="center">
			<input type="button" value="수정" id="btnUpdate">
			<input type="button" value="삭제" id="btnDelete">
			</td>
		</tr>
		
	</table>
</body>
</html>