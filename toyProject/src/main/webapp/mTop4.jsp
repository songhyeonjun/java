<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
<div class = "infoBox">
<div class="pwChange">
					<a>${mId}님 환영합니다.</a>
				
<a href = "mMyInfo?mId=${mId}" target = "parent" class = "link_my" data-clk = "mModify">"마이 페이지"</a>
 </div>
 <button type="button" class="btn" id="outBtn" onclick="location">
                        <span>로그아웃</span>
                    </button>
</div>
           
</body>
</html>