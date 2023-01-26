/*
	1. 버거 객체
		let burger = {
			name: 버거이름 
			price: 버거가격
			img: 버거이미지
			category: 버거카테고리
		}

	2. 주문객체
		let order = {
			no: 주문번호 
			items: 주문된 cartList
			time: 주문시간
			state: 주문상태
			complete: 주문완료시간
			price: 주문가격 
		}
*/

/*-----------------------------공통: 모든 데이터에서 사용됨(전역변수)--------------------------*/
// 등록된 카테고리 '문자열' 목록/배열
let categoryList = [ '프리미엄' , '스페셜' , '와퍼' , '올데이킹' , '치킨버거' ]
// 등록된 '버거객체' 목록/배열
let burgerList = [ /*현재 등록된 버거 목록*/
	{ name:'콰트로치즈X' , price:8200 , img:'버거킹버거1.png' , category:'프리미엄' } ,
	{ name:'기네스와퍼' , price:7200 , img:'버거킹버거2.png' , category:'프리미엄' } ,
	{ name:'몬스터와퍼' , price:9200 , img:'버거킹버거3.png' , category:'스페셜' } ,
	{ name:'BLT오믈렛킹모닝' , price:8200 , img:'버거킹버거4.png' , category:'올데이킹' } ,
	{ name:'갈릭불고기와퍼' , price:6200 , img:'버거킹버거5.png' , category:'와퍼' }
	 
]
// 카트에 등록된 '버거객체' 목록/배열 /*카트목록*/
let cartList = [ ]
// '주문객체' 목록/배열 /*주문목록*/
let orderList = [ ]
/*-----------------------------------------------------------------------------------*/

/*-------------------------------JS가 열렸을 때 1번 실행되는 함수----------------------------*/
category_print(); 	// 카테고리 1회 호출
categoty_select(0); // 카테고리 선택시 CSS변경/카테고리별 제품출력 함수 호출(기본값:프리미엄)
product_print(0); 	// 제품출력 함수(기본값:프리미엄)
/*-----------------------------------------------------------------------------------*/

/*---------------------------------------키오스크--------------------------------------*/
// 1. 카테고리 출력 함수
function category_print(){
	
	// 1. HTML구성
		let html = `<ul>`
		
		for( let i = 0 ; i<categoryList.length; i++ ){
			html += `<li class="categotyli" onclick="categoty_select( ${i} )">${ categoryList[i] }</li>`
		}
		html += `</ul>`
		
		
	// 2. HTML 출력 
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
	console.log(map배열)

	// 1. 주문
		// 1. order 객체 만들기
		let order = {												
			no : no ,	
			items : map배열 ,	
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
	orderprint();
	salesprint();
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

/*----------------------------------------포스기---------------------------------------*/

/*----------------------------------------버거등록--------------------------------------*/

function 등록(){
	let burger = {
		name : document.querySelector('.burgername').value,
		category : document.querySelector('.burgercategory').value,
		price : parseInt( document.querySelector('.burgerprice').value ),
		img : document.querySelector('.burgerimg').value
	}
	/* 카테고리명 */
	if( !categoryList.includes( burger.category ) ){ alert('존재하지 않는 카테고리명입니다.'); return; }
	/* 가격이 숫자인지 */
	if( isNaN( burger.price ) ){ alert('숫자만 입력이 가능합니다'); return; }
	
	burgerList.push( burger ); alert('버거 등록 성공')
	console.log(burger)
	categoty_select(0);
}

/*-------------------------------------버거 등록 현황------------------------------------*/
출력();
function 출력(){
	
	let html = `<tr>
					<th width="5%">제품번호</th>
					<th width="10%">이미지</th>
					<th width="30%">버거이름</th>
					<th width="20%">카테고리명</th>
					<th width="15%">가격</th>
					<th width="20%">비고</th>
				</tr>`
	/* for문 */			
	/*for( let i = 0; i<burgerList.length; i++ ){
		
		html += `<tr> 
					<td> ${ i+1 } </td>
					<td>  </td>
					<td> ${ burger[i].name }</td>
					<td> ${ burger[i].category }</td>
					<td> ${ burger[i].price }</td>
					<td>
						<button onclick="onDelete(${i})">삭제</button>
						<button onclick="onChange(${i})">가격수정</button>
					</td>
				 </tr>`
	}*/
	/* forEach문 */
	burgerList.forEach( (o,i) => {
		html += `<tr> 
					<td> ${ i+1 } </td>
					<td> <img src="img/${o.img}" width="100%"> </td>
					<td> ${ o.name }</td>
					<td> ${ o.category }</td>
					<td> ${ o.price.toLocaleString() }원</td>
					<td>
						<button onclick="onDelete(${i})">삭제</button>
						<button onclick="onChange(${i})">가격수정</button>
					</td>
				 </tr>`
	})
	document.querySelector('.burgertable').innerHTML = html
}
/*-----------삭제----------*/
function onDelete( i ){
	burgerList.splice( i , 1 );
	alert('삭제하였습니다')
	출력();
}

/*----------수정----------*/
function onChange(i){
	let newprice = prompt('새로운 금액 : ')
	burgerList[i].price = isNaN( parseInt( newprice ) ) ? burgerList[i].price : parseInt( newprice );
	alert('금액이 변경되었습니다')
	출력(); categoty_select(0);
}

/*-------------------------------------주문된 버거 현황------------------------------------*/
orderprint();
function orderprint(){
	let html = `<tr>
				<th width="5%">주문번호</th>
				<th width="30%">버거이름</th>
				<th width="15%">상태</th>
				<th width="30">요청시간/완료시간</th>
				<th width="20%">비고</th>
			</tr>`
			
	orderList.forEach( (order,i) => { // 주문리스트 회전/반복
	console.log(order)
		order.items.forEach( (burger,j) => { // 각 주문마다 버거리스트 회전/반복
		
			let time = order.time.getHours()+':'+order.time.getMinutes();
			
			if( order.state == false ){ //주문완료 -> 주문완료시간 존재
				time += '/' + order.time.getHours()+':'+order.time.getMinutes();
			}
			
			html += `<tr>
						<th>${order.no}</th>
						<th>${burger.name}</th>
						<th>${order.state ? '주문요청' : '주문완료' }</th>
						<th>${time}</th>
						<th>
							${ /* 삼항연산자 */
								order.state ?
									'<button onclick="onComplete( ' + i + ' )">주문완료</button>' : 
										'<span></span>' 
							}
						</th>
					</tr>`
		})
	})
	document.querySelector('.ordertable').innerHTML = html;
}

function onComplete(i){
	orderList[i].state = false; /* state 상태 */
	orderList[i].complete = new Date(); /* complete 완료시간 */
	orderprint();
}

/*-------------------------------------------매출---------------------------------------*/
salesprint();
function salesprint(){
	let html = `<tr>
					<th width="5%">제품번호</th>
					<th width="35%">버거이름</th>
					<th width="20%">판매수량</th>
					<th width="20%">매출액</th>
					<th width="20%">순위</th>
				</tr>`
				
	burgerList.forEach( (burger, i) => {
		html += `<tr>
					<th>${i+1}</th>
					<th>${burger.name}</th>
					<th>${salescount(i)}</th>
					<th>${(salescount(i)*burger.price).toLocaleString()}원</th>
					<th>${salesrank(i)}</th>
				</tr>`
	})		
	document.querySelector('.salestable').innerHTML = html
}

// 판매 수량 찾기
function salescount(index){
	let count = 0 ; // 1. i번째 제품의 누적 판매수량을 체크하는 변수 
	
	orderList.forEach( (order,i) => {
		order.items.forEach( (burger,j) => {
			if( burger.name == burgerList[index].name ){ count++; }
		})
	})
	
	return count ; // * i번째 제품의 누적 판매량수 변수 반환
}

function salesrank(index){
	
	let rank = 1 // index번째의 버거의 순위를 저장하는 변수
	
	// index번 째의 버거의 순위 구하기
	let total = salescount(index)*burgerList[index].price
	// 모든 버거의 매출액
	burgerList.forEach( (burger,i) => {
		let total2 = salescount(i)*burger.price
		if( total < total2 ){ rank++; }
	})
	return rank;
}






































