<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<table id="reviewTable">
			<% if(session.getAttribute("userId") != null) { %>
			<tr>
				<td>
					Reply : <input id="reply" style="width: 300px;">
					<button id="insertBtn" style="width: 50px;">OK</button>
				</td>
			</tr>
			<%} %>
			<c:forEach var="one" items="${list}">
				<tr>
					<td style="background: green; width: 500px; text-align: left; padding-left: 10px">
						<img src="resources/img/re.png" width="30" height="30"> ${one.content} - ${one.writer}
					</td>
					<td style="background: green; width: 50px; text-align: right; padding-left: 10px">
					<c:if test="${userId eq one.writer}">
						<button id="deleteBtn">X</button>
					</c:if>
					</td>
				</tr>
			</c:forEach>
			</table>