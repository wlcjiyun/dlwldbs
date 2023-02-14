package 과제.과제4_싱글톤.view;

import java.util.Scanner;

import 과제.과제4_싱글톤.controller.Bcontroller;
import 과제.과제4_싱글톤.controller.Mcontorller;
import 과제.과제4_싱글톤.model.Board;

public class Front {
	
	// 싱글톤 
	private static Front front = new Front();
	private Front() {}
	public static Front getInstance() {return front;}
	
	private Scanner scanner = new Scanner(System.in);
	
	public void index() {
		while(true) { // while S
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 : ");
			int ch = scanner.nextInt();
			if( ch == 1) { signup_page(); }
			else if( ch == 2) { login_page(); }
			else if( ch == 3) { findId_page(); }
			else if( ch == 4) { findPw_page(); }
		} // while E
	}
	
	// 2. 회원가입 페이지
	public void signup_page() {	
		// 2-1. 입력부
		System.out.println("아이디 : ");			String id = scanner.next();
		System.out.println("비밀번호 : ");		String pw = scanner.next();
		System.out.println("비밀번호 확인 : ");	String confirmpw = scanner.next();
		System.out.println("이름 : ");			String name = scanner.next();
		System.out.println("전화번호 : ");		String phone = scanner.next();
		// 2-2. 컨트롤에게 전달 후 결과 받기
		int result = Mcontorller.getInstance().signup( id, pw, confirmpw, name, phone );
		// 2-3. 결과 제어
		if( result == 1 ) { System.out.println("회원가입 실패 / 패스워드가 서로 다릅니다"); }
		else if( result == 0 ) { System.out.println("회원가입 성공"); }
	}
	
	// 3. 로그인 페이지
	public void login_page() {
		// 3-1. 입력부
		System.out.println("아이디 : ");			String id = scanner.next();
		System.out.println("비밀번호 : ");		String pw = scanner.next();
		// 3-2. 컨트롤에게 전달 후 결과 받기
		int result = Mcontorller.getInstance().login( id, pw );
		if( result == -1 ) { System.out.println("로그인 실패"); }
		else if( result == -2 ) { System.out.println("로그인 실패"); }
		else { System.out.println("로그인 성공"); board_page(); }
		// * 로그인 성공시 게시물을 볼 수 있도록 board_page() 함수로 이동(호출)
	}
	
	// 4. 아이디 찾기 페이지
	public void findId_page() {
		// 4-1. 입력부 
		System.out.println("이름 : "); String name = scanner.next();
		System.out.println("전화번호 : "); String phone = scanner.next();
		// 4-2. 컨트롤에게 전달 후 결과 받기
		String result = Mcontorller.getInstance().findId(name, phone);
		if( result == null ) {System.out.println("아이디 찾기 실패");}
		else { System.out.println("회원님의 아이디는" + result + "입니다");}
	}
	
	// 5. 비밀번호 찾기 페이지
	public void findPw_page() {
		// 5-1. 입력부
		System.out.println("아이디 : "); String id = scanner.next();
		System.out.println("전화번호 : "); String phone = scanner.next();
		// 5-2. 컨트롤에게 전달 후 결과 받기
		String result = Mcontorller.getInstance().findPw(id, phone);
		if( result == null ) {System.out.println("비밀번호 찾기 실패");}
		else { System.out.println("회원님의 비밀번호는" + result + "입니다");}
	}
	
	// 6. 로그인 성공시 게시물 출력 페이지
	public void board_page() {
		while(true) { // 무한루프 : 3 입력시 break;
			System.out.println("-------------------커뮤니티------------------");
			System.out.println("번호\t조회수\t작성자\t제목");
			
			// 1. 내가 쓴 글
			//System.out.println( Mcontorller.getInstance().getLogSession().getBoardList() ); 
			
			// 전체 출력부
			int i = 0; // 인덱스 용도
			for( Board b : Bcontroller.getInstance().getList() ) {
				System.out.println( i+"\t"+b.getView()+"\t"+b.getMember().getId()+"\t"+b.getTitle() );
				i++;
			}
			// 메뉴
			System.out.println("1.글쓰기 2.글보기 3.로그아웃");
			int ch2 = scanner.nextInt();
			if(ch2==1) {write_page();}
			else if(ch2==2) {view_page();}
			else if(ch2==3) {Mcontorller.getInstance().logOut(); break;}
		} // while E
	}
	
	// 7. 게시물 쓰기 페이지
	public void write_page() {
		 System.out.println("-------------------게시물 작성------------------");
		 System.out.println("제목 : ");			String title = scanner.next();
		 System.out.println("내용 : ");			String content = scanner.next();
		 
		 boolean result = Bcontroller.getInstance().write(title, content);
		 if( result ) {System.out.println("글쓰기 성공");}
		 else{System.out.println("글쓰기 실패");}
		 
		 
	}
	// 8. 게시물 상세 페이지
	public void view_page() {
		System.out.println("*이동할 게시물 번호 : ");
		int bno = scanner.nextInt();
		Board result = Bcontroller.getInstance().getBoard(bno);
		
		System.out.println("제목 : " + result.getTitle());
		System.out.println("작성자 : " + result.getMember().getId() + "\t 조회수 : " + result.getView());
		System.out.println("내용 : " + result.getContent());
		
		// 메뉴
		System.out.println("1.삭제 2.수정 3.이전 : ");
		int ch3 = scanner.nextInt();
		if(ch3 ==1 ) {delete_page(bno);}
		else if(ch3==2){update_page(bno);}
		else if(ch3==3) {return;}
	}
	
	// 9. 게시물 삭제 페이지
	public void delete_page(int bno) {
		// 9-1. 유효성 검사 : 해당 글의 작성자와 현재 로그인된 회원과 같으면
		if( Bcontroller.getInstance().getBoard(bno).getMember().
			equals( Mcontorller.getInstance().getLogSession() )
				) {
			//System.out.println("*내가 쓴 글");
			Bcontroller.getInstance().delete(bno);
			System.out.println("삭제되었습니다");
			return;
		}
		// 9-2. 
		System.out.println("삭제 권한이 없습니다");
	}
	
	// 10. 게시물 수정 페이지
	public void update_page(int bno) {
		// 10-1. 유효성 검사
		if(Bcontroller.getInstance().getBoard(bno).getMember().
				equals( Mcontorller.getInstance().getLogSession() )
				) {
			System.out.println("새로운 제목 : "); 	String title = scanner.next();
			System.out.println("새로운 내용 : ");	String content = scanner.next();
			Bcontroller.getInstance().update(bno, title, content);
			System.out.println("수정되었습니다");
			return;
		}
		// 10-2.
		System.out.println("수정 권한이 없습니다");
	}
}
