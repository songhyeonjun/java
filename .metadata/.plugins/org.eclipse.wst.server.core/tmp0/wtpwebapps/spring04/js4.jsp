<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Accordion - Collapse content</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#accordion" ).accordion({
      collapsible: true
    });
  } );
  </script>
</head>
<body>
 
<div id="accordion">
  <h3>자바란</h3>
  <div>
    <p>썬 마이크로시스템즈에서 1995년에 개발한 객체 지향 프로그래밍 언어. 창시자는 제임스 고슬링이다. 2010년에 오라클이 썬 마이크로시스템즈를 인수하면서 Java의 저작권을 소유하였다. 현재는 OpenJDK는 GPL2이나 오라클이 배포하는 Oracle JDK는 상업라이선스로 2019년 1월부터 유료화정책을 강화하고 있다. Java EE는 이클립스 재단의 소유이다. Java 언어는 J2SE 1.4부터는 Java Community Process (JCP)에서 개발을 주도하고 있다.</p>
  </div>
  <h3>C 언어란</h3>
  <div>
	<p>1972년에 벨 연구소(Bell Labs)의 데니스 리치[5]가 만든 프로그래밍 언어. 원래 명칭은 그냥 'C'지만 한국에서는 표제어에서도 볼 수 있듯 'C언어'라는 명칭으로 주로 부른다. 세계적으로 가장 많이 쓰이는 프로그래밍 언어 중 하나이다.</p>
  </div>
  <h3>파이썬이란</h3>
  <div>
	<p>1991년에 발표된 인터프리터 방식의 프로그래밍 언어다. 영어와 비슷해서 읽고 쓰기 쉬운 특유의 문법과 그로 인해 전 세계의 개발자들로부터 만들어진 수많은 패키지들 덕분에 사용할 수 있는 용도가 무궁무진해져 2010년대 중반부터 주류 프로그래밍 언어로 당당히 올라서게 되었다.</p>
  </div>
  <h3>코홀이란</h3>
  <div>
	<p>3세대 프로그래밍 언어로, 1959년에 처음으로 나왔다. 이후 여러 번 규격이 개정되어 현재는 객체 지향도 지원한다. 개념이 상당히 오래묵기는 했지만 처음부터 일반인도 쓸 수 있도록 만들었기에 배우기 어렵지 않은 편이다.</p>
  </div>
</div>
 
 
</body>
</html>