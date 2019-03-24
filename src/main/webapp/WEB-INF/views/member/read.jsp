<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>

<script>
	$(function() {
		$("#btnUpdate").click(function() {
			document.form1.action = "/member/update";
			document.form1.submit();
		});
		$("#btnDelete").click(function() {
			if (confirm("삭제하시겠습니까?")) { 
				document.form1.action = "/member/delete";
				document.form1.submit();
			}
		});
	});
</script>
</head>
<body>
<form name="form1" method="post"> 

	<table>

		<tr>
			<td>아이디</td>
			<td><input name="userid" value="${read.userid}" readonly></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input name="passwd" value="${read.passwd}"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input name="name" value="${read.name }"></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><input name="email" value="${read.email }"></td>
		</tr>

		<tr>
			<td colspan="2" align="center">
				<input type="button" value="수정" id="btnUpdate"> 
				<input type="button" value="삭제"id="btnDelete">
				<div style="color: gray;">${message}</div>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>