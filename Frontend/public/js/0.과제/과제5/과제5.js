/* 공통 */
let categoryList = [ '프리미엄' , '스페셜' , '와퍼' , '올데이킹' , '치킨버거' ]

category_print();
categoty_select(0);
// 1. 카테고리 출력 함수
function category_print(){
	
	// 1. HTML구성
		let html = `<ul>`
		
		for( let i = 0 ; i<categoryList.length; i++ ){
			html += `<li class="categotyli" onclick="categoty_select( ${i} )">${ categoryList[i] }</li>`
		}
		html += `</ul>`
		
		
	// 2. 해당 마크업에 HTML 출력 
	document.querySelector('.categorybox').innerHTML = html
}

function categoty_select( i ){ // i : 선택된 li의 인덱스

	// 1. 모든 li를 가져와서 배열에 저장
	let categotyli = document.querySelectorAll( ".categotyli" )

	// 2. 모든 li 배열 반복문
	for( let j = 0 ; j<categotyli.length; j++ ){ // for s
		if( j == i ){ // if s // 만약에 li배열에서 내가 선택한 li의 인덱스와 같으면 
			categotyli[j].classList.add( 'categoryselect' ); // 해당 마크업의 class 식별자 추가
		}else{ // 만약에 li배열에서 내가 선택한 li의 인덱스와 같지 않으면
			categotyli[j].classList.remove( 'categoryselect' ); // 해당 마크업의 class 식별자 제거
		} // else e
	} // for e
}







