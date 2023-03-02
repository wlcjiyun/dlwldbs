let productList = [
	{ img:'item1.gif', title:'item_name', price:10000, discount:0.1, like:0 , rivew:0 },
	{ img:'item2.gif', title:'item_name', price:10000, discount:0.1, like:0 , rivew:0 },
	{ img:'item3.gif', title:'item_name', price:10000, discount:0.1, like:0 , rivew:0 },
	{ img:'item4.gif', title:'item_name', price:10000, discount:0.1, like:0 , rivew:0 },
	{ img:'item5.gif', title:'item_name', price:10000, discount:0.1, like:0 , rivew:0 },
	{ img:'item6.gif', title:'item_name', price:10000, discount:0.1, like:0 , rivew:0 },
	{ img:'item7.gif', title:'item_name', price:10000, discount:0.1, like:0 , rivew:0 },
	{ img:'item8.gif', title:'item_name', price:10000, discount:0.1, like:0 , rivew:0 },
	{ img:'item9.gif', title:'item_name', price:10000, discount:0.1, like:0 , rivew:0 },
	{ img:'item10.gif', title:'item_name', price:10000, discount:0.1, like:0 , rivew:0 }
]
function product_print(){
	
	let html=``
	
	productList.forEach( ( o,i ) => {
			html += `<div class="item"> 					
						<img src="img/${ o.img }">
						<div class="item_info">
							<div class="item_title">${ o.title }</div>	
							<div class="item_price">${ o.price.toLocaleString() } 원</div>
							<div>
								<span class="item_sale">${ ( o.price - (o.price*o.discount) ) .toLocaleString() } 원</span>
								<span class="item_discount">${ o.discount*100 }%</span>
							</div>
						</div>
						<div class="item_bottom">
							<div class="item_review"> 찜 ${ o.like } 리뷰수 ${ o.rivew }</div>	
						</div>
					</div>`
	})
	document.querySelector('.itembox1').innerHTML = html;
}