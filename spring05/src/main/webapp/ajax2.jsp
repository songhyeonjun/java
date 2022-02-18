<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
$(function() {
	$('#b1').click(function() {
		$.ajax({
			url : "money.do",
			data : {
				money : $('#money').val(),
				choice : $('#choice').val()
			},
			success: function(x) {
				alert('성공!');
				$('#result').html('결제금액 : ' + x);
			},
			error: function() {
				alert('실패!');
			},
		});
	});
});
</script>
</head>
<body>
결재금액 : <input type="text" id="money"><br>
결재수단(1.계좌이체, 2.신용카드, 3.휴대폰결제) : <input type="text" id="choice">
<button id="b1">결제하기</button>
<hr>
<div id="result"></div>
</body>
</html>