package Day06;

import java.util.Random;
import java.util.Scanner;

public class Ex5_틱택토 { // class S
	public static void main(String[] args) { // main S
		
		// * 입력객체
		Scanner scanner = new Scanner(System.in);
		
		// 1. 배열 선언 : 자료형타입[] 배열명 = { 데이터1, 데이터2, 데이터3 };
			// * 게임판 9칸 문자열 선언
		String[] 게임판 = {
				"[]", "[]", "[]",
				"[]", "[]", "[]",
				"[]", "[]", "[]"
		};
		
		// * 승리 판단 경과 저장 변수
		// boolean 결과 = false; -> false 결과 판단 없음
		
		game : while( true ) { // while S
			// 2. 배열 내 데이터 호출 / 게임판 출력 ----------------------------
			for(int i = 0; i<게임판.length; i++) {
				System.out.println(게임판[i]);
				if(i % 3 == 2) {System.out.println();} // 3칸 마다 줄바꿈
			}
			// -----------------------------------------------------------
			
			// ** 결과가 존재하면 종료;
			// if( 결과 == true ){ break; }
			
			// 3. 플레이어가 알 두기 -----------------------------------------
			while( true ) { // while S
				System.out.println("위치(0~8) 선택 : ");
				int 위치 = scanner.nextInt();
				
				// 유효성 검사 [ 1.0~8이 아니거나 2.이미 알이 존재한 자리 -> 다시 입력 ]
				if( 위치 < 0 || 위치 > 8 ) {
					System.out.println("[알림] 허용 범위 내 입력해 주세요");
					continue; // 가장 가까운 반복문으로 이동
				}
				게임판[위치] = "[0]"; // * 유효성 검사 통과 후 정상적으로 알 두기
				break;
			} // while E
			// -----------------------------------------------------------
			
			// ** 결과가 존재하면 게임종료;
			// if( 결과 == true ) { break; }
			
			// 5. 플레이어가 알 두기 -----------------------------------------
			
			// -----------------------------------------------------------
			
			// 4. 컴퓨터가 알 두기 -------------------------------------------
			while( true ) { // while S
				Random random = new Random();
				int 위치 = random.nextInt(9);
				if(!게임판[위치].equals("[]")) {continue;}
				게임판[위치] = "[X]"; break;
			} // while E
			// -----------------------------------------------------------
			
			// 5. 승리 판단[ 1.승리 2.패배 3.무승부 ] --------------------------
			// * 가로 승리 : 012, 345, 678
			for(int i = 0; i<=3; i+=3) { // for S
				if(!게임판[i].equals("[]") && 
						게임판[i].equals(게임판[i+1]) && 
						게임판[i].equals(게임판[i+2])) {
					System.out.println("결과 : " + 게임판[i]);
					break game;
				}
			} // for E
			// * 세로 승리 : 036, 147, 258
			for(int i = 0; i<=2; i++) { // for S
				if(!게임판[i].equals("[]") && 
						게임판[i].equals(게임판[i+3]) && 
						게임판[i+3].equals(게임판[i+6])) {
					System.out.println("결과 : " + 게임판[i]);
					break game;
				}
			} // for E
			// * 대각선 승리 : 048, 246
			if(!게임판[0].equals("[]") && 
					게임판[0].equals(게임판[4]) && 
					게임판[4].equals(게임판[8])) {
				System.out.println("결과 : " + 게임판[0]);
				break game;
			}
			if(!게임판[2].equals("[]") && 
					게임판[2].equals(게임판[4]) && 
					게임판[4].equals(게임판[6])) {
				System.out.println("결과 : " + 게임판[2]);
				break game;
			}
			// * 무승부 : 알이 9개이면
			int 빈자리수 = 0;
			for(int i = 0; i<게임판.length; i++) {
				if(게임판[i].equals("[]")) 빈자리수++;
			}
			if(빈자리수 == 0) {System.out.println("[결과] 무승부"); break game;}
			
		} // while E
	} // main E
} // class E
