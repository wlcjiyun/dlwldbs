<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3> [C] 회원등록 </h3>
	<input type="text" class="data1" placeholder="이름"><br>
	<input type="text" class="data2" placeholder="나이"><br>
	<input type="radio" name="data3" value="남">남
	<input type="radio" name="data3" value="여">여<br>
	<input type="text" class="data4" placeholder="키(cm)"><br>
	<input type="text" class="data5" placeholder="몸무게(kg)"><br>
	<input type="text" class="data6" placeholder="전화번호"><br>
	<select class="data7">
		<option>서울</option>
		<option>경기도</option>
		<option>강원도</option>
		<option>충청도</option>
		<option>경상도</option>
		<option>제주도</option>
		<option>해외거주중</option>
	</select>
	
	<button type="button" onclick="등록()">등록</button>
	
	<h3> [R] 회원 </h3>
	<div class="member_box"></div>


	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="index.js"></script>
</body>
</html>