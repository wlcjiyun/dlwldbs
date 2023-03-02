<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP WEB PROJECT</title>
</head>
<body>

	JSP WEB PROJECT START( Ctrl + F11 )
	<h3> Ex1) [C:쓰기] 입력받은 데이터 -> JS -> 서블릿 -> DAO </h3>
	<input type="text" class ="inputdata">
	<button type="button" onclick="Ex1()">Ex1 실행</button>
	
	<h3> Ex2) [R:읽기] DAO -> 서블릿 -> JS -> HTML </h3>
	<div class="ex2box">
		<!-- 서블릿에게 받은 데이터가 표시되는 구역 -->
	</div>
	
	<h3> 과제1) Q1 </h3>
	<input type="text" class ="inputQ1data" placeholder="데이터 입력">
	<button type="button" onclick="Q1()">Q1 실행</button>
	<div class="Q1"></div>
	
	<!-- 최신 jquery( js 라이브러리 ) 가져오기 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- 사용자 정의 JS 가져오기 -->
	<script src="JS/index.js"></script>
	
</body>
</html>