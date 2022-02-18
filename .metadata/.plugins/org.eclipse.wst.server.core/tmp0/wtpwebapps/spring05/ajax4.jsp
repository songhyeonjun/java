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
			url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fsports%2F%3FoutputType%3Dxml&api_key=sueoydprobjhml67ekh3pxyiryfzovnzfdcm3tus",
			//url : "http://rss.hankooki.com/sports/sp_main.xml",
			data : {
				url : "https://www.chosun.com/arc/outboundfeeds/rss/category/sports/?outputType=xml",
				api_key : "sueoydprobjhml67ekh3pxyiryfzovnzfdcm3tus",
				count : 20
			},
			success : function(result) {
				alert('신문사 연결 성공.@@');
				alert(result);
				list = result.items;
				alert(list.length);
				$(list).each(function(index, news) {
					//console.log(index + "   " + news.title);
					img = news.thumbnail
					console.log(img);
					//title
					title = news.title
					link = news.link
					pubDate = news.pubDate
					//title을 클릭했을 때, link로 연결
					//날짜를 title옆에 보이도록
					str = '<a href=' + link + '>' + title + pubDate + '</a><br>';
					
					$('#d1').append('<img src="' + img + '" width=200 heigtht=200>'+ str +'<br>');
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
	<button id="b1">조선일보 (스포츠기사 받아오기)</button>
	<div id="d1"></div>
</body>
</html>