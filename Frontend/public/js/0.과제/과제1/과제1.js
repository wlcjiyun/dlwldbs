/*console.log('JS실행') //확인용*/

/*------------------------------------과제1------------------------------------*/

// 4. 배열 선언
	// - 함수 안에서 선언 ---> 함수 실행마다 선언
	// - 함수 밖에서 선언 ---> JS 실행시 한 번 선언
// 4. 배열 선언과 동시에 3개의 요소 저장
let studentArray = ['20230110', '20230109', '20230108']

// 3. HTML : onLogin()에 대한 함수 정의/만들기
function onLogin(){
	
	//console.log('onLogin함수실행') //확인용
	
	//5. <input> 마크업 JS변수로 가져오기
	let sno = document.querySelector('.sno')
	//5. <input> 마크업에 입력된 데이터 호출
	let snoValue = sno.value;
	console.log('5번 체크 : ' + snoValue) //5번 확인용
	
	//6. 찾기 [ 만약에 배열에 입력한 값이 존재하면 찾은 인덱스 / 존재하지 않으면 -1 표시 ]
	let sIndex = studentArray.indexOf(snoValue)
	console.log('6번 체크: ' + sIndex) //6번 확인용
	
	//7. 논리
	if(sIndex==-1){
		alert('로그인 실패')
		document.querySelector('.resultbox').innnerHTML = '로그인 실패'
	}
	else{
		alert('로그인 성공');
		document.querySelector('.resultbox').innnerHTML = '로그인 성공'
	}	
}

/*------------------------------------과제2------------------------------------*/
console.log('실행') //확인용
/*
studentArray = push(index(0, 1, 2))
function onBtn(){
		
	let num = document.querySelector('.num')
	let numValue = num.value;
	console.log('5번 체크 : ' + numValue) //5번 확인용
	
	let xIndex = studentArray.push(numValue)
	console.log('6번 체크: ' + xIndex) //6번 확인용
	
	if(xIndex==0){
		alert('등록')
		document.querySelector('.resultbox').innnerHTML = '등록'
	}
	else{
		alert('등록');
		document.querySelector('.resultbox').innnerHTML = '등록'
	}	
}
*/

function join(){
	let cnum = document.querySelector('.cnum') /* 마크업 변수로 가져오기 */
	let sname2 = cnum.value
	let long2 = sname2.length
	console.log(long2)
	let sindex2 = studentArray.indexOf(sname2);
	if(sname2=="")
		document.querySelector('.resultbox2').innerHTML = '학번을 입력해주세요!';
	else if(long2!=8)
		document.querySelector('.resultbox2').innerHTML = '학번을 8자리로 입력해주세요!';
	else if(sindex2 != -1) 
		document.querySelector('.resultbox2').innerHTML = '이미 있는 학번입니다!';
	else {
		studentArray.push(cnum.value); 
		document.querySelector('.resultbox2').innerHTML = '학번 등록 성공!'; 
		}
	console.log(studentArray)
}