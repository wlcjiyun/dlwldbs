//console.log('실행') //연동 확인용

let 도서목록 = [ '혼자공부하는자바', '이것이자바다', '열형 C언어' ]

//등록 버튼 클릭 했을때 이벤트 함수
function addContent(){
	
	console.log('등록버튼실행') //확인용
	
	// <input>에서 입력받은 데이터 가져와서 변수에 저장
	let 도서명 = document.querySelector('.도서명').value
	// 배열내 입력받은 변수 저장 
	도서목록.push( 도서명 )
	printContent()
}

function printContent(){
	// 출력할 html 구성
	let html = `<tr>			
					<th>번호</th>
					<th>도서명</th>
					<th>도서대여여부</th>
					<th>비고</th>
				</tr>` 
	// 내용추가 
	for( let i = 0 ; i<도서목록.length; i++ ){
		html += `<tr>
					<td>${ i }</td>
					<td>${ 도서목록[i] }</td>
					<td>${ [i] }</td>
					<td><button onclick="onDelete( ${i} )">삭제</button></td>
				</tr>`												
	} 
	
	//위에서 구성된 html를 해당 마크업에 대입			
	document.querySelector('.contentTable').innerHTML = html
}


// 삭제 버튼 눌렀을 때 함수
function onDelete( dno ){ 
	도서목록.splice( dno , 1 )
	printContent()
}