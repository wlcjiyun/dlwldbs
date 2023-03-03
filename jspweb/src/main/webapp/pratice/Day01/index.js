//alert('js 파일 열림');

function Ex1(){
	
	let data = document.querySelector( '.inputdata' ).value;
	console.log( data );
	
	$.ajax({
		url : "/jspweb/Ex1",		// 통신할 서블릿 주소
		method : "post", 								// HTTP 메소드
		data : { "data" : data }, 						// 데이터 보내기
		success : function(result){						// 데이터 받기
			console.log(result);
			Ex2();
		} 												
	});	
}

Ex2(); // 페이지 열리면 1번 호출
function Ex2(){
	$.ajax({
		url : "/jspweb/Ex1",	
		method : "get", 								
		//data : {}, 						
		success : function(result){						
			console.log(result);
			document.querySelector('.ex2box').innerHTML = result;
		} 					
	});
}

// 과제
Q1()
function Q1(){
	
	let Q1data = document.querySelector( '.inputQ1data' ).value;
	console.log( Q1data );
	
	$.ajax({
		url : "/jspweb/Q1",		
		method : "post", 								
		data : { "Q1data" : Q1data }, 			
		success : function(result){
			console.log(result);
			document.querySelector('.Q1').innerHTML = result;
		} 												
	});
		$.ajax({
		url : "/jspweb/Q1",		
		method : "get", 								
		//data : { "Q1data" : Q1data }, 			
		success : function(result){
			console.log(result);
			document.querySelector('.Q1').innerHTML = result;
		} 												
	});		
}
// JS -> 서블릿
	
	// 0. $ : jquery 표현식
	// 1. Ajax 메소드 사용 : $.ajax( );
	// 2. Ajax 매개변수[ 속성:객체형태 ] : { } => $.ajax( { } )
	// 3. 속성
		// 3-1. url : 통신할 경로[ 서블릿(클래스) 주소 ]
			// url : "http://localhost:8080/jspweb/indextest"
			// url : "http://192.168.17.16:8080/jspweb/indextest"
			// url : "/jspweb/indextest"
		// 3-2. method : http 메소드 방식
			// get 
			// post  
		// 3-3. data : 통신할 때 데이터 보내기 
			// js객체 형태 : { 매개변수명 : 데이터 , 매개변수 : 데이터 }
		// 3-4. success : 통신 후 응답 데이터 받기
			// success : function( 매개변수 ) {}
			// success : ( 매개변수 ) => {}
	/*
		$.ajax({
			url:"", 
			method:"", 
			data :{이름:값}, 
			success :function(result){
				
			}
		});
	*/
/*
	* document : 미리 만들어진 DOM 객체
	
	1. querySelector(식별자) : tag 1개 : 변수/객체에 저장
		- document.querySelector( '.classname' )
		- document.querySelector( '#idname' )
		- document.querySelector( 'tagname[name="name']' )
		
	2. querySelectorALL(식별자) : tag 여러 개 : 배열/리스트에 저장
	
	3. querySelector().속성명
		- querySelector().value 	: input, selext, textarea [ div, table X ]
		- querySelector().innerHTML : div, span, td 등
*/

