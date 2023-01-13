// 1. 인수X 반환X
function 함수1(){ // F S
	// function : 함수 선언시 사용되는 키워드
		// 함수1 : 함수이름[식별자] 동일한 파일내에서는 중복이름X
			// ( ) : 인수 정의하는 곳
				// { } : 함수가 호출되면 실행되는 구역
	alert('함수1 실행됨')
} // F E

// 1. 함수 호출
함수1()

// 2. 인수O 반환O
function 함수2( x , y ){ // F S
	// ( x , y ) : 해당 함수 호출시 인수 2개를 받는 함수
	alert('함수2 실행됨')
	return x + y;
} // F E
let result = 함수2( 3 , 5 )
alert('함수2 실행 후 보내준 값 : ' + result) 

// 3. 인수O 반환X 
function 함수3( x , y , z){
	let result = x + y + z
	alert('함수3 실행됨 : ' + result)
}
함수3( 3 , 5 , 7 )

// 4. 인수X 반화O
function 함수4(){
	let result = 3 + 5 + 8
	return result; 
}
let result2 = 함수4()
alert('함수4 실행후 보내준 값 : ' + result2 )