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
function 함수1(){ console.log('문서열림') }
	// 1. 기존 함수 적용
	// document.addEventListener('이벤트명' , 함수) : 해당 문서에서 이벤트가 발생하면 함수 실행
	// window.onload : HTML에서 모든 자료를 불러왔을 때 실행
	// window.addEventListener( '이벤트명' , 함수 ) : 
window.onload = 함수1
	// DOMContentLoaded : HTML이 열렸을 때 다른 자료와 상관없이 무조건 실행됨
document.addEventListener( 'DOMContentLoaded' , 함수1 )

	// 2. 익명[이름없는] 함수 적용
window.onload = function(){ console.log( '문서열림2' ) }
document.addEventListener( 'load' , function(){ console.log( '문서열림2' ) } )

	// 3. 화살표 : (인수) => {실행문} : 함수 적용
window.onload = () => { console.log( '문서열림3' ) }
document.addEventListener( 'load' , () => { console.log( '문서열림3' ) } )

let 익명함수 = function (){ console.log('문서열림5') }
let 화살표함수 = ( ) => { console.log('문서열림4') }
let 객체 = { 행동 : () => { console.log('문서열림6') } }