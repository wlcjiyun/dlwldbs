package 과제.과제4.view;
// * 입출력

import java.util.ArrayList;
import java.util.Scanner;

import 과제.과제4.controller.Mcontroller;
import 과제.과제4.model.Board;

public class Front { // class S
	
	Scanner scanner = new Scanner(System.in);
	Mcontroller mc = new Mcontroller();
	ArrayList<Board> boardList = new ArrayList<>();
	Board board = new Board();
	
	// 1. 메인페이지
	public void index() { // index S
		while(true) { // while S
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
			int ch = scanner.nextInt();
			if(ch==1) { signup(); }
			else if(ch==2) { login(); }
			else if(ch==3) { findId(); }
			else if(ch==4) { findPassword(); }
			else {}
		} // while E
	} // index E
	
	// 2. 회원가입 페이지
	void signup() { // signup S
		System.out.println("아이디 : "); 			String id = scanner.next();
		System.out.println("비밀번호 : "); 		String pwd = scanner.next();
		System.out.println("비밀번호 확인 : "); 	String confirmpwd = scanner.next();
		System.out.println("이름 : "); 			String name = scanner.next();
		System.out.println("전화번호 : "); 		String phone = scanner.next();
		
		int result = mc.signup(id, pwd, confirmpwd, name, phone);
		if( result == 1) {
			System.out.println("[회원가입 실패]");
		}else if( result == 0 ) {
			System.out.println("[회원가입 성공]");
		}
	} // signup E
	
	// 3. 로그인 페이지
	void login() {
		System.out.print("아이디:");	String id = scanner.next();
		System.out.print("비밀번호:");	String pwd = scanner.next();
		
		int result = mc.login(id, pwd);
		if( result >= 0 ) { // 0~숫자 -> 로그인 성공한 회원의 번호
			System.out.println("[알림] 로그인 성공 ");
			System.out.println("--------------------커뮤니티-------------------");
			System.out.println("번호\t조회수\t작성자\t제목");
			while(true) {
				System.out.println("1.글쓰기 2.글보기 3.로그아웃");
				int ch = scanner.nextInt();
				if(ch==1) { write(); }
				else if(ch==2) { show(); } 
				else if(ch==3) { index(); }
				else {}
			}
			
		}else if( result == -1 ) {	// -1 : 비밀번호 틀림 
			System.out.println("[알림] 비밀번호가 다릅니다.");
		}else if( result == -2 ) {	// -2 : 아이디 없다.
			System.out.println("[알림] 없는 회원 입니다.");
		}
	}
	
	// 4. 아이디 찾기 페이지
	void findId() {
		System.out.println("이름 : ");		String name = scanner.next();
		System.out.println("전화번호 : ");		String phone = scanner.next();
		
		String result = mc.findId(name, phone);
		if(result == null) {
			System.out.println("[알림] 일치하는 회원 정보가 없습니다");
		}else {
			System.out.println("[알림] 회원님의 아이디는 : " + result);
		}
		
	}
	
	// 5. 비밀번호 찾기 페이지
	void findPassword() {
		System.out.println("이름 : ");		String name = scanner.next();
		System.out.println("아이디 : ");		String id = scanner.next();

		String result = mc.findId(name, id);
		if(result == null) {
			System.out.println("[알림] 일치하는 회원 정보가 없습니다");
		}else {
			System.out.println("[알림] 회원님의 비밀번호는 : " + result);
		}
	}
	
	// 6. 글쓰기 아앜 짜증나 전혀 모르겠잖아?
	void write() {
		System.out.println("--------------------글 쓰기-------------------");
		System.out.println("제목 : ");		String title = scanner.next();
		System.out.println("내용 : ");		String content = scanner.next();
		
		int result = mc.login(title, content);
		for(int i = 0; i<boardList.size(); i++) {
			System.out.println( i + "\t" + 
					boardList.get(i).view + "\t" + 
					boardList.get(i).writer + "\t" + 
					boardList.get(i).title );
			if(result == 0) {
				System.out.println("[알림] 게시글을 등록하였습니다");
			}else {}
		}
		board.title = title;
		board.content = content;
		boardList.add(board);
		
	}

	// 7. 글보기
	void show() {
		System.out.println("열람할 게시물 번호 : ");
		
	}
	
} // class E
