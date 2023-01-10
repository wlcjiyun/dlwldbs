/* 1. 추가 버튼을 눌렀을 때 이벤트 */

alert('JS실햅합니다.') // 1번 실행

function onAdd(){
	// 1. function : 함수 정의 키워드
	// 2. onAdd : 함수명 
	// 3. ( ) : 인수 [ 함수 실행시 함수 안으로 전달받은 데이터 ]
	// 4. { } : 함수가 실행되는 구역 
	alert('클릭함수 실행합니다.') // 함수를 실행할 때마다
	
	/* 2. 입력받은 input value[값]을 가져오기 
		HTML 마크업을 변수화 = DOM (document = HTML)
			Class : document.querySelector('.')
			Id : document.querySelector('#') 
			
			마크업 속성 
				변수명.value : 해당 마크업의 value속성 호출		
			
	*/
	let sname = document.querySelector('.sname')
		// sname이라는 변수에 input 마크업 저장
	
	/* 3. 마크업에서 값 가져오기 */
	alert(sname.value)
	
	
	
	
	
}		


	