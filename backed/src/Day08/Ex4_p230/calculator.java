package Day08.Ex4_p230;

public class calculator { // class S
	
	//필드
	
	//생성자
	
	//메소드 (p231)
		// 1. 인수X 반환X
		void powerOn() {
			System.out.println("전원을 켭니다");
		}
		
		// 2. 인수X 반환X
		void powerOff() {
			System.out.println("전원을 끕니다");
		}
		
		// 3. 인수 x,y / 반환 int -> x=3 y=5 result=8
		int plus( int x , int y) {
			int result = x+y;
			return result;
		}
		
		// 4. 인수 x,y / 반환 double -> x=3 y=5 result=0.6
		double divide(int x , int y) {
			double result = (double)x / (double)y;
			return result;
		}
		
		// 5. 인수 x,y / 반환 X
		void multiplay(int x , int y) {
			double result = (double)x * (double)y;
			System.out.println(result);
		}
		
		// 6. 인수 X / 반환 O
		String info() {
			return "이젠 계산기";
		}
		
		// 7. 내부에서 함수 호출할 때
		void 함수호출() {
			powerOn(); // 내부에서 함수 호출시 : 함수명();
		}
		
	
	
	
	
	
} // class E

/*
	함수 = 메소드
	
	JS 선언부						JAVA 선언부
	Functin 함수명(인수명){}		리턴타입 함수명(인수1, 인수2){}
	
	JS 호출						JAVA 내부 호출
	함수며(인수1, 인수2)				함수명(인수1, 인수2)
								JAVA 외부 호출 : 객체명 필요함
								객체명.함수명(인수1, 인수2)
								
	1. 인수 X 반환 X
		void 함수명(){} 
	
	2. 인수 O 반환 X
		void 함수명(인수1, 인수2){}
	
	3. 인수 X 반환 O
		반환(리턴)타입 함수명(){return 값;}
	
	4. 인수 O 반환 O
		반환(리턴)타입 함수명(인수1, 인수2){ return 값;}





*/