// 학생들의 점수 객체를 여러개 저장하는 배열
let studentArray = [ ]

// 1. js 열렸을 때 <button> 객체 가져오기
let addbtn = document.querySelector('.addbtn')

// 2. 해당 버튼에 클릭 이벤트
addbtn.addEventListener( 'click' , () => {
	
	// 1. 입력받은 데이터를 하나씩 가져와서 객체화
		// * input에 숫자를 입력해도 value는 무조건 문자열로 가져옴. 형변환 필요!
	let info = {
		name : document.querySelector('.name').value,
		kor : parseInt( document.querySelector('.kor').value ),
		eng : parseInt( document.querySelector('.eng').value ),
		mat : parseInt( document.querySelector('.mat').value )
	}
		console.log( info )
		
	// 2. 유효성 검사
		// 1. 이름 중복체크 
	for( let i = 0; i<studentArray.length; i++ ){
		if( studentArray[i].name == info.name ){
			alert('현재 등록된 학생명입니다.')
		}
	}
		// 2. 점수 0~100 사이만 입력
	if( ( info.kor >= 0 && info <= 100 ) || 
		( info.eng >= 0 && info.eng <= 100 ) ||
		( info.mat >= 0 && info.mat <= 100 ) ){
		alert('입력할 수 없는 점수입니다')
	}
	/*
	studentArray.forEach( (obj) => {
		if( obj.name == info.name ){ 
			alert('현재 등록된 학생명입니다.');
			return;
		} 
	})
	*/
	
})