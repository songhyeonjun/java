<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
$(function() { // dom(document object model)
	// body dom tree로 ram에 읽어들인 후, 
	// function을 실행 익명함수
	$('#b1').click(function() {
		$.ajax({
			url : "movie",
			data : {
				title : $('#title').val(),
				price : $('#price').val()
			},
			success : function(result) {
				alert(result);
				$('#d2').html(result);
			},
			error : function() {
				alert('ajax실패@@')
			} 
		});
	});
	
	$('#b2').click(function() {
		$.ajax({
			url : "reply",
			data : {
				reply : $('#reply').val()
			},
			success : function(result) {
				alert(result);
				$('#d1').append(result + "<br>");
			},
			error : function() {
				alert('ajax실패@@');
			}
		});
	});
	
	$('#b3').click(function() {
		$.ajax( {
			url : "user",
			data : {
				user : $('#id').val()
			},
			success : function(result) {
				alert(result)
				$('#d2').html(result);
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
	영화제목 : <input type="text" name="title" id="title"><br>
	영화 관람료 : <input type="text" name="price" id="price"><br>
	<button type="submit" id="b1">영화정보 제출</button>
	
	<hr color="red">
	댓글 : <input type="text" name="reply" id="reply">
	<button id="b2">댓글</button>
	<hr color="blue">
	<div id="d1"></div>
	
	<hr color="red">
	가입할 id : <input type="text" id="id">
	<button id="b3">아이디 중복 체크</button>
	<hr color="blue">
	<div id="d2"></div> 
</body>
</html>