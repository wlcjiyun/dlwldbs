/**
	new Date() 날짜/시간 관련된 클래스
	let date = new date() : 현재 날짜/시간 객체
	let date = new date( 2023 , 01 , 31 ) : 사용자정의 날짜/시간 객체
		1. get 함수 제공
			- getFullYear : 연도
			- Month : 월 ( 0~11 -> 0:1월 / 11:12월 )
			- getDate : 일
			- getDay : 요일 ( 0~6 -> 0:일 / 6:토)

	let date = new date();
	let date2 = new date( 2023 , 01 , 30 );
	console.log( date.getFullYear());
	console.log( date.Month() );
	console.log( date.getDate() );
	console.log( date.getDay() );
*/
/* DB */
	// 일정목록
let content = [
	{date: '20230101' , content: '새해맞이 여행'} ,
	{date: '20230103' , content: '동창 만나기'} ,
	{date: '20230101' , content: '쇼핑 100만원 '} 
]

/*----------------------------------------------------------------------------*/

// 1. js열렸을 때 현재 '연도'와 '월'을 구해서 변수에 저장
let year = new Date().getFullYear(); //현재 연도 -> 버튼 클릭에 따른 변경
let month = new Date().getMonth()+1; // 현재 월 -> 버튼 클릭에 따른 변경

// 2. 캘린더 상단에 표시 ( js실행, 버튼 클릭)
cal_print();
function cal_print(){
	// 2-1. 상단에 '연도', '월' 표시
	document.querySelector('.top_date').innerHTML = `${ year }년 ${ month }월`

	// 2-2. html 기본 구성
	let html = `<div class="week sun">일</div>
				<div class="week">월</div>
				<div class="week">화</div>
				<div class="week">수</div>
				<div class="week">목</div>
				<div class="week">금</div>
				<div class="week sat">토</div>`
				
	// *-1. 현재 캘린더에 설정된 날짜의 마지막 일의 날짜 객체 만들기
	let lastday = new Date( year , month , 0 ).getDate();
	
	// *-2. 현재 캘린더에 설정된 날짜의 1일 시작 요일 구하기
	let weekday = new Date( year , month-1 , 1 ).getDay();
	
	// *-3. 시작 용리 전에 공백 만들기
	for( let b = 1; b<weekday; b++ ){
		html += `<div class="day"></div>`
	}
	// *-4. '일' 만들기 ( 1~마지막일[?월마다 다름]까지 )
	for( let day = 1; day<lastday; day++){
		
		// 2-3. 1일부터 마지막 일 날짜 확인
		let date = ( new Date( year , month-1 , day ) );
		let fdate = date_format( date );
		//console.log(date); 
		//console.log( date_format(date) ); 
		
		html += `<div class="day">${ day }${ content_print( fdate ) }</div>`
	}
	
	// 2-4. html 마크업에 출력
	document.querySelector('.cal_day').innerHTML = html;
}

// 5. 일정 출력 함수
function content_print( fdate ){
	// 5-1. 인수로 전달된 날짜와 동일한 일정 날짜 찾기
	let html = ``
	content.forEach( (o) => { // 일정목록 반복문
		// 만약에 인수로 전달된 날짜와 일정목록에서 동일한 날짜가 존재하면
		if( fdate == o.date ){
			html += `<div class="content">${ o.content }</div>`
		}
	})
	return html;
}

// 4. 날짜 포멧 함수 [ 인수 : 날짜 ---로직[포멧]---> 반환 : 변경된 날짜 형식 ]
function date_format( date ){
	
	let d_year = date.getFullYear();
	// 만약에 '월'/'요일'이 한 자리 수 이면 앞에 0 붙이기
	let d_month = (date.getMonth()+1) <=9 ? '0' + (date.getMonth()+1) : (date.getMonth()+1);
	let d_day = date.getDate() <= 9 ? '0' + date.getDate() : date.getDate();
	return `${d_year}${d_month}${d_day}`
}

// 3. 버튼 클릭 이벤트에 따른 '월' 변경
document.querySelector('.previousbtn').addEventListener( 'click' , ( e ) => {
	//console.log('이전 달 클릭')
	month--;
	// 만약에 '월'을 -1 차감했을 경우 1보다 작아지면 '연도'를 차감시키고 '월'을 12로 설정
	if( month < 1 ){ year--; month = 12; }
	cal_print();
})
document.querySelector('.nextbtn').addEventListener( 'click' , ( e ) => {
	//console.log('다음 달 클릭')
	month++;
	// 만약에 '월'을 +1 증가했을 경우 12보다 커지면 '연도'를 증가시키고 '월'을 1로 설정
	if( month > 12 ){ year++; month = 1; }
	cal_print();
})








