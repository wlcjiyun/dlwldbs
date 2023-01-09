/*
	
	입력
	1. confirm('메세지') : 확인/취소를 입력받는 메세지
	2. prompt(메세지') : 데이터를 입력받는 메세지
	
	입력받은 데이터 저장[변수]
		- let 변수명 = confirm('메세지')
		- let 변수명 = prompt('메세지')
		
	1. 숫자 입력받을 때
		: Number(prompt('메세지'))
		
	2. 논리형 입력받을 때
		: Boolean(prompt('메세지'))
		
	3. 문자형 입력받을 때
		: prompt('메세지')
 */
// 1. 입력 메세지에 대한 확인/취소 결과를 변수에 저장
 let result1 = confirm('실행하시겠습니까?')
 console.log('결과1 : ' + result1)
 
 // 2. 입력 메세지에 입력된 데이터를 변수에 저장
  let result2 = prompt('데이터 입력')
 console.log('결과2 : ' + result2)
 
