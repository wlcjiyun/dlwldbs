/*
	객체
	1. 미리 만들어진 객체 
		- console
			: console.log( )
		- Math 클래스
			: Math.random( )
		- document : DOM 객체
			: document.qeuryDelector( )
	
	2. 사용자 정의 객체
		
*/

// 1. DOM 객체 : HTML을 동적으로 만들어줌
	// document.body.innerHTML : body 마크업에 html 형식문자 대입
let h1 = `<h1>${ '안녕하세요' }</h1>`
document.body.innerHTML = h1 

// 2. DOM 객체의 이벤트
	// 1. 기존 함수 적용
	// document.addEventListener('이벤트명' , 함수) : 해당 문서에서 이벤트가 발생하면 함수 실행
function 함수1(){ console.log('문서열림') }
document.onload = 함수1
document.addEventListener( 'load' , 함수1 )
	// 2. 익명[이름없는] 함수 적용
document.onload = function(){ console.log( '문서열림2' ) }
document.addEventListener( 'load' , function(){ console.log( '문서열림2' ) } )








