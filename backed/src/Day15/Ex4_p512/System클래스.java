package Day15.Ex4_p512;

import java.io.IOException;

public class System클래스 {
	public static void main(String[] args) {
		
		System.out.println("출력");	// 콘솔에 문자 추력(검은색)
		System.err.println("에러");	// 콘솔에 에러 출력(붉은색)
		
		
		// 1. p_512
		int value = 100; 	// int에 100 대입 가능 ( 정수니까 )
		// int value2 = "100"; // int에 "100" 대입 불가능 ( 문자니까 )
			// 문자열 --> 기본 타입 변환ㄴ
		int value3 = Integer.parseInt("100"); // "100" --> 100으로 변환
		
		try { // try 안에 예외(에러)가 발생할 것 같으면( * 경험 )
			int value4 = Integer.parseInt("1xx"); // "1xx" 변환X
		}
		catch (Exception e) { // try에서 예외(에러)가 발생했을 때 catch{} 실행
			System.err.println("에러 내용");
			System.err.println( e.getMessage() );
		}
		
		
		// 2. p_514
		
		int speed = 0;
		int keyCode = 0;
		
		while(true) { // while S
			
			if(keyCode != 13 && keyCode != 10) { // 엔터[13,10]가 아니고
				if(keyCode == 49) { // 숫자 1의 코드는 49
					speed++;
				}else if(keyCode == 50) { // 숫자 2의 코드는 50
					speed--;
				}else if(keyCode == 51) { // 숫자 3의 코드는 51
					System.exit(0); // 관례적으로 0 이면 정상 종료 
									// 관례적으로 1 또는 -1이면 비정상 종료
				}
				System.out.println("현재 속도 : " + speed);
				System.out.println("1.중속 2.감속 3.중지 : ");
			} // if E
			
			try {
				keyCode = System.in.read(); // 입력 받아 코드로 반환(아스키코드) -> * 예외처리 필수
			} catch (Exception e) {
				
			} 
			
		} // while E
	}
}