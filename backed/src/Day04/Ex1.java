package Day04;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while( true ) {
			// 출력
			System.out.println("가위(0) 바위(1) 보(2) 종료(3) : ");
			// 입력
			int pwin = 0; int cwin = 0; int play = 0;
				// while문 안에서 선언된 변수는 반복문 돌릴때마다 초기화 ==> 누적X
			// 저장
			Byte player = scanner.nextByte(); // 입력받은 데이터 Int형으로 가져오기
			System.out.println(player);
			// 제어문
			if( player == 3) {
				System.out.println("종료"); 
				break;
			}
			// 난수
			Random random = new Random();
			int com = random.nextInt(3);
			System.out.println(com);
			// 7. 이겼을 때
			if((player==0 && com==2)||(player==1 && com==0)||(player==2 && com==1)) {
				System.out.println("player 승리");
			}
			else if( player == com ) {
				System.out.println(">>> draw");
			}
			else{System.out.println("com 승리");}
			
			player++;
			
		}
	}
}
