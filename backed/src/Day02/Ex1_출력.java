package Day02;

// 자바는 무조건 class 단위 --> 100% 객체지향
public class Ex1_출력 {
	// main함수 : main 스레드
	public static void main(String[] args) {
		System.out.println();
		// System : 관련 메소드 제공
			// out : 출력
				// println() : 출력 후 자동 줄바꿈 처리 = console.log
				// print() : 출력
				// printf() : 형식 출력
		
		// print()
		System.out.print("print 함수");
		System.out.print("print 함수"); // 줄바꿈 처리 X
		
		// println()
		System.out.println("println 함수1");
		System.out.println("println 함수1"); // 출력 후(\n)
		
		// printf("형식문자열" , 값)
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n " , value);
		System.out.printf("상품의 가격 : %6d원\n " , value);
		System.out.printf("상품의 가격 : %-6d원\n " , value);
		System.out.printf("상품의 가격 : %06d원\n " , value);
		
		double area = 3.14159; 
		System.out.println("파이 : " + area);
		System.out.printf("파이 : %f\n" , area);
		System.out.printf("파이 : %.1f\n" , area);
		System.out.printf("파이 : %3.2f\n" , area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s \n", 1 , name , job);
		/*
			형식 문자열
				%d : 정수 
					%숫자(자릿수)d		오른쪽부터 자릿수 차지 -> * 만일 데이터가 없으면 공백 처리
					%-숫자(자릿수)d	왼쪽부터 자릿수 차지
					%0숫자(자릿수)d	왼쪽부터 자릿수 차지 -> * 만일 데이터가 없으면 0 처리	
				%f : 실수
					%자릿수.소수자릿수f	
				%s : 문자열
		*/
	}
}

/*
 	String : 문자열 클래스
	System : 시스템 클래스
	
	제어문자/이스케이프 문자
		\n : 줄바꿈
		\t : 들여쓰기
		\" : " 출력
		\' : ' 출력

*/