<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>Ex1) HTTP 메소드</h3>
	<button type="button" onclick="doPOST()">POST 메소드</button>
	<button type="button" onclick="doGET()">GET 메소드</button>
	<button type="button" onclick="doPUT()">PUT 메소드</button>
	<button type="button" onclick="doDELETE()">DELETE 메소드</button>
	
	<h3>Ex2) 방문록</h3>
	내용 : <input type="text" class="content"> <br>
	작성자 : <input type="text" class="writer"> <br>
	<button type="button" onclick="onwrite()">방문록 등록</button>
	
	<table class="boardtable" border="1"></table>
	
	
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="index.js" type="text/javascript"></script>
	
</body>
</html>