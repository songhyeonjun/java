<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/project.css">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<script>
	$(function() { // 장바구니
		$('#plus').click(function() {
			$.ajax({
				url : 'plus',
				data : {
					id : ${one.id},
					name : '${one.name}',
					price : ${one.price}
				},
				success : function(result) {
					alert(result);
					if(confirm("장바구니를 확인 하시겠습니까?")) {
						loction.href="basket.jsp";
					}
				},
				error : function() {
					alert("ajax 에러발생");
				}
			});
		});
	});
</script>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="../../top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="../../top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<h3>제품 상세정보</h3>
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
			<a href="product.jsp">
		<button style="width: 200px; height: 50px;">전체목록</button>
	</a>
	<tr>
		<td conspan="2">
			<button id="plus" style="width: 200px; height: 50px;">
				<img alt="" src="resources/img/bag.png" width="50px" height="50px">
			</button>
		</td>
	</tr>

		</div>
	</div>
	
</body>
</html>