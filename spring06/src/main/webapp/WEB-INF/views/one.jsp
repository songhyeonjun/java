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
제품 검색 결과입니다.

<hr color="yellow">
<table border=1>
	<tr>
		<td>제품번호</td>
		<td>${one.id}</td>
	</tr>
	<tr>
		<td>제품이름</td>
		<td>${one.name}</td>
	</tr>
	<tr>
		<td>제품설명</td>
		<td>${one.content}</td>
	</tr>
	<tr>
		<td>제품가격</td>
		<td>${one.price}</td>
	</tr>
	<tr>
		<td>제품이미지</td>
		<td><img src="resources/img/${one.img}"></td>
	</tr>
</table>
<a href="preup?id=${one.id}">수정하기</a>
<a href="del">삭제하기</a>
</body>
</html>