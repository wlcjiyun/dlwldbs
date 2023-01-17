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
	if( check ){ studentArray.push( info ); alert('학생 점수를 등록했습니다.') }
	
})



