<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
		<div id="center">
			<h3>회원가입</h3>
			<form action="create">
				<table>
					<tr>
						<td class="left">아이디</td>
						<td class="right"><input type="text" name="id"></td>
					</tr>
					<tr>
						<td class="left">패스워드</td>
						<td class="right"><input type="text" name="pw"></td>
					</tr>
					<tr>
						<td class="left">이름</td>
						<td class="right"><input type="text" name="name"></td>
					</tr>
					<tr>
						<td class="left">전화번호</td>
						<td class="right"><input type="text" name="tel"></td>
					</tr>
					<tr>
						<td colspan="2">
						<button style="width: 200px; height: 50px;" type="submit" class="btn-success">회원가입</button>
						</td>
					</tr>
				</table>
			</form>
		</div>
</body>
</html>