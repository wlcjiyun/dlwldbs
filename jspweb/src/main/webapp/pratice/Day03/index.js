function doPOST(){
	alert('http POST 메소드를 실행합니다')
	$a.ajax({
		url : "/jspweb/Ex3" , 
		method : "post" , 
		success : ( result ) => { }
	})
}

function doGET(){
	alert('http GET 메소드를 실행합니다')
	$a.ajax({
		url : "/jspweb/Ex3" , 
		method : "get" , 
		success : function( result ) { }
	})
}

function odDELETE(){
	alert('http DELETE 메소드를 실행합니다')
	$a.ajax({
		url : "/jspweb/Ex3" , 
		method : "delete" , 
		success : ( result ) => { }
	})
}

// ---------------------------------------------
// 1. 등록
function onwrite(){
	
	console.log('onwrite 함수 S')
	let info = {
		
		content : document.querySelector('.content').value,
		writer : document.querySelector('.writer').value
	}
	console.log(info);
	
	$.ajax({
		url : "/jspweb/Ex3/Board" , 
		method : "post" ,
		data :  info ,
		success : (r) => {
			console.log('POST 응답성공');
			if(r == 'true'){
				alert('등록성공');
				onlist();
				document.querySelector('.content').value = '';
				document.querySelector('.writer').value = '';
			}else{
				alert('등록실패');
			}
		}
	})
}

// 2. 모든 게시물출력 [ 1.js열릴때 2.글작성할때마다 ]
onlist();
function onlist(){
	
	$.ajax({
		url : "/jspweb/Ex3/Board" ,
		method : "get" ,
		success : (r) => {
			console.log('GET 응답 성공');
			console.log(r);
			
			// 1. 테이블 제목 구성
			let html = `<tr>
							<th> 번호 </th>
							<th> 제목 </th>
							<th> 작성자 </th>
							<th> 비고 </th>
						</tr>`;
			// 2. 테이블 내용 구성
			r.forEach((o,i) => {
				html += `<tr>
							<td> ${ o.bno } </td>
							<td> ${ o.bcontent }</td>
							<td> ${ o.bwriter } </td>
							<td> 
								<button type="button" onclick="onDelete(${o.bno})">삭제</button> 
								<button type="button" onclick="onUpdate(${o.bno})">수정</button>
							</td>
						</tr>`;
			});
			// 3. 구성된 html 대입
			document.querySelector('.boardtable').innerHTML = html;
		}
	})
	
}

// 3. 특정 게시물 삭제
function onDelete(bno){
	console.log("onDelete() 열림" + bno);
	
	$.ajax({
		url : "/jspweb/Ex3/Board",
		method : "delete",
		data : {"bno" : bno},
		success : ( r ) => {
			console.log('delete 응답 성공 ')
			console.log(r)
			if(r == 'true'){
				alert('삭제 성공');
				onlist();
			}else{
				alert('삭제 실패')
			}
		}
	})	
}

// 4. 특정 게시물 수정
function onUpdate(bno){
	console.log("onUpdate() 열림" + bno);

	let newContent = prompt('수정할 내용 입력 : ');
	
	$.ajax({
		url : "/jspweb/Ex3/Board",
		method : "put",
		data : {"bno" : bno, "newcontent" : newContent},
		success : ( r ) => {
			console.log('put 응답 성공 ')
			console.log(r)
			if(r == 'true'){
				alert('수정 성공');
				onlist();
			}else{
				alert('수정 실패')
			}
		}
	})	
}

