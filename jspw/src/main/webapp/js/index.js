
let productList = [
	{ img:'p1.gif' , title:'링딘 오픈하찌 롱가디건' , size:'FREE' , price:29800 , discount:0.1 , like:54 , rivew:198},
	{ img:'p2.gif' , title:'내맘속 물결 반목 스판티' , size:'FREE' , price:16000 , discount:0.2 , like:80 , rivew:253},
	{ img:'p3.gif' , title:'벤므 울 보카시 나그랑가디건' , size:'FREE' , price:27900 , discount:0.1 , like:10 , rivew:2},
	{ img:'p4.gif' , title:'키분 더블버튼 꽈배기 카라니트' , size:'FREE' , price:23400 , discount:0.2 , like:38 , rivew:5},
	{ img:'p5.gif' , title:'와편해 속기모 시계포켓 배기진' , size:'FREE' , price:23900 , discount:0.1 , like:26 , rivew:16},
	{ img:'p6.gif' , title:'친퍼 기모 자수 나그랑맨투맨' , size:'FREE' , price:33900 , discount:0.2 , like:37 , rivew:54}
]

product_print();

function product_print(){
	let html = ``
	productList.forEach( ( o , i ) => { 
		html += `
			<div class="item"> 					
				<img src="img/${ o.img }">
				<div class="item_info">
					<div class="item_title">${ o.title }</div>	
					<div class="item_size">${ o.size }</div>	
					<div class="item_price">${ o.price.toLocaleString() } 원</div>
					<div>
						<span class="item_sale">${ ( o.price - (o.price*o.discount) ) .toLocaleString() } 원</span>
						<span class="item_discount">${ o.discount*100 }%</span>
					</div>
				</div>
				<div class="item_bottom">
					<div>
						<span class="badge rounded-pill text-bg-warning">주문폭주</span>
						<span class="badge rounded-pill text-bg-danger">1+1</span>
					</div>
					<div class="item_review"> 찜 ${ o.like } 리뷰수 ${ o.rivew }</div>	
				</div>
			</div>`
	} )
	document.querySelector('.itembox').innerHTML = html;
}