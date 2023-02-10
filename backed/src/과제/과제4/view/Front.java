package 과제.과제4.view;
// * 입출력

import java.util.Scanner;

import 과제.과제4.controller.Mcontroller;

public class Front {
	
	Scanner scanner = new Scanner(System.in);
	
	// 1. 메인페이지
	public void index() {
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
			int ch = scanner.nextInt();
			if(ch==1) { signup(); }
			else if(ch==2) { iogin(); }
			else if(ch==3) { findId(); }
			else if(ch==4) { findPassword(); }
			else {}
		}
	}
	// 2. 회원가입 페이지
	void signup() {
		System.out.println("아이디 : "); 			String id = scanner.next();
		System.out.println("비밀번호 : "); 		String pwd = scanner.next();
		System.out.println("비밀번호 확인 : "); 	String confirmpwd = scanner.next();
		System.out.println("이름 : "); 			String name = scanner.next();
		System.out.println("전화번호 : "); 		String phone = scanner.next();
		Mcontroller mc = new Mcontroller();
		mc.signup(id, pwd, confirmpwd, name, phone);
	}
	// 3. 로그인 페이지
	void iogin() {}
	// 4. 아이디 찾기 페이지
	void findId() {}
	// 5. 비밀번호 찾기 페이지
	void findPassword() {}
}
