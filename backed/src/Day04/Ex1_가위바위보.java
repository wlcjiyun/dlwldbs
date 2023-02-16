package Day04;

import java.util.Random;
import java.util.Scanner;

/*
 * 예제에서 중요한 코드
 * 1. 승리자 판단
 * 2. 지역변수 특징 : main함수 안
 * 3. Scanner 클래스, Random 클래스
*/
public class Ex1_가위바위보 { // class S
	public static void main(String[] args) { // main S
		
		// !! 3. 입력 객체 생성
		Scanner scanner = new Scanner(System.in); 
		
		// 8. 변수의 사용범위 : 지역변수 특징 {} 밖으로 못 나감
		int pwin = 0; int cwin = 0; int play = 0;
		// * while문 안에서 선언된 변수는 반복문 돌릴때마다 초기화 ==> 누적X
		
		// 1. 무한루프
		while( true ) { // while S
			
			// 2. 출력 : syso + 자동완성
			System.out.println("가위(0) 바위(1) 보(2) 종료(3) : ");
			
			// 3. 입력[ Scanner 클래스 -> scanner 객체 필요 ]
			
			// 4. 저장[변수]
			Byte player = scanner.nextByte(); // 입력받은 데이터 Int형으로 가져오기
			System.out.println("player가 낸 수 : " + player);
			
			// 5. 제어문[ 흐름 제어 - 경우의 수 ( 0~2 / 3 종료 ) ]
			if( player == 3) {
				System.out.println("종료 플레이수 : " + play); 
				if(pwin > cwin) {System.out.println("player 최종 승리 : " + pwin);}
				else if(pwin < cwin) {System.out.println("com 최종 승리 : " + cwin);}
				else {System.out.println("최종 무승부");}
				break; // 반복문 탈출
			}
			
			// 6. 난수 생성[ 1. Math 클래스 2. Random 클래스 ]
			Random random = new Random();
			int com = random.nextInt(3); // 0~2 사이의 int 난수 생성
			System.out.println(com);
			// 7. 이겼을 때
				/*
				 * 승리 판단
				 * player가 이기는 수 	p:0/c:2 | p:1/c:0 | p:2/c:1
				 * com이 이기는 수		p:0/c:1 | p:1/c:2 | p:2/c:0
				 * 둘이 비기는 수 		p:0/c:0 | p:1/c:1 | p:2/c:2
				*/
			if((player==0 && com==2)||(player==1 && com==0)||(player==2 && com==1)) {
				System.out.println("player 승리"); pwin++;
			}
			else if( player == com ) {
				System.out.println(">>> draw");
			}
			else{System.out.println("com 승리"); cwin++;}
			
			// * 플레이 수 증가
			play++;
			
		} // while E
	} // main E
} // class E
