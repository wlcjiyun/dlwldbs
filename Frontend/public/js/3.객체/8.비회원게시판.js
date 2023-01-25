console.log('js실행')

// 1-3 : 함수 밖에 만드는 이유 : 전역변수 : 모든 함수에서 동일한 메모리 사용
let contents = []
onprint();

	// 이벤트 함수 
		// 1. <button type="button" onclick="onwrite()">글 등록</button>
			// function onwrier(){}
		// 2. <button type="button" class="onwritebtn">글 등록</button>
			// document.querySelector('.onwritebtn').addEventListener( 'click' , (e) => {} )

// 1. 글쓰기
function onwrite(){ /* 등록버튼 눌렀을 때 */
	console.log('함수실행1')
	
	// 1-1 : 입력받은 4개의 데이터를 하나의 객체 선언
	let info = {
		bwriter : document.querySelector('.bwriter').value,
		bpassword : document.querySelector('.bpassword').value,
		btitle : document.querySelector('.btitle').value,
		bcontent : document.querySelector('.bcontent').value,
		bdate : new Date(), // 현재 날짜와 시간
		bview : 0
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
	onprint();
	console.log(contents)
	
	// 1-4 : input 초기화
	document.querySelector('.bwriter').value = ''
	document.querySelector('.bpassword').value = ''
	document.querySelector('.btitle').value = ''
	document.querySelector('.bcontent').value = ''
}


// 2. 글목록
function onprint(){ /* js실행, 등록, 삭제, 수정 */
	console.log('함수실행2')
	
	// 1. 기본 html 구성
	let html = `<tr> <th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회수</th> </tr>`
	
	// 2. 내용 html 구성
	for( let i = 0; i<contents.length; i++ ){
		
		let date = contents[i].bdate.getFullYear() + '년' +
					(contents[i].bdate.getMonth()+1) + '월' +
					contents[i].bdate.getDay() + '일' +
					contents[i].bdate.getHours() + ':' +
					contents[i].bdate.getMinutes() + ':' +
					contents[i].bdate.getSeconds() 
					
		 html += `<tr onclick="onview( ${i} )">
		 			<th>${ i+1 }</th>
		 			<th>${ contents[i].btitle }</th>
		 			<th>${ contents[i].bwriter }</th>
		 			<th>${ date }</th>
		 			<th>${ contents[i].bview }</th>
		 		 </tr>`
		 		 
		 		 /*
					날짜 함수 
						1. new Date() : 현재 날짜와 시간
						2. 연도/월/일 
							- .getFullYear : 연도
							- .getMonth : 월 [0:1월 ~~~ 11:12월]
							- .getDate : 일
							- .getDay : 요일 [0:일 ~~~ 6:토 ]
						3. 시/분/초
							- .getHours() : 시
							- .getMinutes() : 분
							- .getSeconds() : 초
				*/
	}
	
	// 3. 마크업에 html 대입
	document.querySelector('.boardtable').innerHTML = html
}


// 3. 글보기(조회수 증가)
function onview(i){ /* 글목록에서 해당 행 클릭 */
	console.log(i)
	contents[i].bview += 1;
	onprint();
	let html = `<div> 제목 : ${ contents[i].btitle } </div>
				<div> 내용 : ${ contents[i].bcontent } </div>
				<div> 작성자 : ${ contents[i].bwriter } </div>
				<div> <button onclick="onDelete( ${i} )">삭제</button> </div>
				`
	document.querySelector('.viewbox').innerHTML = html
				
}

// 3-1. 삭제
function onDelete(i){
	let 비밀번호 = prompt('비밀번호 : ')
	
	if( 비밀번호 == contents[i].bpassword ){
		contents.splice( i , 1 )
		alert('삭제되었습니다')
		onprint();
		document.querySelector('.viewbox').innerHTML = ''
	}else{
		alert('삭제 실패')
	}
}


















