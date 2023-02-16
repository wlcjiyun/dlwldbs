package Day02;

import java.util.Scanner; // Scanner 클래스를 사용하기 위한 Scanner 클래스 가져오기

public class Ex2_입력 {
	public static void main(String[] args) {
		
		// 1. 입력
			// scan + 자동완성
			// 객체 생성 : 클래스명 객체명 = new 생성자명(인수);
			// 입력 객체 : 클래스명 객체명 = new 생성자명(System.in); 
				// {} 지역별 1번만 선언
		
		// 1. 입력 객체
		Scanner scanner = new Scanner(System.in);
		
		// 2. 입력 메소드 -> 변수 저장
			// 2-1 문자열 입력받기 함수 -> 띄어쓰기 불가능
			String 문자열1 = scanner.next(); System.out.println(문자열1);	
			
			// 2-2 문자열 입력받기 함수 -> 띄어쓰기 가능
			scanner.nextLine();	// 해결방안
			String 문자열2 = scanner.nextLine();  System.out.println(문자열2);
			
			// 2-3  입력받기 함수
			boolean 논리 = scanner.nextBoolean(); 		
			scanner.next().charAt(0); 	// 한 글자 입력받기 함수 / next() 문자열 중에서 .charAt(0): 첫 글자만 반화
			
			// 2-5 정수형 입력받기
			byte 바이트 = scanner.nextByte();			
			short 쇼트 = scanner.nextShort(); 		
			int 인트 = scanner.nextInt(); 			
			long 롱 = scanner.nextLong(); 
			
			// 2-6 실수형 입력받기
			float 플롯 = scanner.nextFloat(); 		
			double 더블 = scanner.nextDouble(); 	
			
			// 기본자료형 비교	[비교 연산자 가능 == ] 
			int 비밀번호 = 1234; 
				System.out.println( 비밀번호 == 1234); // true
			// 문자열 [Stirng 객체] 비교: [객체는 비교 연산자 불가능 -> 문자열A.equals("문자열")]
			String 아이디 = "qwe";
				System.out.println( 아이디.equals("qwe")); // false
	}
}
