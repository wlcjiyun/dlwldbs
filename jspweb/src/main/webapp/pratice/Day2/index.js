// alert('실행');

function Ex1(){ // 함수를 정의한 것.
	
	// * 변수 10개를 하나의 객체로 만든다
	let info = {
		data1 : document.querySelector('.data1').value,
		data2 : document.querySelector('.data2').value,
		data3 : document.querySelector('.data3').value,
		data4 : document.querySelector('.data4').value,
		data5 : document.querySelector('.data5').value,
		data6 : document.querySelector('.data6').value,
		// data7 : radio에서 선택된 버튼의 value값 가져오기
		data7 : document.querySelector('input[name="data7"]:checked').value ,
		// data8 : 체크여부[ true / false ]
		data8 : document.querySelector('.data8').checked,
		data9 : document.querySelector('.data9').value,
		data10 : document.querySelector('.data10').value
	}
	console.log(info);
	
	// * JQUERY 라이브러리 필수!
	$.ajax({					
		url : "http://localhost:8080/jspweb/Ex2", 		// 1. 서블릿 주소					
		method : "post", 			// 2. 메소드 방식
		data : info, 				// 3. 보낼 데이터[ doget / dopost ]
		success : function(result){ // 4. 받을 데이터[ 객체 VS {} ]
			console.log(result);
			if(result == 'true'){
				alert('등록성공');
				getData();
			}else{
				alert('등록실패');
			}
		} 						
	});
}

getData();
function getData(){
	
	$.ajax({
		url : "http://localhost:8080/jspweb/Ex2",
		method : "get",
		success : function(result){
			//console.log(result);
			//document.querySelector('.ex1_box').innerHTML = result;
			
			// 객체명.forEach( ( 반복변수 , 반복인덱스 ) => { 실행문 } )
			
			let html = `
						<table border="1">
							<tr>
								<th> data1 </th> <th> data2 </th>
								<th> data3 </th> <th> data4 </th>
								<th> data5 </th> <th> data6 </th>
								<th> data7 </th> <th> data8 </th>
								<th> data9 </th> <th> data10 </th>
							</tr>
						`
			result.forEach( ( o , i ) => {
				html += `
						<tr>
							<th> ${o.data1} </th> <th> ${o.data2} </th>
							<th> ${o.data3} </th> <th> ${o.data4} </th>
							<th> ${o.data5} </th> <th> ${o.data6} </th>
							<th> ${o.data7} </th> <th> ${o.data8} </th>
							<th> ${o.data9} </th> <th> ${o.data10} </th>
						</tr>
						`
			})
				html += `</table>`
			document.querySelector(".ex1_box").innerHTML = html;
		}
	})
}



















