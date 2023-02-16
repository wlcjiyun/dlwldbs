package Day04;

import java.util.Scanner;

public class Ex2_예금 { // class S
	public static void main(String[] args) { // main S
		
		Scanner scanner = new Scanner(System.in);
		
		// * 에금액(누적), 계좌번호, 패스워드
		int balance = 0; String account = "123-1234"; short password = 1234;
		
		while( true ) { // while S 무한루프[ 종료조건 : 4 입력시 break; ]
			System.out.println("-----------------------");
			System.out.println("1.예금 2.출금 3.잔액 4.종료 : ");
			System.out.println("-----------------------");
			System.out.println(">> 선택 : ");
			int check = scanner.nextInt();
			
			// 1. 예금
			if( check == 1 ) { // 중첩if문
				System.out.println(">>> 예금할 계좌번호 : ");
				String inaccount = scanner.next();
				
				if( account.equals(inaccount) ) { // 만약에 계좌번호와 입력받은 계좌번호가 같으면
					System.out.println(">>> 예금할 금액 : ");
					balance += scanner.nextInt();
					System.out.println(">>> 예금 후 금액 : " + balance);
				}else {
					System.out.println(">>> 없는 계좌입니다");
				}
			}
			
			// 2. 출금
			else if( check == 2 ) { // else if S
				System.out.println(">>> 출금할 계좌번호 : ");
				String inaccount = scanner.next();
				
				if( account.equals(inaccount) ) { // if 1 S // 만약에 계좌번호와 입력받은 계좌번호가 같으면
					System.out.println(">>> 계좌 비밀번호 : ");
					short inpassword = scanner.nextShort();
					
					if( password == inpassword ) { // if 2 S // 만약에 비밀번호와 입력받은 비밀번호가 같으면
						System.out.println("출금할 금액 : ");
						
						int pay = scanner.nextInt();
						if( balance > pay ) { // if 3 S // 만약에 입력받은 출금액 보다 잔액이 더 크면
							balance -= pay;
							System.out.println(">>> 출금 후 금액 : " + balance);
						}else {
							System.out.println(">>> 잔액부족 : " + balance);
						} // if 3 E
						
					} else {
						System.out.println(">>> 비밀번호가 틀렸습니다");
					} // if 2 E
					
				}else {
					System.out.println(">>> 없는 계좌입니다");
				} // if 1 E
				
			} // else if E
			
			else if( check == 3 ) {System.out.println("예금 잔액 : " + balance);}
			else if( check == 4 ) {System.out.println("종료합니다"); break; }
			else {} 
			
		} // while E
		
	} // main E
} // class E
