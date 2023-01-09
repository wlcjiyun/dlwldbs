/**
 	- 데이터 1개 저장할 수 있는 메모리 공간
 	- 준비물 : 
 		1. 자료형 키워드
 		2. 변수/상수 명
 		3. 저장할 데이터
 		4. 대입연산자 [ 오른쪽 데이터를 왼쪽에 넣기 ]
 		
	- 변수 : 변하는 수
		1. let
			let 변수명 = 데이터
			: 대입 후에 변경 가능 
	- 상수 : 고정된 수
		1. const
			const 변수명 = 데이터
			: 대입 후에 변경 불가능
			
	- 선언방법
		1. let or const
		2. 변수명 정의( 중복X )
		3. = 대입연산자
		4. 데이터
		
	- 변수 호출
		1. 변수명을 이용한 호출
	
	- 변수 값 변경
		1. 변수명 = 새로운 데이터
 */

// 변수 선언
let value1 = 10 // : 'value1'이라는 변수 상자에 10을 대입했다.
// 변수 값 호출
console.log('변수값 : ' + value1) // : 'value1'이라는 변수 상자에 값을 호출
// 변수 값 변경
// let value1 = 200 : 'value1'이라는 변수명이 존재하기에 오류 발생
value1 = 20 // 'value1'이라는 변수 상자에 새로운 값 대입
console.log('변수값 수정 후 : ' + value1)
// 변수 연산
console.log('변수값 더하기 5 : ' + value1+5) // 문자열 + 숫자 + 숫자 
console.log('변수값 더하기 5 : ' + (value1+5)) // 문자열 + ( 숫자 + 숫자 )
let value2 = 30
let result = value1 + value2
console.log('변수들 간에 연산 : ' + result)

// 상수 선언
const date1 = 10 
//date1 = 20 // !변경 불가
console.log( '상수값 : ' + date1 )
const date2 = 20
const result2 = date1 + date2
console.log( '상수들 간에 연산 : ' + result2 )
// + : 1. 산술 / 2. 연결