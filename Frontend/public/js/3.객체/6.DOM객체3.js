// ketup 이벤트 : 키보드를 누르고 땠을 때에 대한 이벤트

	// 1. <txetarea> 마크업 객체화
const textarea = document.querySelector( 'textarea' )
const h3 = document.querySelector( 'h3' )

	// 2. 해당 마크업의 이벤트 등록 [ 객체명.addEventListener ]
textarea.addEventListener( 'keyup', ( event ) => {
	
	// 3. 해당 마크업 사이에 HTML 대입 [ 객체명.innerHTML : HTML형 문자 ]
	h3.innerHTML = `글자 수 : ${ textarea.value.length }`
	
	//4. 키 상태 확인
	console.log( event )
	console.log( 'alt 키 : ' + event.altKey )
	console.log( 'ctrl 키 : ' + event.ctrlKey )
	console.log( 'shift 키 : ' + event.shiftKey )
	console.log( 'code 키 : ' + event.code )
	console.log( 'name 키 : ' + event.key )
})

textarea.style.position = 'absolute' // css조작 : static(기본값) --> 위치 이동 불가
let x = 0; // x축 : 처음 위치 설정
let y = 0; // y축 : 상위 마크업 시작점 기준
let block = 10; // 이동 단위(속도)

print(); // 위치 배치 1번 실행

function print(){ // 위치 배치 함수
	textarea.style.left = `${ x*block }px` // CSS left : (x*이동단위)+'px'
	textarea.style.top = `${ y*block }px` // CSS top : `${y*이동단위}px`
}
	
// 2. keydown 이벤트 : 키보드 키를 입력했을 때
//document.body.addEventListener( 'keyup' )  
document.body.addEventListener( 'keydown' , ( e ) => {
	
	if( control ){ // 만약에 control이 true인 경우에만 실행
		let key = e.keyCode;			console.log( e.keycode )
		if( key == 37 ){ x--; } /*왼쪽*/
		else if( key == 38 ){ y--; } /*위쪽*/
		else if( key == 39 ){ x++; } /*오른쪽*/
		else if( key == 40 ){ y++; } /*아래쪽*/
		print()
	}
})  

/* ! 이벤트 제어권 변수 */
let control = true; // 이벤트 제어 전역 변수
// 3. 
document.querySelector( '.moving' ).addEventListener( 'click' , () => {
	/*------------------스위치 on/off-------------------*/
	// control = false; // 제어 변수 변경(변수 변경)
	// control ? control=false : control=true // 삼항연산자
	control = ! control
})









































































