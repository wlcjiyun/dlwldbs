console.log('js실행')

// 1-3 : 함수 밖에 만드는 이유 : 전역변수 : 모든 함수에서 동일한 메모리 사용
let contents = []
	
	// 이벤트 함수 
		// 1. <button type="button" onclick="onwrite()">글 등록</button>
			// function onwrier(){}
		// 2. <button type="button" class="onwritebtn">글 등록</button>
			// document.querySelector('.onwritebtn').addEventListener( 'click' , (e) => {} )

// 1
function onwrite(){
	console.log('함수실행')
	
	// 1-1 : 입력받은 4개의 데이터를 하나의 객체 선언
	let info = {
		bwriter : document.querySelector('.bwriter').value,
		bpassword : document.querySelector('.bpassword').value,
		btitle : document.querySelector('.btitle').value,
		bcontent : document.querySelector('.bcontent').value
	}
	console.log(info) // 객체 정보 출력시 문자열 연결연산자 금지
	
	// 1-2 : 유효성 검사
		// - 입력 받은 데이터 길이 체크 가능
	if( info.bwriter.length <= 0 || info.bpassword.length <= 0 ||
		info.btitle.length <= 0 || info.bcontent.length <= 0 ){
		alert('입력해주세요')
		return; // 함수 종료 
	}
	
	// 1-3 : 배열에 저장 --> *추후 백엔드에게 통신해서 데이터 전달 
	contents.push( info )
	alert('글 등록 성공')
	console.log(contents)
	
	// 1-4 : input 초기화
	document.querySelector('.bwriter').value = ''
	document.querySelector('.bpassword').value = ''
	document.querySelector('.btitle').value = ''
	document.querySelector('.bcontent').value = ''
}




