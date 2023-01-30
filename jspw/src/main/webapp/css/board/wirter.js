
let 게시물임시저장소 = []

// 글 등록 버튼을 눌렀을 때 함수
function board_writer(){
	// 1. 입력받은 데이터 객체화한다
	let board = {
		title : document.querySelector('.btitle').value ,
		content : document.querySelector('.bcontent').value ,
		writer : document.querySelector('.bwriter').value ,
		password :document.querySelector('.bpassword').value ,
	};
	console.log(board)
	
	// 첨부파일
		// 1. 입력양식
		let writer_form = document.querySelector('.writer_form');
		let formData = new FormData(writer_form)
		console.log(formData)
	
	// 유효성 검사 생략
		
	// 2. JAVA에게 데이터를 전송하고 전송된 결과를 받는다. [통신-AJAX] 생략
	
	/*임시*/게시물임시저장소.push(board)
	// 3. 결과에 따른 이벤트
	let result = true; // JAVA로부터 전송결과
	if( result ){ alert('글쓰기 성공'); location.href = 'list.html'; }
	/* location.href = '경로' */
	else{ alert('글쓰기 실패') }
	
	
}



$(document).ready(function() {
  $('#summernote').summernote({height:300 , lang: 'ko-KR'});
});

/*
	썸머노트 기능 속성	
	$('#summernote').summernote({ 속성명:속성값 });
*/