package 과제.과제5.view;

import java.util.Scanner;

import 과제.과제5.controller.Mcontroller;

public class Front {
	Scanner scanner = new Scanner(System.in);
	Mcontroller mc = new Mcontroller();
	
	public void index() {
		while( true ) { // while S
			System.out.println("1.회원가입 2.로그인");
			int check = scanner.nextInt();
			if( check == 1 ) { signup_page(); }
			else if( check == 2 ) {}
			else {}
		} // while E
	}
	
	// 회원가입
	public void signup_page() {
		System.out.println("아이디 : ");		String id = scanner.next();
		System.out.println("비밀번호 : ");	String pwd = scanner.next();
		System.out.println("이름 : ");		String name = scanner.next();
		
		int result = mc.signup( id, pwd, name );
		if( result == 1 ) { System.out.println("회원가입이 되었습니다"); }
	}
	
	// 로그인
	public void login_page() {
		System.out.println("아이디 : ");		String id = scanner.next();
		System.out.println("비밀번호 : ");	String pwd = scanner.next();
		
		int result = mc.login(id,pwd);
		if( result >= 0 ) {
			System.out.println("로그인 되었습니다");
			System.out.println("번호\t제품\t작성자");
			while( true ) {
				System.out.println("1.제품등록 2.제품보기");
				int ch1 = scanner.nextInt();
				if( ch1 == 1 ) { }
				else if( ch1 == 2) {}
				else {}
			}
		}
	}
}
