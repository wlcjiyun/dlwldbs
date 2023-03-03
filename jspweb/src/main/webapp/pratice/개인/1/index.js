alert('실행');

function 등록(){
	
	let info = {
		data1 : document.querySelector('.data1').value,
		data2 : document.querySelector('.data2').value,
		data3 : document.querySelector('input[name="data3"]:checked').value,
		data4 : document.querySelector('.data4').value,
		data5 : document.querySelector('.data5').value,
		data6 : document.querySelector('.data6').value,
		data7 : document.querySelector('.data7').value,
	}
	console.log(info);
	
	$.ajax({
		url : "/jspweb/%EC%8B%A4%ED%96%89",
	})
	
}