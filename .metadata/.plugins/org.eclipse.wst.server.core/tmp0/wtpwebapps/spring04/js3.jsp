<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="ko">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Dialog - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
  <script>
  $( function() {
	$("#b1").click(function() {
		$("#dialog2").css('visibility', 'visible');
		$( "#dialog2" ).dialog();
	});
	
	$("#b2").click(function() {
		$("#dialog1").css('visibility:', 'visible');
		$( "#dialog1" ).dialog();
	});
});
  
 
  </script>
</head>
<body>
 
 <button id="b1">오늘 일정은?</button>
 <button id="b2">오늘 점심 메뉴는?</button>
<div id="dialog1" title="오늘 점심 메뉴는?">
  <p style="visibility: hidden">궁금하네요</p>
</div>
<div id="dialog2" title="오늘 일정은?">
  <p style="visibility:hidden">수업!!!</p>
</div>
 
 
</body>
</html>