<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
//외부 url주소 가져와서 쓰기

$(function() { // dom(document object model)
	// body dom tree로 ram에 읽어들인 후, 
	// function을 실행 익명함수
	$('#b1').click(function() {
		$.ajax({
			url : 'resources/file/MOCK_DATA.json',
			success : function(result) {
				alert(result.length);
				$(result).each(function(i, one) {
					console.log(one.id);
					//div안에 1000명의 성과 이름/이메일을 프린트
					$('#d1').append(i+1 + " " + one.last_name + " " + one.first_name + " " + one.email + '<br>');
				});
			},
			error : function() {
				alert('ajax실패@@');
			} 
		});
	});

});
</script>
</head>
<body>
	<button id="b1">MOCK</button>
	<div id="d1"></div>
</body>
</html>