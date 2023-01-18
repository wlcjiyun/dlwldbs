//console.log('실행')

let 도서목록 = [ '혼자공부하는자바', '이것이자바다', '열형 C언어' ]
let 대여목록 = [ '혼자공부하는자바' ] 

도서현황( 1 );도서현황( 2 );

/*-----------------------------------이지윤----------------------------------*/
function addContent(){
	
	// console.log('실행')
	
	let 도서명 = document.querySelector('.도서명').value
/*	
	if( 도서명.length >= 5 && 도서명.length <= 10 ){
		if( 도서목록.indexOf( 도서명 == -1 ) ){
			도서목록.push(도서명)
			alert('등록되었습니다.')
		}else{ alert('이미 등록된 도서명입니다.') }
	}else{ alert('도서명은 5~10글자 사이만 등록이 가능합니다.')}
	printContent()
*/
	if( 도서목록.includes(도서명)){ /* 중복 검사 */
		alert('이미 등록된 도서명입니다.')
		return false; 
	}
	if( 도서명.length <5 || 도서명.length>10  ){ /* 도서명 길이 체크 */
		alert('도서명은 5~10글자 사이만 등록이 가능합니다.')
		return false;
	}
	도서목록.push(도서명); /* 입력받은 도서명 배열에 추가 */
	도서현황( 1 );도서현황( 2 );
	console.log(도서목록)
}

/*
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
	printContent()		
}
*/	
function 도서현황( 타입 ){
	// 1. html 기본 구성 
	let html = `<tr>
					<th>번호</th> <th>도서명</th>
					<th>도서대여여부</th> <th>비고</th>
				<tr>`
	// 2. html 구성 추가 
	for( let i = 0 ; i< 도서목록.length ; i++ ){
		// i는 0부터 도서목록길이 미만까지 1씩증가 
		html += `<tr>
					<td>${i+1}</td> 
					<td>${ 도서목록[i] }</td>
					<td>${ 대여목록.includes( 도서목록[i] ) ? '대여중' : '대여가능' } </td>
				`
		if( 타입 == 1 ){ // 만약에 함수의 인수가 타입 1 이면 관리자 쪽 테이블  
			html +=  `<td><button onclick="삭제( ${i} )">삭제</button></td>`
			// 3. 마크업에 html 대입
			document.querySelector('.contentTable').innerHTML = html;
		}else if( 타입 == 2 ){ // 만약에 함수의 인수가 타입 2 이면 고객 쪽 테이블 
			html += `<td>
						<button onclick="대여( ${i} )">대여</button>
						<button onclick="반납( ${i} )">반납</button>
					<td>`
			document.querySelector('.customerTable').innerHTML = html;
		}
	}
}

/*
function onDelete( dno ){ 
	if( 도서목록.indexOf(도서목록[ dno ]) == -1){
		도서목록.splice( dno , 1 )
	}else{ alert('대여중인 도서는 삭제할 수 없습니다.')}
	
	printContent()
}*/
function 삭제( i ){
	if( 대여목록.includes( 도서목록[i] ) ){
		alert('대여중임으로 삭제가 불가능합니다.')
		return false;
	}
	도서목록.splice( i , 1 )
	도서현황( 1 );도서현황( 2 ); //렌더링
}

/*-----------------------------------김미영----------------------------------*/
// 고객페이지 함수 및 출력
/*
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
*/

/*
function 도서대여여부( i ){ // f s
	if(대여목록.indexOf(도서목록[i]) == -1 ){ return '대여가능' }
	else{ return '대여중' }
} // f e
*/

/*
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
*/
function 대여(i){
	if(대여목록.includes(도서목록[i])){
		alert('이미 대여중인 도서입니다.') 
		return;
	}
	대여목록.push(도서목록[i])
	도서현황( 1 );도서현황( 2 ); // 렌더링
}
/*
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
*/
function 반납(i){
	if(대여목록.includes(도서목록[i])){
		대여목록.splice( i , 1 ) 
		도서현황( 1 );도서현황( 2 ); // 렌더링
		return true;
	}
	alert('대여중인 도서가 아닙니다.')
	return false;
}