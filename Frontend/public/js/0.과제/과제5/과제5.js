/* 공통 *///				0		  1		  2		   3		  4
let categoryList = [ '프리미엄' , '스페셜' , '와퍼' , '올데이킹' , '치킨버거' ]

let burgerList = [ 
	{ name:'콰트로치즈X' , price:8200 , img:'버거킹버거1.png' , category:'프리미엄' } ,
	{ name:'기네스와퍼' , price:7200 , img:'버거킹버거2.png' , category:'프리미엄' } ,
	{ name:'몬스터와퍼' , price:9200 , img:'버거킹버거3.png' , category:'스페셜' } ,
	{ name:'갈릭불고기와퍼' , price:6200 , img:'버거킹버거5.png' , category:'와퍼' } 
]

let cartList = [  ]

category_print();
categoty_select(0);
product_ptint(0);

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

// 2. 카테고리 선택 함수
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
	
	// 3. 제품목록 렌더링
	product_ptint( i )
}

// 3. 제품 출력 함수
function product_ptint(index){
	
	// 1. HTML 구성
	let html = ''; //깡통
	
	for( let i = 0 ; i<burgerList.length; i++ ){ // for S
	// i는 0번째 인덱스부터 마지막 인덱스까지 버거 객체를 가져온다
	
		if( burgerList[i].category == categoryList[index] ){ // if S
		// i번째 버거객체의 카테고리와 선택된 카테고리와 같으면
		
		html += `<div class="product">
					<img src="img/${ burgerList[i].img }" width="100%"/>
					<div class="productinfo">
						<div class="ptitle"> ${ burgerList[i].name } </div>
						<div class="pprice"> ${ burgerList[i].price.toLocaleString() } </div>
					</div>
				</div>`
		} // if E
	} // for E
	
	// 2. 구성된 HTML 마크업에 대입
	document.querySelector('.productbox').innerHTML = html
}

// 4. 카트에 담기




























