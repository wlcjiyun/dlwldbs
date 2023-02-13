package Day09.Ex10_게시판.view;

import java.util.Scanner;

public class Front {
	
	// 1. 싱글톤 ( 프로그램 내 하나의 객체 -> 공유 메모리 / 효율성, 안정성 )
	private static Front front = new Front();
	private Front() {}
	public static Front getInstance() {
		return front;
	}
	
	// 필드 : 입력객체
	private Scanner scanner = new Scanner(System.in);
	
	// 2. index 함수
	public void index() {
		System.out.println("1.쓰기 : ");
		int ch = scanner.nextInt(); // 로컬(지역)변수
		if(ch==1) {writer_page();}
	}
	
	// 3. 쓰기 페이지 함수
	private void writer_page() {
		
	}
	
	// 4. 출력 페이지 함수
	private void print_page() {
		
	}
}
