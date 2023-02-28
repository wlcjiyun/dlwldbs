package Day20.gallery.view;

import java.util.Scanner;

import Day20.gallery.controller.Mcontroller;

public class Indexview {
	// 1. 싱글톤
	private static Indexview Indexview = new Indexview();
	private Indexview() {}
	public static Indexview getInstance() {return Indexview;}
	
	Scanner scanner = new Scanner(System.in);
	
	// 1. 메인페이지
	public void index() {
		while(true) {
			System.out.println("----------------Ezen gallery----------------");
			System.out.println("메뉴 >>> 1.회원가입 2.로그인");
			try {
				int ch = scanner.nextInt();
				if(ch==1) {signup();}
				else if(ch==2) {login();}
			}
			catch (Exception e) {
				System.err.println("[알림] >>> 잘못된 입력 입니다");
				scanner = new Scanner(System.in);
			}
		}
	}
	
	// 2. 회원가입
	public void signup() throws Exception{ // 만일 해당 메소드에서 오류 발생시 해당 메소드를 호출했던 곳으로 이동
		System.out.println("----------------회원가입----------------");
		System.out.println("아이디 : ");		String mid = scanner.next();
		System.out.println("비밀번호 : ");		String mpw = scanner.next();
		System.out.println("이름 : ");		String mname = scanner.next();
		System.out.println("전화번호 : ");		String mphone = scanner.next();
		
		int result = Mcontroller.getInstance().signup(mid, mpw, mname, mphone);
		if(result == 1) {System.out.println("[성공] >>> 회원가입에 성공하였습니다 :)");}
		else if(result == 2) {System.out.println("[실패] >>> 이미 사용 중인 아이디 입니다");}
		else if(result == 3) {System.out.println("[실패] >>> 시스템 오류 : 관리자에게 문의하세요");}
	}
	
	// 3. 로그인
	public void login() throws Exception{ // 만일 해당 메소드에서 오류 발생시 해당 메소드를 호출했던 곳으로 이동
		System.out.println("----------------로그인----------------");
		System.out.println("아이디 : ");		String mid = scanner.next();
		System.out.println("비밀번호 : ");		String mpw = scanner.next();
		
		boolean result = Mcontroller.getInstance().login(mid, mpw);
		if(result == true) {System.out.println("[성공] >>> 로그인에 성공하였습니다 :)");}
		else if(result == false) {System.out.println("[실패] >>> 옳지 않은 아이디 또는 비밀번호 입니다");}
		else if(result == false) {System.out.println("[실패] >>> 시스템 오류 : 관리자에게 문의하세요");}
	}
		
}
