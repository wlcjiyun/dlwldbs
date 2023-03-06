//alert('실행');
function 과제2(){
	
	let info = {
		data1 : document.querySelector('.data1').value,
		data2 : document.querySelector('.data2').value,
		data3 : document.querySelector('.data3').value,
		data4 : document.querySelector('.data4').value,
		data5 : document.querySelector('.data5').value,
		data6 : document.querySelector('input[name="data6"]:checked').value,
		data7 : document.querySelector('.data7').checked,
		data8 : document.querySelector('.data8').value,
		data9 : document.querySelector('.data9').value
	}
	console.log(info);
	
	$.ajax({
		url : "/jspweb/과제2",
		method : "post",
		data : info,
		success : function(result){
			console.log(result);
			if(result == 'true'){
				alert('*** 학생 등록 성공 ***');
				getData();
			}else{
				alert('*** 학생 등록 실패 ***');
			}
		}
	})
}

getData();
function getData(){
	
	$.ajax({
		url : "/jspweb/과제2",
		method : "get",
		// data : {},
		success : function(result){
			console.log(result);
			let html = `
						<table border="1">
							<tr>
								<th> data1 </th> <th> data2 </th> <th> data3 </th>
								<th> data4 </th> <th> data5 </th> <th> data6 </th>
								<th> data7 </th> <th> data8 </th> <th> data9 </th>
							</tr>
						`
			result.forEach((o,i)=>{
				html += `
						<tr>
							<th> ${o.data1} </th> <th> ${o.data2} </th> <th> ${o.data3} </th>
							<th> ${o.data4} </th> <th> ${o.data5} </th> <th> ${o.data6} </th>
							<th> ${o.data7} </th> <th> ${o.data8} </th> <th> ${o.data9} </th>
						</tr>
						`
			})
				html += `</table>`
				console.log(getData);
			document.querySelector('.과제2_box').innerHTML = html;
		}
	})
	
}











