<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>제품 추가</h3>
<form action="create">
상품번호 : <input type="text" name="id"><br>
상품이름 : <input type="text" name="name"><br>
상품설명 : <input type="text" name="content"><br>
상품가격 : <input type="text" name="price"><br>
상품이미지 : <input type="text" name="img"><br>
<button type="submit">서버로 전송</button>
</form>

</body>
</html>