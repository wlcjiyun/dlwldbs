/* 공통 */
let categoryList = [ '프리미엄' , '스페셜' , '와퍼' , '올데이킹' , '치킨버거' ]

let burgerList = [ /*현재 등록된 버거 목록*/
	{ name:'콰트로치즈X' , price:8200 , img:'버거킹버거1.png' , category:'프리미엄' } ,
	{ name:'기네스와퍼' , price:7200 , img:'버거킹버거2.png' , category:'프리미엄' } ,
	{ name:'몬스터와퍼' , price:9200 , img:'버거킹버거3.png' , category:'스페셜' } ,
	{ name:'갈릭불고기와퍼' , price:6200 , img:'버거킹버거5.png' , category:'와퍼' } ,
	{ name:'BLT오믈렛킹모닝' , price:8200 , img:'버거킹버거6.png' , category:'올데이킹' } 
]

let cartList = [ ] /*카트목록*/

let orderList = [ ] /*주문목록*/

category_print();
categoty_select(0);
product_print(0);

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
	product_print( i )
}

// 3. 제품 출력 함수
function product_print(index){
	
	// 1. HTML 구성
	let html = ''; //깡통
	
	for( let i = 0 ; i<burgerList.length; i++ ){ // for S
	// i는 0번째 인덱스부터 마지막 인덱스까지 버거 객체를 가져온다
	
		if( burgerList[i].category == categoryList[index] ){ // if S
		// i번째 버거객체의 카테고리와 선택된 카테고리와 같으면
		
		html += `<div class="product" onclick="cartadd( ${i})">
					<img src="img/${ burgerList[i].img }" width="100%"/>
					<div class="productinfo">
						<div class="ptitle"> ${ burgerList[i].name } </div>
						<div class="pprice"> ${ burgerList[i].price.toLocaleString() }원 </div>
					</div>
				</div>`
		} // if E
	} // for E
	
	// 2. 구성된 HTML 마크업에 대입
	document.querySelector('.productbox').innerHTML = html
}

// 4. 선택한 제품을 카트에 담기
function cartadd( i ){ // f s 
	cartList.push( burgerList[i] ) // 1. 선택한 i번째 버거의 객체를 cartlist에 추가 
	cart_print();  // 카트내 제품 화면 렌더링[새로고침]
} // f e 

// 5. 주문 취소 버튼
function cancel(){
	alert('주문 취소')
	cartList.splice(0); // 개수 생략시 전체 삭제
	cart_print(); // 카트 내 제품 렌더링
}

// 6. 주문하기 버튼
function order(){
	alert('주문하기');
	console.log('주문하기 전 카트')
	console.log(cartList)
	
	// 1. 주문번호 만들기
	let no = 0;
	// 마지막인덱스 : 배열명.length-1
	if( orderList.length == 0 ){ no = 1; } // 만약에 길이가 0이면 == 주문이 하나도 없으면 주문번호 1
	else{ no = orderList[ orderList.length-1 ].no+1 } // 아니면 마지막 인덱스 주문객체의 주문번호+1을 다음 주문번호 사용
	
	// 2. 총가격 만들기
	let total = 0;
	for( let i = 0; i<cartList; i++ ){ total += cartList[i].price }
	
				// .map( (반복변수) => { 실행문; return; } ) : 반복실행문 return 값을 배열로 반환
	let map배열 = cartList.map( (o) => {return o;} )

	// 1. 주문
		// 1. order 객체 만들기
		let order = {												
			no : no ,	
			item : map배열 ,	
			time : new Date() , // 현재 날짜&시간
			state : true ,		// ture : 주문 / false : 주문완료
			complete : 0 ,		// 주문 완료 전
			price : total ,		// cartList 배열 내 버거 객체들의 총금액 합계
		}
		
		// 2. order 객체 배열에 저장
		orderList.push( order )
		console.log('주문하기 후 카트')
		console.log(orderList)
	
	cartList.splice(0)
	cart_print();
}

// 7. 카트 내 버거 출력 [1.제품 클릭할 때마다 2.취소/주문할 때마다]
function cart_print(){
	// 2. 버거 개수 카운트
	document.querySelector('.pcount').innerHTML = cartList.length
	// 3. 버거 총 금액 
	let total = 0;
	for( let j = 0 ; j<cartList.length ; j++ ){ total += cartList[j].price } 
	document.querySelector('.ptotal').innerHTML = total.toLocaleString();
	// 4.
	let html = ''	// 1. 기본 html 구성 
	for( let j = 0 ; j<cartList.length ; j++ ){
		html += `<div class="item">
					<div class="ititle"> ${ cartList[j].name } </div>
					<div class="iprice"> ${ cartList[j].price.toLocaleString() }원</div>
				</div>`
	}
	document.querySelector('.cartbottom').innerHTML = html; // 2. 구성된 html 마크업에 대입 
}
