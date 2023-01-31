board_print();
function board_print(){
	
	let boardList = [
		{ no : 5 , title : '문의합니다' , writer : '유재석' , data : 2023-01-30 , look : 2 , enquiry : '완료' , updata : 2023-01-30 },
		{ no : 4 , title : '문의합니다' , writer : '강호동' , data : 2023-01-28 , look : 3 , enquiry : '완료' , updata : 2023-01-29 },
		{ no : 3 , title : '문의합니다' , writer : '김희철' , data : 2023-01-28 , look : 4 , enquiry : '완료' , updata : 2023-01-28 },
		{ no : 2 , title : '문의합니다' , writer : '신동엽' , data : 2023-01-26 , look : 5 , enquiry : '완료' , updata : 2023-01-27 },
		{ no : 1 , title : '문의합니다' , writer : '서장훈' , data : 2023-01-22 , look : 6 , enquiry : '완료' , updata : 2023-01-24 }
	]
	
	let html = ''
	
	boardList.forEach( (board) => {
		html += `<tr>
					<td>${board.no}</td>
					<td><a href="view.html">${board.title}</a></td>
					<td>${board.writer}</td>
					<td>${board.data}</td>
					<td>${board.look}</td>
					<td>${board.enquiry}</td>
					<td>${board.updata}</td>
				</tr>`
	})
	document.querySelector('.enquiryprint').innerHTML = html;
}