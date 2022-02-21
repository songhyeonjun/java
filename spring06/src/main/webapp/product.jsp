<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>제품정보 검색</h3>
<form action="one">
제품번호 : <input type="text" name="id"><br>
<button type="submit">제품으로 이동</button>
</form>
<hr>

<h3>제품전체검색</h3>
<a href="all">
	<button>전체 검색 요청</button>
</a>
<hr>

<h3>제품 수정</h3>
<form action="up">
상품번호 : <input type="text" name="id"><br>
상품이름 : <input type="text" name="name"><br>
상품설명 : <input type="text" name=content><br>
가격 : <input type="text" name="price"><br>
<button type="submit">서버로 전송</button>
</form>

</body>
</html>