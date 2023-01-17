console.log('js실행')

let 변수 = 10;
const 상수 = 10;
let 배열 = [ 10, 20, 30 ]
let 객체 = { 나이 : 10, 성별 : '남자' }
function 함수(){ console.log('함수호출') }

// 1. 객체 { } 선언
let 객체1 = { // 객체 선언 S
	이름 : '유재석', 	// 직접 데이터 작성 ㅇ
	나이 : 변수,		// 변수 대입
	점수 : 배열,		// 배열 대입
	정보 : 객체,		// 객체 대입
	행동 : 함수		// 함수 대입
} // 객체선언 E

// 2. 객체 호출
console.log( '객체 호출 : ' + 객체1 ); // [object Object]
console.log( 객체1 );

// 3. 객체 내 속성 호출
console.log( 객체1.이름 )
console.log( 객체1.나이 )
console.log( 객체1.점수 )
	console.log( 객체1.점수[2] )
console.log( 객체1.정보 )
	console.log( 객체1.정보.성별 )
console.log( 객체1.행동 )
객체1.행동()

