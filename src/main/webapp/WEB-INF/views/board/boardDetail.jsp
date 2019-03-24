<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		
		$("#btnDelete").click(function(){
			if(!confirm("삭제하시겠습니까?")){return;}
			document.form1.action = "/board/delete";
			document.form1.submit();	
		})
		$("#btnUpdate").click(function(){
			if(!confirm("수정하시겠습니까?")){return;}
			document.form1.action = "/board/update";
			document.form1.submit();	
		})
	});	
</script>
</head>
<body>
<form name="form1" method="post">
<table>
	<tr>
		<td>번호</td>
		<td><input name="bno" value="${bno.bno}" readonly></td>
	</tr>
	<tr>
		<td>제목</td>
		<td><input name="title" value="${bno.title}"></td>
	</tr>
	<tr>	
		<td>내용</td>
		<td><input name="content" value="${bno.content}"> </td>
	</tr>
	<tr>	
		<td>작성자</td>
		<td><input name="writer" value="${bno.writer}" readonly> </td>
	</tr>
	<tr>
		<td>조회수</td>
		<td><input name="viewcnt" value="${bno.viewcnt}" readonly></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="button" value="수정" id="btnUpdate">
			<input type="button" value="삭제" id="btnDelete">
			<input type="button" value="목록으로" onclick="location.href='/board/list'">
			<input type="reset" value="초기화">
		</td>
	</tr>
</table>


</form>
</body>
</html>