borad_print( null , null );
function borad_print(){
	// 1. 처음 JS실행 [ keyword=null , key=null ]
	// 2. 검색되었을 때 []
	// 3. 페이지 전환되었을 때

	/*if( keyword == null && key == null ){
		alert('검색이 없는 게시물 출력')
		// 자바에게 검색이 없는 게시물들을 요청
	}else{
		alert('검색이 있는 게시물 출력')	
		// 자바에서 키워드,키 보내서 검색이 있는 게시물들을 요청
	}*/
		
	// [요청된 결과] 2. DB -> JAVA 으로 전달된 게시물리스트 데이터
	let boardlist = [
	   { no : 5 , title : '안녕하세요A' , writer : '유재석' , date : '2023-01-30' , view:325 , up : 9 , down : 1  } , 
	   { no : 4 , title : '안녕하세요B' , writer : '강호동' , date : '2023-01-27' , view:123 , up : 2 , down : 0  } , 
	   { no : 3 , title : '안녕하세요C' , writer : '신동엽' , date : '2023-01-25' , view:753 , up : 3 , down : 0  } , 
	   { no : 2 , title : '안녕하세요D' , writer : '서장훈' , date : '2023-01-24' , view:521 , up : 10 , down : 3  } , 
	   { no : 1 , title : '안녕하세요E' , writer : '김희철' , date : '2023-01-23' , view:951 , up : 21 , down : 4 } 
	]
	
	// 3. 출력
	let html = ''
				
	boardlist.forEach( (borad) => {
		html += `<tr>
					<td>${borad.no}</td>
					<td>${borad.title}</td>
					<td>${borad.writer}</td>
					<td>${borad.date}</td>
					<td>${borad.view}</td>
					<td>${borad.up}</td>
					<td>${borad.down}</td>
				</tr>`
	})
	document.querySelector('.boradList').innerHTML = html;
}

// 2. 검색버튼을 눌렀을 때 키워드와 검색어 가져오기
document.querySelector('.searchbtn').addEventListener('click' , (e) => {
	// 1. 키워드 
	let keyword = document.querySelector('.keyword').value
	alert('검색클릭')
	// 2. 검색어
	let key = document.querySelector('.key').value
	console.log(keyword)
	console.log(key)
	// 3. 유효성 검사 생략
	// 4. 키워드, 검색어를 전당
	borad_print( keyword , key );
}) 







