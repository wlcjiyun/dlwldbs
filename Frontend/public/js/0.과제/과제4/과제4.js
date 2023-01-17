//console.log('실행') //확인용

let 도서목록 = [ '혼자공부하는자바', '이것이자바다', '열형 C언어' ]
let 대여목록 = [ '혼자공부하는자바' ] 

// 등록버튼 눌렀을 때 
function addContent(){
	
	// console.log('실행') //확인용
	
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

// 삭제버튼 눌렀을 때 
function onDelete( dno ){ 
	if( 도서목록.indexOf(도서목록[ dno ] == -1){
		도서목록.splice( dno , 1 )
	}else{ alert('대여중인 도서는 삭제할 수 없습니다.')}
	
	printContent()
}