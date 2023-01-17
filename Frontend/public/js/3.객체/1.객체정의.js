console.log('1.js실행')
/*
	-JAVA / JS : 객체 지향 언어 [ OOP : Object Oriented Programming ]
		1.메모리/저장소
			1. 변수 : let 변수명 = 데이터							: 데이터 1개 
			2. 상수 : const 상수명 = 데이터 						: 데이터 1개 
			3. 배열 : let 배열명 = [ 데이터1 , 데이터2 , 데이터3 ]		: 데이터 여러개
				- 문제점 : 서로 다른 데이터유형 들을 한번에 저장시 식별 힘듬
				* 유재석/강호동/신동엽의  아이디 , 비밀번호 , 이름  저장
					유재석 : qweqwe , 123 , 유재석
					강호동 : asdasd , 456 , 강호동
					신동엽 : zxczxc , 789 , 신동엽
					
				let 배열명 = [ qweqwe , 123 , 유재석 , 
							asdasd , 456 , 강호동  ,
				 			zxczxc , 789 , 신동엽  ]	
				 			
			4. 객체 : let 객체명 = { }
				
			
	- 객체[ Object ]
		1. 사용목적 : 서로 다른 데이터유형(속성) 들을 한번에 저장
		2. 형태 : 
			let 객체명 = { 속성명 : 데이터 , 속성명 : 데이터 , 속성명 : 데이터 }
		3. 선언 : 
			let 객체명 = {
				속성명 : 데이터 ,
				속성명 : 변수 ,
				속성명 : 상수 ,
				속성명 : 배열명 ,
				속성명 : 함수명
			}
			
		4. 객체호출 
			1. 객체 정보 : 객체명
			2. 객체.속성명 : 객체내 해당 속성의 데이터 호출 
				. :접근연산자 [ 속성 호출 ]
		
		5. 객체 속성 추가
			객체명.새로운속성명 = 데이터
		
		6. 객체 속성 제거 
			delete 객체명.속성명
			
		7. 객체내 속성 값 변경
			객체명.속성명 = 새로운 값 
			
		예) 회원 객체
			let 회원 = { 아이디 : 'qweqwe' , 비밀번호 : '123' , 이름 : '유재석' }
*/
// 1. 객체의 선언 : 서로 다른 데이터유형들 간의 식별가능
let 객체1 = { 아이디 : 'qweqwe' ,  비밀번호 : '123' , 이름 : '유재석'  }
console.log( 객체1 ) // 객체호출	
	// vs
let 배열1 = [ 'qweqwe' , '123' , '유재석' ]
console.log( 배열1 )

// 2. 객체의 호출
console.log( 객체1 )	// 객체의 모든 정보 호출 
console.log( '객체내 아이디 속성의 값 : ' + 객체1.아이디 ) // 객체내 '아이디' 속성의 값 호출 
console.log( '객체내 비밀번호 속성의 값 : ' + 객체1.비밀번호 )
console.log( '객체내 이름 속성의 값 : ' + 객체1.이름 )
	// vs
console.log( 배열1[0] )	

// 3. 객체의 속성 추가
객체1.주소 = '안산시 상록구'; 		console.log( 객체1 );
객체1.연락처 = '010-4444-4444'; 	console.log( 객체1 );

// 4. 객체의 속성 제거 
delete 객체1.주소;			 	console.log( 객체1 );

// 5. 속성의 값 변경
객체1.비밀번호 = '789';			console.log( 객체1 );

// 7. 배열과 객체 관계 [ 배열안에 객체저장 가능 / 객체 안에 배열 저장 가능 ]
	// 1. 배열안에 여러개 객체 저장 [!! 동일한 객체의 유형 ]
let 게시물1 = { 제목 : '제목1입니다.' , 내용 : '내용입니다1.' }
let 게시물2 = { 제목 : '제목2입니다.' , 내용 : '내용입니다2.' }
let 게시물배열 = [ 게시물1 , 게시물2   ]
	// 2. 객체안에 배열 속성 저장 

let 공지사항 = {
	게시판이름 :'공지사항' , 
	게시물목록 : 게시물배열
}

