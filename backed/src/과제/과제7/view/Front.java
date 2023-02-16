package 과제.과제7.view;

import java.util.Scanner;

public class Front { // class S
	
	Scanner scanner = new Scanner(System.in);
	
	// 계좌번호[ 은행코드-난수2자리-난수2자리 ] , 계좌비밀번호[4자리] , 계좌주 , 잔금 [초기 0원 ]
	int num = 0; String password = ""; String name =""; int balance = 0;
	
	// main 페이지
	public void index() {
		while(true) { // while S
			System.out.println("------------- 계좌 관리 ---------------");
			System.out.println("\t은행명\t계좌번호\t예금액");
			System.out.println("-------------------------------------");
			System.out.println("메뉴> 1.계좌생성 2.입금");
			System.out.println(">> 선택 : ");
			int check = scanner.nextInt();
			if( check == 1 ) { make_page(); }
			else if( check == 2 ) { deposit_page(); }
			else {}
			
		} // while E
	}
	
	// 계좌 생성 페이지
	public void make_page() {
		while(true) {
			System.out.println("------------- 계좌 생성 ---------------");
			System.out.println("1.신한은행 2.국민은행 3.우리은행");
			System.out.println(">> 선택 : ");
			int check2 = scanner.nextInt();
			if(check2 == 1) {
				System.out.println("계좌주 : ");			String name = scanner.next();
				System.out.println("계좌 비밀번호 : ");	String password = scanner.next();
				System.out.println("계좌번호 : " + num);	int num = scanner.nextInt();
				System.out.println("잔금 : " + balance);	int balance = scanner.nextInt();
			} 
		}
	}
	
	// 입금 페이지
	public void deposit_page() {
		
	}
	
} // class E
