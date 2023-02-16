package 과제.과제7;

import java.util.Scanner;

public class Front {
	
	Scanner scanner = new Scanner(System.in);
	Bank bank = new Bank();
	
	public void index() {
		while(true) { // while S
			System.out.println("------------- 계좌 관리 ---------------");
			System.out.println("\t은행명\t계좌번호\t예금액");
			System.out.println("-------------------------------------");
			System.out.println("메뉴 >>> 1.계좌개설 2.입금하기");
			int ch = scanner.nextInt();
			if( ch == 1 ) { account_creation(); } // 1번 입력시 계좌생성 페이지
			else if( ch == 2 ) { deposit(); } // 2번 입력시 입금 페이지
			else {} // 그 외
		} // while E
	}
	
	// 계좌생성 페이지
	public void account_creation() {
		System.out.println("------------- 계좌 개설 ---------------");
		System.out.println("만드실 계좌의 은행을 선택하세요.");
		System.out.println("1.신한은행 2.국민은행 3.우리은행 :");
		int ch2 = scanner.nextInt();
		if( ch2 == 1 ) { // 신한은행
			System.out.println("*** 신한은행 계좌 개설하기 ***");
			System.out.println("예금주 : ");					String name = scanner.next();
			System.out.println("계좌 비밀번호 : ");			String password = scanner.next();
			System.out.println("계좌번호 : "); 				String account = scanner.next();
			System.out.println(balance); 					int balance = scanner.nextInt();
		}
		else if( ch2 == 2 ) {
			System.out.println("*** 국민은행 계좌 개설하기 ***");
		}
		else if( ch2 == 3 ) {
			System.out.println("*** 우리은행 계좌 개설하기 ***");
		}
		else{}
	}
	
	// 입금 페이지
	public void deposit() {
		
	}
}
