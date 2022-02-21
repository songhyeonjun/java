<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	td{
	width 150;}
	td
</style>
</head>
<body>
회원정보 검색 결과입니다.
<br> ${one}
<hr color="yellow">
<form action="up">
<table border=1>
	<tr>
		<td>상품 번호</td>
		<td>
			<input value="${one.id}" name="id" readonly="readonly">
		</td>
	</tr>
	<tr>
		<td>상품이름</td>
		<td><input value="${one.name}" name="name"></td>
	</tr>
	<tr>
		<td>상품정보</td>
		<td><input value="${one.content}" name="content"></td>
	</tr>
	<tr>
		<td>가격</td>
		<td><input value="${one.price}" name="price"></td>
	</tr>
	<tr>
		<td>이미지</td>
		<td>${one.img}</td>
	</tr>
</table>
<button type="submit">수정하기</button>
</form>







</body>
</html>