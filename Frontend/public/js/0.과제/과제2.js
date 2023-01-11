console.log('------------과제2-----------')
// 3. 행 반복문으로 만들기
let 테이블행 = '<tr> <th>단</th> <th>곱</th> <th>결과</th> </tr>'; 

for( let 곱 = 1 ; 1<=9 ; 곱++ ){
	console.log(곱)//확인용

	테이블행 += '<tr> <th>2</th> <th>' + 곱 + '</th> ' + <th>2*곱</th> + '</tr>';

}
document.querySelector('.gu_table').innerHTML = 테이블행
