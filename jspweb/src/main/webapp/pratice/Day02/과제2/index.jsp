<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>[C]학생 명단</h3>
	이름 			: <input type="text" class="data1"><br>
	전화번호 		: <input type="text" class="data2"><br>
	키(실수) 		: <input type="text" class="data3"><br>
	나이(정수) 	: <input type="number" class="data4"><br>
	등록일(날짜) 	: <input type="datetime" class="data5"><br>
	성별		 	: <input type="radio" name="data6" value="남">남
					<input type="radio" name="data6" value="여">여<br>
	개인정보동의 	: <input type="checkbox" class="data7"><br>
	거주지 		: <select class="data8">
						<option>안산</option><option>시흥</option>
						<option>안양</option><option>수원</option>
					</select><br>
	자기소개 		: <textarea rows="" cols="" class="data9"></textarea>
	
	<button type="button" onclick="과제2()">SEND</button>
	
	<h3>[R]TABLE</h3>
	<div class="과제2_box"></div>

	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="index.js"></script>
</body>
</html>