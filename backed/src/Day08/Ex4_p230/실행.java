package Day08.Ex4_p230;

public class 실행 { // class S
	public static void main(String[] args) { // main S
		
		// 1. 외부에서 함수 호출할 때 -> 객체 필요함
		calculator myCalc = new calculator();
		
		// * 2. 객체를 통한 멤버 함수 호출
		// 1번
		myCalc.powerOn(/* 함수가 들어가는 곳 : 공백 */);
	
		// 3. 3번
		int result1 = myCalc.plus( 3 , 5 );
		System.out.println(result1);
		
		// 4. 4번
		int x = 3;
		int y = 5;
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);
		
		// 5. 2번
		myCalc.powerOff();
		
		// 6. 6번
		System.out.println( myCalc.info() );
		
	} // main E
} // class E
