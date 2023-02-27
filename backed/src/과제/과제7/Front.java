package 과제.과제7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Front {
	
	private static final Bank Kookmin = null;
	Scanner scanner = new Scanner(System.in);
	Bank bank = new Bank();
	ArrayList< Bank > banks = new ArrayList<>();
	
	public void index() {
		while(true) { // while S
			System.out.println("------------- 계좌 관리 ---------------");
			System.out.println("\t은행명\t계좌번호\t예금액");
			System.out.println("-------------------------------------");
			System.out.println("메뉴 >>> 1.계좌개설 2.입금하기");
			int ch = scanner.nextInt();
			if( ch == 1 ) { account_creation(); } 	// 1번 입력시 계좌생성 페이지
			else if( ch == 2 ) { deposit(); } 		// 2번 입력시 입금 페이지
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
			System.out.println("예금주 : "); 		String name = scanner.next();
			System.out.println("계좌 비밀번호 : "); String password = scanner.next();

			String account = Shinhan.bankcode; // 은행코드 03

			Random random = new Random();
			int ran = random.nextInt(100)+1; 			// 1~99 사이의 난수 
			if( ran < 10 ) { account += "-0"+ran+"-"; } // 은행코드 + 난수2자리 
			else {account += "-"+ran+"-";}

			ran = random.nextInt(100)+1; 			// 1~99 사이의 난수 
			if( ran < 10 ) { account += "0"+ran; } 	// 은행코드 + 난수2자리 
			else { account += ran;}

			Shinhan shinhan = new Shinhan(account, password, name, 0 );
			System.out.println("*** 신한은행 계좌 만들어주셔서 감사합니다 ***");
			banks.add(shinhan);
			
			System.out.println("계좌주 : " + name);
			System.out.println("계좌번호 : " + account);
			System.out.println("은행 : 신한은행");
			
		}
		else if( ch2 == 2 ) {
			System.out.println("*** 국민은행 계좌 개설하기 ***");
			System.out.println("예금주 : "); 		String name = scanner.next();
			System.out.println("계좌 비밀번호 : "); String password = scanner.next();

			String account = Kookmin.bankcode; // 은행코드 04

			Random random = new Random();
			int ran = random.nextInt(100)+1; 			// 1~99 사이의 난수 
			if( ran < 10 ) { account += "-0"+ran+"-"; } // 은행코드 + 난수2자리 
			else {account += "-"+ran+"-";}

			ran = random.nextInt(100)+1; 			// 1~99 사이의 난수 
			if( ran < 10 ) { account += "0"+ran; } 	// 은행코드 + 난수2자리 
			else { account += ran;}

			Kookmin kookmin = new Kookmin(account, password, name, 0 );
			System.out.println("*** 국민은행 계좌 만들어주셔서 감사합니다 ***");
			banks.add(kookmin);
			
			System.out.println("계좌주 : " + name);
			System.out.println("계좌번호 : " + account);
			System.out.println("은행 : 국민은행");
		}
		else if( ch2 == 3 ) {
			System.out.println("*** 우리은행 계좌 개설하기 ***");
			System.out.println("예금주 : "); 		String name = scanner.next();
			System.out.println("계좌 비밀번호 : "); String password = scanner.next();

			String account = Woori.bankcode; // 은행코드 05

			Random random = new Random();
			int ran = random.nextInt(100)+1; 			// 1~99 사이의 난수 
			if( ran < 10 ) { account += "-0"+ran+"-"; } // 은행코드 + 난수2자리 
			else {account += "-"+ran+"-";}

			ran = random.nextInt(100)+1; 			// 1~99 사이의 난수 
			if( ran < 10 ) { account += "0"+ran; } 	// 은행코드 + 난수2자리 
			else { account += ran;}

			Woori woori = new Woori(account, password, name, 0 );
			System.out.println("*** 우리은행 계좌 만들어주셔서 감사합니다 ***");
			banks.add(woori);
			
			System.out.println("계좌주 : " + name);
			System.out.println("계좌번호 : " + account);
			System.out.println("은행 : 우리은행");
		}
		else{}
	}
	
	// 입금 페이지
	public void deposit() {
		System.out.println("------------- 계좌 입금 ---------------");
		System.out.println("입금할 게좌번호 : ");	String account = scanner.next();
		System.out.println("예금액 : ");			int balance = scanner.nextInt();
		
		String inaccount = scanner.next();
		
		if( account.equals(inaccount) ) { 
			balance += scanner.nextInt();
			System.out.println("*** 잔액 : " + balance + "***");
		}else {
			System.out.println("[알림] 옳지 않은 계좌번호 입니다");
		}
		
	}
}
