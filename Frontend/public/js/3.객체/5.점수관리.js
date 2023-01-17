// * 학생들의 점수객체를 여러개 저장하는 배열 
let studentArray = [ ]
// 1. JS 열렸을때 <button> 객체 가져오기 
let addbtn = document.querySelector('.addbtn')
// 2. 해당 버튼에 클릭 이벤트 
addbtn.addEventListener( 'click' , () => {
	
	// 1. 입력받은 데이터를 하나씩 가져와서 객체화
		// * input 숫자를 입력해도 value는 무조건 문자열 가져온다. 형변환 필요!!
	let info = {
		name : document.querySelector('.name').value ,
		kor : parseInt(  document.querySelector('.kor').value ) ,
		eng : parseInt( document.querySelector('.eng').value ) ,
		mat : parseInt( document.querySelector('.mat').value )
	}
	
	// 2. 유효성검사 [ 데이터 체크 ]
	let check = true; //유효성 검사 상태를 저장하는 변수 [ 아래 4개 중 하나라도 충족하면 저장 실패 ]
		// 1. 이름 중복체크
	for( let i = 0 ; i< studentArray.length ; i++ ){
		if( studentArray[i].name == info.name ){
			alert('이미 등록된 이름입니다.'); check = false;
			/* document.querySelector('.namebox').innerHTML = '이미 등록된 이름입니다.' */
		} // if end 
	} // for end 
	/*
	studentArray.forEach( (obj) => {
		if( obj.name == info.name ){ 
			alert('현재 등록된 학생명입니다.');
			return;
		} 
	})
	*/
		// 2. 점수 0~100 사이만 입력 
	if( ( info.kor<0  || info.kor>100 ) ||
		( info.eng<0 || info.eng>100 ) || 
		( info.mat<0 || info.mat>100 ) ) {
		alert('입력할수 없는 점수 범위 입니다. [ 0~100 사이만 가능 '); check = false;
	}
		// 3. 이름 3~5 사이만 입력 
	if( info.name.length < 3 || info.name.length > 5 ){
		alert('이름은 3~5글자 사이만 입력이 가능합니다.'); check = false;
	}
		// 4. 점수가 숫자가 아닐 경우 [ isNaN : 숫자이면 True or false ]
	if( isNaN( info.kor ) || isNaN( info.eng ) || isNaN( info.mat ) ){
		alert('숫자 형식으로 입력해주세요.'); check = false;
	}
	
	// 3. 저장 [ 위 유효성 검사 하나라도 충족하지 않았을 때 ]
	if( check ){ studentArray.push( info ); alert('학생 점수를 등록했습니다.'); printTable();}
	
	/*
	let html = `<tr> <th>번호</th><th>이름</th>
					 <th>국어</th><th>영어</th>
					 <th>수학</th><th>총점</th>
					 <th>평균</th><th>순위</th> </tr>`
					 
	for( let i = 0 ; i<studentArray.length ; i++ ){
		html = `<tr>
					<td>${i+1}</td>
					<td>${info.name}</td>
					<td>${info.kor}</td> 
					<td>${info.eng}</td> 
					<td>${info.mat}</td>
					<td></td>
					<td></td> 
				</tr>`
	}
	document.querySelector('.listtable').innerHTML = html;
	*/
})

// 2. 배열 내 객체를 테이블에 출력하는 함수 [ 1.js열렸을때 2.등록할때마다/업데이트 3.삭제 4.수정]
printTable() // 함수 호출
function printTable(){
	
	let html = `<tr> 
					 <th>번호</th><th>이름</th><th>국어</th>
					 <th>영어</th><th>수학</th><th>총점</th>
					 <th>평균</th><th>순위</th> <th>비고</th>
				</tr>`
				
	studentArray.forEach( ( o , i ) => { 
		
		// 1. 총점
		let total = o.kor+o.eng+o.mat;
		// 2. 순위구하기
		let rank = 1;
		studentArray.forEach( (o2) => {
			//1. 비교할 총점
			let total2 = o2.kor + o2.eng + o2.mat;
			// 2. 만약에 총점이 비교할 총점보다 작으면 순위는 하락한다
			if( total < total2 ){ rank++; }
		})
		/*
			배열 내 순위
			예시) 
				for1 : 80	90	75	100
				
				for2 : 80	90	75	100

					80 : rank=1
						80 	: 80<80 	: f
						90 	: 80<90		: t : rank++ : rank=2 
						75 	: 80<75 	: f
						100 : 80<100 	: t : rank++ : rank=3
					
					90 : rank=1
						80 	: 90<80 	: f
						90 	: 90<90 	: f
						75 	: 90<75 	: f
						100 : 90<100 	: t : rank++ : rank=2
						
					75 : rank=1
						80 	: 75<80 	: t : rank++ : rank=2
						90 	: 75<90 	: t : rank++ : rank=3
						75 	: 75<75 	: f
						100 : 75<100 	: t : rank++ : rank=4
						
					100 : rank=1
						80 	: 100<80 	: f
						90 	: 100<90 	: f
						75 	: 100<75 	: f
						100 : 100<100 	: f :		: rank=1
		*/	
		
		html += `<tr> 
					 <td>${i+1}</td>
					 <td>${ o.name }</td>
					 <td>${ o.kor }</td>
					 <td>${ o.eng }</td>
					 <td>${ o.mat }</td>
					 <td>${ total }</td>
					 <td>${ parseInt(total/3) }</td>
					 <td>${ rank }</td>
					 <td>
					 	<button onclick="onDelete( ${i} )">삭제</button>
					 	<button onclick="onUpdate( ${i} )">수정</button>
					 </td>
				</tr>`	
	} )
		
		
	document.querySelector('.listtable').innerHTML = html;
}

// 3. 배열 내 객체 삭제 [ 삭제할 인덱스 필요 ]
function onDelete(i){
	studentArray.splice( i , 1 ); // 선택한 i번째 인덱스 객체 제거
	printTable(); // 삭제 후 새로고침/업데이트
} 

// 4. 수정 버튼 클릭했을 때 [ 수정할 인덱스 !! ]
let upindex = -1; //수정할 인덱스 // 여러 { }에서 사용하려고 밖으로 뺌 // 전역변수
function onUpdate(i){
	upindex = i // 내가 선택한 i번째 인덱스 // 지역변수
	document.querySelector('.updatebox').style.display = 'block' // 1. 수정 페이지 보여주기
	// 2. 기존의 데이터 대입
	document.querySelector('.upname').value = studentArray[upindex].name
	document.querySelector('.upkor').value = studentArray[upindex].kor
	document.querySelector('.upeng').value = studentArray[upindex].eng
	document.querySelector('.upmat').value = studentArray[upindex].mat

	// 5. 점수 수정 버튼을 클릭했을 때
	let updatebtn = document.querySelector('.updatebtn')
	updatebtn.addEventListener('click', () => {	
		
		// 1. 수정된 데이터 가져오기 // 2. 해당 객체의 속성 값 변경
		studentArray[upindex].kor = parseInt( document.querySelector('.upkor').value )
		studentArray[upindex].eng = parseInt( document.querySelector('.upeng').value )
		studentArray[upindex].mat = parseInt( document.querySelector('.upmat').value )
		
		// 2. 수정 페이지 보여주기
		document.querySelector('.updatebox').style.display = 'none'
		
		printTable();
	})	
}
