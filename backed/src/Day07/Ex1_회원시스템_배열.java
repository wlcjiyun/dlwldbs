package Day07;

import java.util.Scanner;

public class Ex1_회원시스템_배열 { // class S
	public static void main(String[] args) { // main S
		
		Scanner scanner = new Scanner(System.in);
		
		// 문자열 3개를 저장할 수 있는 배열 선언
		String[] memberList = new String[3]; // 고정길이
		
		while(true) { // while S 무한루프[ 종료조건 없음 ]
			
			// 2. 배열 내 데이터 출력
			System.out.println("번호\t회원명\t전화번호");
			for(int i = 0; i<memberList.length; i++) { // for S
				if(memberList[i] != null) { // null -> 데이터 없다 : split 불가능
					String[] member = memberList[i].split(",");
					System.out.println(i + "\t" + member[0] + "\t" + member[1]);
				}
			} // for E
			
			System.out.println("1.회원등록 2.회원삭제 : ");
			int check = scanner.nextInt();
			if(check == 1) { // if 1 S -> 입력했을 때
				System.out.println("회원명 : "); 		String name = scanner.next();
				System.out.println("전화번호 : "); 	String phone = scanner.next();
				
				// 1. 배열 내 데이터 등록 --> push() 기능 만들기
				for(int i = 0; i<memberList.length; i++) { // for S
					if(memberList[i] == null) { // if S 만약에 i번 째 인덱스가 null이면
						memberList[i] = name + "," + phone; // 이름과 전화번호 1개읨 문자열 합치기
						System.out.println(i + "번 회원이 등록되었습니다. 정보 :" + memberList[i]);
						break; // 저장했으면 반복문 종료
					} // if E
				} // for E
			} // if 1 E
			
			else if(check == 2) { // else if S
				System.out.println("삭제할 번호/인덱스 : ");
				int no = scanner.nextInt();
				// 3. 배열 내 데이터 삭제 : splice 기능 -> 배열 내 null 만들기
				memberList[no] = null;
				// 삭제 후 빈자리 채우기
				for(int i = 0; i<memberList.length; i++) { // for S
					if(i+1 == memberList.length) { // if S 마지막 인덱스이면
						memberList[i] = null; 
						break; // 마지막 인덱스 null 넣고 종료
					} // if E
					memberList[i] = memberList[i=+1];
					if(memberList[i+1] == null) break; // 다음 인덱스가 null이면 종료
				} // for E
			} // else if E
			
			// 그 외
			else {}
			
		} // while E
		
	} // main E
} // class E
