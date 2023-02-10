package 과제.과제4.view;
// * 입출력

import java.util.Scanner;

import 과제.과제4.controller.Mcontroller;
import 과제.과제4.model.Member;

public class Front { // class S
	
	Scanner scanner = new Scanner(System.in);
	
	// 1. 메인페이지
	public void index() { // index S
		while(true) { // while S
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
			int ch = scanner.nextInt();
			if(ch==1) { signup(); }
			else if(ch==2) { iogin(); }
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
		Mcontroller mc = new Mcontroller();
		int result = mc.signup(id, pwd, confirmpwd, name, phone);
		if( result == 1) {
			System.out.println("[회원가입 실패]");
		}else if( result == 0 ) {
			System.out.println("[회원가입 성공]");
		}
	} // signup E
	
	// 3. 로그인 페이지
	void iogin() {
		System.out.println("아이디 : "); 			String id = scanner.next();
		System.out.println("비밀번호 : "); 		String pwd = scanner.next();
		
		Mcontroller mc = new Mcontroller();
		int result = mc.login(id,pwd);
		if( result >= 0 ) { // 0~숫자 -> 로그인 성공한 회원 번호
			System.out.println("[알림] 로그인 성공");
			// 게시판으로 이동
		}else if( result == -1 ) {
			System.out.println("[알림] 비밀번호가 다릅니다");
		}else if( result == -2 ) {
			System.out.println("[알림] 없는 회원 입니다");
		}
	}
	
	// 4. 아이디 찾기 페이지
	void findId() {
		System.out.println("이름 : ");		String name = scanner.next();
		System.out.println("전화번호 : ");		String phone = scanner.next();
		Mcontroller mc = new Mcontroller();
		int result = mc.findId(name,phone);
		if( result >= 0) {
			System.out.println("[아이디 찾기 성공]");
		}else if( result == -3 ) {
			System.out.println("[알림] 이름 혹은 번호가 다릅니다");
		}
	}
	
	// 5. 비밀번호 찾기 페이지
	void findPassword() {
		System.out.println("이름 : ");		String name = scanner.next();
		System.out.println("아이디 : ");		String id = scanner.next();
		Mcontroller mc = new Mcontroller();
		int result = mc.findId(name,id);
		if( result >= 0) {
			System.out.println("[비밀번호 찾기 성공]");
		}else if( result == -4 ) {
			System.out.println("[알림] 이름 혹은 아이디가 다릅니다");
		}
	}
	
} // class E
