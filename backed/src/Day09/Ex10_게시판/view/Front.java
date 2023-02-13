package Day09.Ex10_게시판.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Day09.Ex10_게시판.controller.BController;
import Day09.Ex10_게시판.model.Board;

public class Front {
	
	// 1. 싱글톤 객체 [ 1. 프로그램내 하나의 객체 - 공유 메모리 ]
		private static Front front = new Front();
		private Front() {}
		public static Front getInstance() {
			return front;
		}
		
		// 필드  : 입력 객체 [ 인스턴스 멤버 ]  
		private Scanner scanner = new Scanner(System.in);
		
		// 2. index 함수 
		public void index() {
			while( true ) {
				print_page(); // 출력함수 
				System.out.print(" 1.쓰기 2.게시물보기 ");
				int ch = scanner.nextInt(); // 지역변수 
				if( ch == 1 ) { write_page(); } // 쓰기함수
				if( ch == 2 ) { view_page(); } // 상세 페이지 보기 함수
			}
		}
		
		// 3. 쓰기 페이지 함수 
		private void write_page() {
			
			// 1. 입력받기 
			System.out.println(" --------- 글 쓰기 페이지 ------------");
			System.out.print("제목 : ");		String title = scanner.next();
			System.out.print("내용 : ");		String content = scanner.next();
			System.out.print("작성자 : ");	String writer = scanner.next();
			System.out.print("비밀번호 : ");	String password = scanner.next();
			
			Date date = new Date();	// 현재 날짜/시간 생성 객체
			int view = 0;	// 조회수는 0부터 시작 
			
			// 2. 컨트롤에게 입력받은 값 전달 후 결과를 result 에 저장 
			boolean result = 
			BController.getInstance().write(title, content, 
											writer, password, 
											date, view);
			// 3. 결과에 따른 출력 
			if( result ) {
				System.out.println(" [알림] 글쓰기 성공 ");
			}else {
				System.out.println(" [알림] 글쓰기 실패 ");
			}
		}
		
		// 4. 출력 페이지 함수 
		private void print_page() {
			// 1. 싱글톤 객체를 통해 boardDb 리스트 객체 반환 받기
			ArrayList<Board> result = BController.getInstance().print();
			// 2. 반환된 리스트 객체 수 만큼 반복
			System.out.println("번호\t제목\t작성자\t조회수\t작성일");
			for( int i = 0 ; i< result.size() ; i++ ) {
				// 3. 리스트 내 i번 째 객체물 출력
				System.out.println( i+"\t" + result.get(i).toString() );
			}
		}
		
		// 5. 상세 페이지 함수
		private void view_page(){
			
			// 1. 입력받기
			System.out.println("게시물 번호 : "); int bno = scanner.nextInt();
			// 2. 입력받은 게시물번호의 게시물 정보를 컨트롤에게 요청 [ bno 넘겨주고 ]
			Board result = BController.getInstance().view(bno);
				// BController.getInstance() -> bc -> new BController(); 
				// new BController().view(bno) -> bno번 인덱스의 board 객체
				// board 객체 -> result 저장
			
			System.out.println("----------------게시물("+bno+")---------------");
			System.out.println("제목 : " + result.getTitle());
			System.out.println("작성자 : " + result.getWriter());
			System.out.println("내용 : " + result.getContent());
			System.out.println("작성일 : " + result.getDate());
			System.out.println("1.이전 2.삭제 3.수정");
			
			// 뒤로가기
			int ch2 = scanner.nextInt();
			if(ch2==1) {return;}
		}
		
}
