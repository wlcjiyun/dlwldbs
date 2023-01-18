/* 공통 */
let categoryList = [ '프리미엄' , '스페셜' , '와퍼' , '올데이킹' , '치킨버거' ]

category_print()
// 1. 카테고리 출력 함수
function category_print(){
	
	// 1. HTML구성
		let html = `<ul>`
		
		for( let i = 0 ; i<categoryList.length; i++ ){
			html += `<li>${ categoryList[i] }</li>`
		}
		html += `</ul>`
	// 2. 해당 마크업에 HTML 출력 
	document.querySelector('.categorybox').innerHTML = html
}








