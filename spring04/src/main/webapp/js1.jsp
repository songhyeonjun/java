<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function idCheck() {
	// id에 입력한 값을 가져고 와서
	// 글자수가 5 미만이면 다시 작성하세요. 메시지 프린트
	// 미리 객체를 생성해 놨음 ==> 내장된 객체
	// window: 브라우저 전체
	// document: body태그 부분
	// console: 개발할 때 확인하는 창
	// location: 주소부분, location.href =""
	idValue = document.getElementById("id").value; // <input name="id" id="id" value="test">
	text = "";
	if(idValue.length < 5) {
		console.log("5미만 입니다. 다시 입력해주세요");
		text = "5미만 입니다. 다시 입력해주세요"
		document.getElementById("id").value = "";
	}
	else {
		console.log("5이상 입니다.");
		text = "5이상 입니다. 확인완료";
	}
	document.getElementById("result").innerHTML = text;

}
function pwCheck() {
	pw1Value = document.getElementById("pw1").value;
	pw2Value = document.getElementById("pw2").value;
	text = "";
	if(pw1Value == pw2Value) {
		console.log("일치");
		text = "<span style='color:blue;'>일치"
			+ "<img src='resources/img/ok.jpg'> </span>"
	}
	else {
		console.log("불일치");
		document.getElementById("pw1").value = "";
		document.getElementById("pw2").value = "";
		text = "<span style='color:red;'>불일치"
			+ "<img src='resources/img/no.jpg' width='200px' height='200px'> </span>"
	}
	document.getElementById("result").innerHTML = text;
}

</script>
</head>
<body>
<h3>자바 스크립트 테스트</h3>
<hr>
아이디 : <input name="id" id="id" value="test">
<button onclick="idCheck()">글자수 체크</button><br>
패스워드 : <input name="pw1" id="pw1" value="1234"><br>
패스워드2 : <input name="pw2" id="pw2" value="1234">
<button onclick="pwCheck()">패스워드 동일</button>
<hr>
<div id="result">
</div>
</body>
</html>