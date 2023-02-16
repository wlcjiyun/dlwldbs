package Day07.Ex4;

import java.util.Scanner;

public class Ex4_회원시스템_객체 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Member[] memberList = new Member[3]; // Member 객체를 3개 저장할 수 있는 배열 선언
											// Member객체 Stirng 2개 저장할 수 있는 
		
		while(true) {
			
			// 출력
			System.out.println("번호\t회원명\t전화번호");
			for(int i = 0; i<memberList.length; i++) {
				if(memberList[i] != null) {
					System.out.println(i + "\t" + memberList[i].name + "\t" +memberList[i].phone);
				}
			}
			
			
			System.out.println("1.회원등록 2.회원삭제 : ");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("회원명 : ");	String inputname = scanner.next();
				System.out.println("전화번호 : "); String inputphone = scanner.next();
				
				for(int i = 0; i<memberList.length; i++) {
					if(memberList[i] == null) {
						
						// X <-- name + "," + phone;
						// O <-- 객체 만들기
						Member member = new Member(); //1. 객체 생성
						member.name = inputname;	// 2. 객체에 입력받은 값을 해당 필드에 대입
						member.phone = inputphone;	// 3. 객체에 입력받은 값을 해당 필드에 대입
						memberList[i] = member;	// 4. 객체를 배열에 저장
						break;
					}
				}
				
			}
			else if(ch==2) {
				System.out.println("삭제할 번호/인덱스 : ");
				int no = scanner.nextInt();
				
				// 3. 배열 내 데이터 삭제 --> splice 기능 --> 배열 내 null 만들기
				memberList[no] = null;
				// * 삭제 후 빈자리 채우기 --> 삭제된 인덱스 뒤로 한 칸씩 당기기
				for(int i = 0; i<memberList.length; i++) {
					if(i+1 == memberList.length) { // 마지막 인덱스이면
						memberList[i] = null; break; // 마지막 인덱스에 null 넣고 나가기
					}
					memberList[i] = memberList[i+1];
					if(memberList[i+1] == null) break; // 다음 인덱스가 null이면 종료
				}
			}
			else {}
		}
		
	}
}
