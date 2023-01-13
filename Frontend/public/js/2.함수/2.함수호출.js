
// - 함수호출 및 정의
	// 1. 호출할 함수의 이름이 존재
	
	/*
		1. 인수x반환x  함수
			-정의								-호출
			function 함수명(){				함수명() 
				
			}
		
		2. 인수o반환x	함수
			-정의
			function 함수명( x ){				-호출
											함수명( x )
			}
		
		3. 인수x반환o	함수
			-정의
			function 함수명( ){				-호출
				return 3					let result = 함수명( )
			}
		
		4. 인수o반환o 함수
			-정의
			function 함수명( x ){				-호출
				return 3 					let result = 함수명( 3 )
			}
		
	
	*/
	
	/*
			복권 : 1000
		유재석				강호동[로또구매]{
			-----1000:인수------->
								로직[추첨]
								
			<-----꽝:반환값-------- 꽝						
							}
			
		유재석이				
		let 추첨결과 = 로또구매( 1000 )
		
		강호동이
		function 로또구매( 돈 ){
			추첨시스템
			return 추첨결과
		}
		
		예) prompt( ) 함수 예시 
			
			1.
				prompt(인수)	: 인수 : 메시지창에 출력할 텍스트
			2.
				let 반환 = prompt(인수) : 반환값 : 메시지창에 입력된 텍스트 
				
	*/
	

//1. 인수가 없는 함수 선언
function 함수1(){ // 함수 s 
	console.log('함수1 실행')
}// 함수 end 
//1. js에서 함수 호출 [ 함수호출 : 함수명() ]
함수1()

// 2.인수가 1개인 함수 선언 
function 함수2( x ){
	console.log('함수2 실행 인수:'+x)
}
// 2. js에서 함수 호출
함수2( 7 )

// 3. 인수가 2개인 함수 선언
function 함수3( x , y ){
	console.log('함수3 실행 인수 : '+ ( x + y) )
}
// 3. js에서 함수 호출
함수3( 5 , 7 )

// 4. 반환이 있는 함수 선언 
function 함수4( x , y , z ){
	let result = x + y + z
	return result;
}
// 4. js에서 함수 호출
함수4( 1 , 2 , 3 ) // ??? 반환후에 코드 없다.
let result = 함수4(1,2,3)
console.log( '함수4 반환 : ' + 함수4( 1,2,3 ) )