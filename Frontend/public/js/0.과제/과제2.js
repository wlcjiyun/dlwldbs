console.log
('------------과제2-----------')

// 밖에 만들면 결과가 누적됨
//let 테이블행 = '<tr> <th>단</th> <th>곱</th> <th>결과</th> </tr>'; 

function onResult(){
	console.log('클릭함')//확인용
	
	// 클릭할 때마다 실행되기에 누적되지 않음
	let 테이블행 = '<tr> <th>단</th> <th>곱</th> <th>결과</th> </tr>'; 
	
	let dan = document.querySelector('.dan').value
	let gab = document.querySelector('.gab').value
	
	for( let 곱 = 1 ; 곱<=gab ; 곱++ ){ //for S
		테이블행 += '<tr> <th>' + dan + '</th> <th>' + 곱 + '</th> <th>' + (dan*곱) + '</th> </tr>';
	} //for E
	document.querySelector('.gu_table').innerHTML = 테이블행
}

