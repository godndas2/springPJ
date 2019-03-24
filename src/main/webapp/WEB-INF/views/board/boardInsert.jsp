<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<h2>게시물 작성</h2>
<body>
	<form action="/board/insert" method="post" name="form1" > 

	<table>
	
	<tr>
	<td>제목</td> 
	<td><input name="title" id="title" size="80" placeholder="제목을 입력하세요"></td>
	</tr>
	<tr style="width: 1000px;">
		<td>내용</td>
		<td><textArea id="content" name="content" rows="3" cols="80" placeholder="내용을 입력하세요"></textArea></td>
	</tr>
	<tr>
	<td>작성</td> 
	<td><input name="writer" id="writer" size="80" ></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="submit" value="확인">
	</tr>
	</table>
			
	
	</form>
</body>
</html>