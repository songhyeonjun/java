<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>Insert title here</title>
      <link rel="stylesheet" type="text/css" href="resources/css/out.css">
	  <script type="text/javascript" src="resources/js/out.js"></script>
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	  <script type="text/javascript">
	  	//Document Object Model(DOM) tree
	  	$(function() {
	  		// JQUERY : 자주 쓰는 자바스크립트 기능을
	  		// 라이브러리로 만들어 놓은 것.
	  		// 복잡한 문법을 단순화 시켜줌 
	  		// alert('html이 ram에 모두 로딩 되었음.')
	  		alert("아이디가${user}인 ${name}님 환영합니다.")
	  	});
	  </script>
   </head>
   <body>
  <h1>환영합니다..</h1><br>
   <hr>
   <img src="resources/img/naver.png">
   <form action="insert">
    이름   : <input type="text" name="name"><br>
  url : <input type="text" name="url"><br>
  img : <input type="text" name="img"><br>
  <button type="submit">book 만들기 </button>
  </form>
   </body>
</html>