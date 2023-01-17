//console.log('실행')

let 도서목록 = [ '혼자공부하는자바', '이것이자바다', '열형 C언어' ]
let 대여목록 = [ '혼자공부하는자바' ] 


/*-----------------------------------이지윤----------------------------------*/

// 등록버튼 눌렀을 때 
function addContent(){
	
	// console.log('실행')
	
	let 도서명 = document.querySelector('.도서명').value
	if( 도서명.length >= 5 && 도서명.length <= 10 ){
		if( 도서목록.indexOf( 도서명 == -1 ) ){
			도서목록.push(도서명)
			alert('등록되었습니다.')
		}else{ alert('이미 등록된 도서명입니다.') }
	}else{ alert('도서명은 5~10글자 사이만 등록이 가능합니다.')}
	
	printContent()	
}
// HTML 출력 
function printContent(){
	
	let html = `<tr>			
					<th>번호</th>
					<th>도서명</th>
					<th>도서대여여부</th>
					<th>비고</th>
				</tr>` 

	for( let i = 0 ; i<도서목록.length; i++ ){
		html += `<tr>
					<td>${ i+1 }</td>
					<td>${ 도서목록[i] }</td>
					<td>${ 도서대여여부 }</td>
					<td><button onclick="onDelete( ${i} )">삭제</button></td>
				</tr>`												
	} 		
	document.querySelector('.contentTable').innerHTML = html
	
	printContent( )
}

// 삭제버튼 눌렀을 때 : 이지윤
function onDelete( dno ){ 
	if( 도서목록.indexOf(도서목록[ dno ]) == -1){
		도서목록.splice( dno , 1 )
	}else{ alert('대여중인 도서는 삭제할 수 없습니다.')}
	
	printContent()
}


/*-----------------------------------김미영----------------------------------*/
// 고객페이지 함수 및 출력
고객페이지출력()
function 고객페이지출력(){ // f s
	let html = '<tr><th>번호</th><th>도서</th><th>도서대여여부</th><th>비고</th></tr>'
	for(let i = 0 ; i < 도서목록.length ; i++ ){// for s 
		html += `<tr>
					<td>${i+1}</td>
					<td>${도서목록[i]}</td>
					<td>${도서대여여부( i )}</td>
					<td>
						<button onclick="bookGet(${i})">대여버튼</button>
						<button onclick="bookReturn(${i})">반납버튼</button>
					</td>
				</tr>`
				
		}// for e
	document.querySelector('.customerTable').innerHTML = html
	
} // f e

function 도서대여여부( i ){ // f s
	if(대여목록.indexOf(도서목록[i]) == -1 ){ return '대여가능' }
	else{ return '대여중' }
} // f e

// 도서 대여 함수
function bookGet( gbtn ){// f s
	if(대여목록.indexOf(도서목록[gbtn]) == -1 ){ // if s //대여목록에 도서목록에 있는 도서가 존재하지않는다면
		alert('대출되었습니다.')
		대여목록.push(도서목록[gbtn]) // 대여된 도서 대여목록에 추가
		console.log(대여목록)
	}else{
		alert('이미 대여중인 도서입니다.') 
		}// if e
		고객페이지출력()
		관리자페이지출력()
}// f e

// 도서 반납 함수
function bookReturn( rbtn ){// f s
	if(대여목록.indexOf(도서목록[rbtn]) !== -1 ){// if s //대여목록에 도서목록에 있는 도서가 존재하다면
		alert('반납되었습니다.')
		대여목록.splice( 대여목록.indexOf(도서목록[rbtn]) , 1 )// 반납된 도서 대여목록에서 제거
		console.log(대여목록)
	}else{
		alert('대출된 도서가 아닙니다.') 
		} // if e
		고객페이지출력()
		관리자페이지출력()
}// f e

