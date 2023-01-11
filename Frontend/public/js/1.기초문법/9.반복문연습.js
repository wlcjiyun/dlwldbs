// 예1) i는 1부터 10이하까지 1씩 증가 반복
console.log('---------예1--------')
for( let i = 1 ; 1<10 ; i++ ){
	console.log(i)
}

// 예2) i는 1부터 10이하까지 1씩 증가 반복
console.log('---------예2--------')
let output = '' // 문자 변수 선언 [깡통]
for( let i = 1 ; 1<=10; i++ ){
	output += i + "\t"; // vs output = output + i // 누적 기록
}
console.log( output )

// 예3) i는 1부터 10이하까지 1씩 증가 반복 [ HTML 출력 ]
console.log('---------예3--------')
output = '' // 위에서 사용했기에 ''으로 변경
for( let i = 1; 1<=10; i++ ){
	output += i + "\t"
}
document.querySelector('body').innerHTML = output

// 예4) 누적합계 : i는 1부터 10이하까지 1씩 증가 반복
console.log('---------예4--------')
let sum = 0 ;
for( let i = 1; 1<=10; i++ ){ 
	console.log( "i = " + i + "\t"+i+"<=10 " + (i<=10 ) +"\t"+ sum+"+="+i +"\t i++" ) 
	sum += 1 
}
console.log( sum )

// 예5) 누적합계 : i는 1부터 100이하까지 7배수 누적합계
console.log('---------예5--------')
// 첫 번째 방법 : [i+=7] 
sum = ''
for( let i = 0 ; 1<=100; i+=7 ){ 
	console.log( "i = " + i + "\t"+i+"<=100 " + (i<=100 ) +"\t"+ sum+"+="+i +"\t i++" ) 
	sum += 1 
}	
console.log( sum )

// 두 번째 방법 : [i % 7 == 0]
for( let i = 1; 1<=100; i++ ){ // for S
	if( i % 7 == 0){ // if S
		sum += i
	} // if E
} // for E
console.log( sum )

// 예6) 구구단(2단) [ 단 :2 / 곱 : 변수 ]
console.log('---------예6--------')
output = '' // 깡통
for( let 곱 = 1 ; 곱<=9; 곱++ ){ //for S
	// 곱은 1부터 9까지 1씩 증가하면서 반복한다
	console.log( ' 2 * ' + 곱 + ' = ' + ( 2*곱 ) );
				// '문자' + 변수 + '문자' + (계산식)
	output += ' 2 * ' + 곱 + ' = ' + ( 2*곱 ) + '<br>'
} //for E
document.querySelector('body').innerHTML = output

// 예7) 구구단 [ 단 : 2~9 / 곱 : 1~9(변수) ]
/* 
// 7-1. 단 만들기
for( let 단 = 2 ; 곱<=9 ; 단++ ){
	console.log( 단 )
}
// 7-2. 곱 만들기
for( let 곱 = 1 ; 곱<=9 ; 곱++ ){
	console.log( 곱 )
}
// 7-3. 단, 곱 합치기 ---> '단'이 한 바퀴 돌 때, '곱'은 아홉 바퀴
for( let 단 = 2 ; 곱<=9 ; 단++ ){
	console.log( 단 )
	for( let 곱 = 1 ; 곱<=9 ; 곱++ ){
	console.log( 곱 )
	}
}
*/
// 7-4. 출력
for( let 단 = 2 ; 곱<=9 ; 단++ ){ //for1 S
	/*console.log( 단 )*/
	for( let 곱 = 1 ; 곱<=9 ; 곱++ ){ //for2 S
	console.log( 단 + ' * ' + 곱 + ' = ' + ( 단*곱 ) )
	} //for2 E
} //for1 E














































 





