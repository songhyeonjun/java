<%@page import="java.util.ArrayList"%>
<%@page import="com.hi.mvcProject.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
    <link rel="stylesheet" type="text/css" href="resources/css/project.css">
    
<%
	ArrayList<ProductVO> list 
	= (ArrayList<ProductVO>) session.getAttribute("basket");
	int sum = 0;
	int size = 0;
	if(list != null) {
		for(ProductVO vo : list){
			sum += vo.getPrice();
		}
		size = list.size();
	}
	
%>
<center>
<span class="label label-success">담은 물건 : <span class="badge"><%=size%></span></span><br>
<span class="glyphicon glyphicon-user"></span>TOTAL: <%= sum %>원
</center>


<!-- 장바구니 개수를 예쁘게 넣기 -->		
<!-- 장바구니에 넣은 물건들의 전체금액을 계산 -->