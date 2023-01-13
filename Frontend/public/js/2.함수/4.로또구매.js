// 1. 숫자 버튼을 출력하는 함수 만들기
function 버튼출력(){

	let 버튼목록 = ''; //누적기록
	
	for(let i = 1; i<=45; i++){
		
		버튼목록 += `<button onclick="버튼클릭(${i})">${i}</button>`		
		// 만약에 i가 5배수이면 줄바꿈처리
		if( i % 5 == 0 ){ 버튼목록 += '<br>' }
	
	}
	
	// 해당 div에 버튼목록을 넣어준다
	document.querySelector('.버튼목록상자').innerHTML = 버튼목록
	// 출력과 동시에 취소 버튼 활성화
	document.querySelector('.취소버튼').style.display = 'inline'
	
} 

// 2. 숫자 버튼을 없애는 함수 / 로또 구매 취소 함수
function 버튼출력취소(){
	// 해당 div에 공백으로 변경하다
	document.querySelector('.버튼목록상자').innerHTML = ''
	// 취소 버튼 안 보이게 활성화
	document.querySelector('.취소버튼').style.display = 'none'
	// 배열 내 모든 요소 제거
	선택번호목록.splice(0); //0번 인덱스부터 생략했을 떄 모두 제거
	추첨버튼출력() // 함수 호출
}

// 1. 선택한 숫자를 6개 저장하는 배열
let 선택번호목록 = [ ]

// 3. 버튼 클릭 함수
function 버튼클릭( 번호 ){ 
	console.log( 번호 + '번호를 선택하셨네요!' )
	
	// 1. 중복검사
	if( 선택번호목록.indexOf(번호) >= 0 ){
		alert('이미 선택한 번호입니다[해당 버튼 취소됩니다]')
		선택번호목록.splice( 선택번호목록.indexOf(번호), 1 )
		추첨버튼출력()
		return;
	}
	// 2. 6개까지만 저장
	if(선택번호목록.length == 6 ){
		alert('이미 모두(6개)를 선택했습니다')
		return;
	}
	// 2가지 유효성 검사를 충족하지 않았을 때 저장		
	선택번호목록.push( 번호 )
	추첨버튼출력();
}	

// 4. 선택번호목록 출력 및 추첨 버튼 활성화 [ 1. 구매취소, 2.버튼틀릭시숫자등록, 3.버튼클릭시숫자취소 ]
function 추첨버튼출력( ){
	// 추첨버튼 활성화/비활성화
	if( 선택번호목록.length == 6 ){
		document.querySelector('.추첨버튼').style.display = 'inline'
	}else{
		document.querySelector('.추첨버튼').style.display = 'none'
	}
	document.querySelector('.선택번호상자').innerHTML = 선택번호목록	
}
//2. 추첨번호목록 배열 선언
let 추첨번호목록 = []

// 5. 추첨하기 버튼을 클릭했을 때 함수
function 구매추첨(){ //fun S
	
	// 1. 컴퓨터가 난수 발생 [ 1~45사이의 수 6개]
	for( let i = 1; 1<=6; i++ ){
		
		// 1. 실수 난수 만들기
		let 실수난수 = Math.random()*45+1
		// 2. 실수 -> 정수 변환
		let 정수난수 = parseInt(실수난수)
	
		// * 중복검사
		if( 추첨번호목록.indexOf( 정수난수 ) >= 0 ){
			i--; // i는 6회 반복하는데 난수저장 실패시 1회 차감
		}else{
			// 3. 정순난수를 배열에 저장
			추첨번호목록.push( 정수난수 )
		}
	}
	document.querySelector('.추첨번호상자').innerHTML = 추첨번호목록
	// 추첨결과 출력 [ 맞은 개수, 등수 출력]
	
	// 1.
	let 맞은개수 = 0;
	for( let i = 0 ; i<=추첨번호목록.length ; i++ ){ //f1 S
		
		for( let j = 0; j<선택번호목록.length ; j++){ //f2 S
			console.log( 추첨번호목록[i] + ' : ' + 선택번호목록[j] )
			if( 추첨번호목록[i] == 선택번호목록[j] ){ 맞은개수++ } //if E
		} //f2 E
	} //f1 E
	
	// 2. 
	맞은개수 = 0;
	for( let i = 0; i<추첨번호목록.length ; i++ ){
		if( 선택번호목록.indexOf(추첨번호목록[i]) >= 0 ){ 맞은개수++ }
	}
	
	// 3. 
	for( let value of 추첨번호목록 ){
		if( 선택번호목록.includes( value ) == true ){ 맞은개수++ } 
	}
	alert( 맞은개수 )
	
} //fun E


/*
	난수 만들기
		1. Math 클래스 [ 미리 만들어둔 코드 ]
			- random() 함수 [ Math 클래스가 제공하는 미리 만들어둔 함수 ]
				예시)
				Math.random() 		: 0~1 사이의 실수 난수 발생
				Math.random()+1 	: 0~2 사이의 실수 난수 발생
				Math.random()*45 	: 0~45 사이의 실수 난수 발생
				Math.random()*45+1 	: 1~46 사이의 실수 난수 발생
			
			- Floor() : 소수점 버림 함수
				Math.floor( 3.14 ) : 3
		
		2. parseInt() : 정수 변환 함수
				parseInt( 3.14 ) : 3
				
	두 배열 비교
		1. 
			배열1 : 3 7 2 5 
			배열2 : 1 5 3 4 
				3 -> 1	7 -> 1	2 -> 1	5 -> 1
				3 -> 5	7 -> 1	2 -> 1	5 -> 1
				3 -> 3	7 -> 1	2 -> 1	5 -> 1
				3 -> 4	7 -> 1	2 -> 1	5 -> 1

*/




// 1. 문자열 처리
	// '<button onclick="버튼클릭('+ i +')">1~45</button>'
	// html문자열~~~~~~~~~~~~~~~'+변수+'html문자열'+변수+'html문자열
// 2. 백틱 이용한 문자열처리
	// 1. 전체를 `으로 감싼다
	// 2. 변수/수식는 ${변수/수식} 감싼다 