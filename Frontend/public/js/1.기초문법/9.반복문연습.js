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
for( let i = 1; 1<=10; i++ ){ sum += 1 }
console.log( sum )

// 예5) 누적합계 : i는 1부터 100이하까지 7배수 누적합계
console.log('---------예5--------')
// 첫 번째 방법 : [i+=7] 
sum = ''
for( let i = 0 ; 1<=100; i+=7 ){ sum += 1 }
console.log( sum )

// 두 번째 방법 : [i % 7 == 0]
for( let i = 1; 1<=100; i++ ){ // for S
	if( i % 7 == 0){ // if S
		sum += i
	} // if E
} // for E
console.log( sum )


