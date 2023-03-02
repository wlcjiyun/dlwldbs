//alert('js 파일 열림');

function Ex1(){
	
	let data = document.querySelector( '.inputdata' ).value;
	console.log( data );
	
}
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

