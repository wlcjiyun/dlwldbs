<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3> Ex1) [C] HTML --(document.querySeletor)--> JS --(ajax)--> SERVLET --(메소드)--> DAO </h3>
	문자열 		:	<input type="text" class="data1"><br>
	패스워드		:	<input type="text" class="data2"><br>
	실수 			:	<input type="text" class="data3"><br>
	정수 			:	<input type="number" class="data4"><br>
	날짜 			:	<input type="date" class="data5"><br>
	날짜/시간 		:	<input type="datetime-local" class="data6"><br>
	선택버튼 		:	<input type="radio" name="data7" value="남">남	
					<input type="radio" name="data7" value="여">여<br>
	체크박스		:	<input type="checkbox" class="data8">승인<br>
	목록상자		:	<select class="data9">
						<option>안산</option><option>시흥</option><option>수원</option>
					</select><br>
	긴글상자		:	<textarea class="data10" rows="" cols=""></textarea>
	
	<button type="button" onclick="Ex1()">전송</button>
	
	<h3> Ex2) [R] DAO --(메소드)--> SERVLET --(ajax)--> JS --(document.querySeletor)--> HTML </h3>
	<div class="ex1_box"></div>
	
	<!-- 1. JQUERY( = Ajax 사용하기 위함 ) -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- 2.  -->
	<script src="index.js"></script>
</body>
</html>