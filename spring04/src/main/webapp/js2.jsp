<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
<script>
$(function() { // body를 먼저 읽고 와서 
			   // 메모리에 dom tree로 읽어 들이면
			   // 함수의 내용대로 처리
			   
	// 아이디가 b1인 것을 클릭 했을 때 가로안에 넣은 이름 없는 함수를 실행
	$('#b1').click(function() {
		//alert("b1이 클릭되었음");
		idValue = $('#id').val();
		if(idValue.length < 5) {
			$('#result').html('유효하지 않음');
			// appendS() : 댓글처럼 계속 끝에 붙임.
			// html() : 태그가 있는 html코드 일부분으로 대체
			// text() : 태그가 없는 텍스트만
			$('#id').val('')
		}
		else {
			$('#result').html('유효함');
		}
	});
	
	$('#b2').click(function() {
		pw1Value = $('#pw1').val();
		pw2Value = $('#pw2').val();
		
		if(pw1Value == pw2Value) {
			$('#result').html('패스워드 일치');
		}
		else {
			$('#result').html('패스워드 불일치');
			$('#id').val('');
		}
	});
});

</script>
</head>
<body>
<h3>자바 스크립트 테스트</h3>
<hr>
아이디 : <input name="id" id="id" value="test">
<button id="b1">글자수 체크</button><br>
패스워드 : <input name="pw1" id="pw1" value="1234"><br>
패스워드2 : <input name="pw2" id="pw2" value="1234">
<button id="b2">패스워드 동일</button>
<hr>
<div id="result">
</div>
</body>
</html>