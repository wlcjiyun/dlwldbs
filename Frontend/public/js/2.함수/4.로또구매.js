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
	추첨버튼출력() 
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

// 4. 선택번호목록 출력 및 추첨 버튼 활성화
function 추첨버튼출력( ){
	// 추첨버튼 활성화/비활성화
	if( 선택번호목록.length == 6 ){
		document.querySelector('.추첨버튼').style.display = 'inline'
	}else{
		document.querySelector('.추첨버튼').style.display = 'none'
	}
	document.querySelector('.선택번호상자').innerHTML = 선택번호목록	
}








// 1. 문자열 처리
	// '<button onclick="버튼클릭('+ i +')">1~45</button>'
	// html문자열~~~~~~~~~~~~~~~'+변수+'html문자열'+변수+'html문자열
// 2. 백틱 이용한 문자열처리
	// 1. 전체를 `으로 감싼다
	// 2. 변수/수식는 ${변수/수식} 감싼다 