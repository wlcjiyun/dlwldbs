/*	
	JS 연산자
		1. 산술 연산자 : +더하기 -빼기 *곱하기 /나누기 %나머지
		
		2. 연결 연산자 : +
					  숫자 + 숫자 : 산술
					  문자 + 숫자 : 연결
					  문자 + 문자 : 연결
				
		3. 비교 연산자 : 결과는 true / false
					   >초과[크다]		<미만[작다] 
					   >=이상[크거나 같다]		<=이하[작거나 같다]
					   ==같다[데이터만 비교]	===같다[데이터&자료형 비교]
					   !=같지않다[아니다/제외]	!==같지않다[데이터/자료형 비교] 
					   
		4. 관계 연산자 : 비교 연산자가 2개 이상일 때 참/거짓 판당
					   && : and 이면서 면서 이고 모두 그리고 [ 비교연산자 결과가 모두 참이면 참 ]
					   		10<a<20 [ X ] ---> a>10 && a<20
					   || : or 이거나 거나 또는 하나라도[ 비교연산자 경과가 하나라도 참이면 참 ]
						! : 부정 반대 [ 비교연산자 결과가 참이면 거짓 ]
					
		5. 대입 연산자 : 
					  = 대입 : 오른쪽에서 왼쪽으로 대입
					  += 대입 : 오른쪽 데이터를 왼쪽에 더한 후 대입
					  -=, *= /= %=
		
		6. 증감연산자 : 
					변수++	[ 후위 1증가 ]		변수--	[ 후위 1감소 ]
					++변수	[ 선위 1증가 ]		--변수	[ 선위 1감소 ]
					
		7. 삼항연산자 : 만약에 조건이 참[true]이면 참 반환 / 거짓[false]이면 거짓 반환
					1. 조건 ? 참 : 거짓 
						ex) 나이>=19 ? '성인' : '청소년'
					2. 중첩
							조건1 ? 참1 : 
							조건2 ? 참2 : 
							조건3 ? 참3 : 거짓
							
						ex) 나이<=19 ? '청소년' : 
							나이<=40 ? '청년' : 
							나이<=60 : '중년' : '노년'
 */
	
// 1. 산술 연산자
console.log(10+3) // 숫자 + 숫자 => 숫자
console.log('더하기 : ' + 10+3) // 문자 + 숫자 =>문자
console.log('더하기 : ' + (10+3)) // 문자 +(숫자) => 문자
console.log('빼기 : ' + (10-3))
console.log('곱하기 : ' + (10*3))
console.log('나누기 : ' + (10/3))
console.log('나머지 : ' + (10%3)) // !몫을 제외한 나머지

// 2. 비교 연산자
console.log('초과 : ' + (10>3))
console.log('미만 : ' + (10<3))
console.log('이상 : ' + (10>=3))
console.log('이하 : ' + (10<=3))
console.log('같다 : ' + (10==3))
console.log('같지않다 : ' + (10!=3))

// 3. 관계 연산자
console.log('&& : ' + (10>3 && 10>5)) // T and T => T
console.log('|| : ' + (10>3 || 3>5)) // T or F => T
console.log('!= : ' + !(10>3)) // T->F / F->T

/*
//문제1
let 국어 = Number(prompt('국어'))
let 영어 = Number(prompt('영어'))
let 수학 = Number(prompt('수학'))
console.log('총점 : ' + (국어+영어+수학))
console.log('평균 : ' + (국어+영어+수학)/3)
*/
/*
//문제2
let 반지름 = Number(prompt('반지름'))
console.log('원넓이 : ' + (반지름*반지름*3.14))
*/
/*
//문제3
let 실수1 = Number(prompt('실수1'))
let 실수2 = Number(prompt('실수2'))
console.log('실수2의 실수1 백분율 : ' + (실수1/실수2)*100 + '%')
*/
/*
//문제4
let 정수1 = Number(prompt('정수1'))
console.log('홀짝 판단 : ' + (정수1%2==1))
	// 홀수 찾기 : 수%2==1 --> 나머지 0[짝수] 1[홀수]
	// 짝수 찾기 : 수%2==0 --> 나머지 0[짝수] 1[홀수]
*/
/*
//문제5
let 정수2 = prompt('정수2')
console.log('7의 배수 : ' + (정수2%7==0))
	// 배수 찾기 : 수/값==0 나머지가 0이면 수는 해당 값의 배수
*/
/*	
//문제6 [ 몫 : parseInt(3.75) --> 3 ]
let 금액 = Number(prompt('금액'))
console.log('입력받은 금액: ' + 금액)
console.log('십만원권: ' + parseInt(금액/100000) + '장')
// ! 금액에서 십만원권 제외*
금액 = 금액 - parseInt(금액/100000)*100000 
console.log('만원권: ' + parseInt(금액/10000) + '장')
금액 = 금액 - parseInt(금액/10000)*10000 
console.log('천원권: ' + parseInt(금액/1000) + '장')
*/
/*
//문제7
let 아이디 = prompt('아이디')
let 비밀번호 = prompt('비밀번호')
console.log('로그인상태 : ' + (아이디=='admin' && 비밀번호=='1234'))
*/
/*
//문제8
let 정수3 = Number(prompt('정수3'))
console.log('홀수이면서 짝수 : ' + (정수3%2==1 && 정수3%7==0))
*/

// 4. 대입 연산자
let data1 = 10 // 1. = 대입
data1 += 2 	// vs data1 = data1 + 2
			// 1. 10 + 2 --> 12
			// 2. data1 = 12
console.log('+= 대입 후 : ' + data1)
data1 -= 5
console.log('-= 대입 후 : ' + data1)
data1 *= 2
console.log('*= 대입 후 : ' + data1)
data1 /= 3
console.log('/= 대입 후 : ' + data1)
data1 %= 3
console.log('%= 대입 후 : ' + data1)

// 5. 증감 연산자 [ data++ dats+=1 data = data+1]
let data2 = 10
console.log('변수 값  : ' + data2) // 10
console.log('변수++ : ' + (data2++)) // 10 : 출력 후 증가
console.log('변수 값 : ' + data2) // 11
console.log('++변수 : ' + (++data2)) // 12 : 출력 전 증가

console.log('변수-- 값 : ' + (data2--)) // 12 : 출력 후 감소
console.log('변수 값 : ' + data2) // 11
console.log('--변수 값 : ' + (--data2)) // 10 : 출력 전 감소

// 6. 삼항연산자 [ 조건 ? 참 : 거짓 ] 
let age = 38;
let 나이대 = age<=19 ? '청소년' : '성인'	// 조건[ 38<=19 ]이 false 니까 '성인' 대입 
console.log( ' 38의 나이대 : ' + 나이대 )

let 점수 = 78;
let 등급 = 	점수>=90 ? 'A등급' : 			// 점수가 90점이상이면 a등급
			점수>=80 ? 'B등급' : 			// 아니면 점수가 80점이상이면 b등급
			점수>=70 ? 'C등급' : '탈락'		// 아니면 점수가 70점이상이면 c등급 그외 탈락
console.log( '78점수의 등급 : ' + 등급 )

/*
	문제9 : 정수를 입력받아서 홀수인지 짝수인지 출력
	문제10 : 정수 2개를 입력받아서 더 큰 수를 출력 
	문제11 : 정수 3개를 입력받아서 가장 큰 수를 출력
	문제12 : 정수 3개를 입력받아서 오름차순으로 출력
*/
/*
//문제9
let value1 = Number(prompt('정수'))
console.log( value1 + '의 홀짝 판단 : ' + (정수1%2==0 ? '짝수' : '홀수'))
*/
/*
//문제10
let value2 = Number(prompt('정수2'))
let value3 = Number(prompt('정수3'))
console.log( value2 + '과' + value3 + ' 중 더 큰 수는 : ' +
			value2>value3 ? value2 : value2<value3 ? value3 : '같다'
			)
//첫 번쨰 값이 더 크면 첫 번째 값 출력, 두 번째 값이 더 크면 두 번쨰 값 출력 아니면 두 수는 같다
*/
/*
//문제11
let value4 = Number(prompt('정수4'))
let value5 = Number(prompt('정수5'))
let value6 = Number(prompt('정수6'))
let max = value4 // 가장 큰 수 변수에 첫 번째 값 대입
max = max < value5 ? value5 : max //만약에 max보다 더 크면 max에 대입
max = max < value6 ? value6 : max
console.log('가장 큰 수는 : ' + max)
*/
ㄴ
//문제12


