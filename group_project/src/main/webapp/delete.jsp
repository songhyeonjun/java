<%@page import="web.BoardDAO"%>
<%@page import="web.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
	BoardDAO boardDAO = new BoardDAO();
	
	int idx = Integer.parseInt(request.getParameter("idx"));
	// 
	BoardVO boardVO = boardDAO.board_view(idx);
	
	// 
	boardDAO.delete(idx); 

 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

alert("글이 삭제되었습니다.");
location = "list.jsp";

</script>
</head>
<body>

</body>
</html>