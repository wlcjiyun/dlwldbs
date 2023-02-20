package Day14;

public class Ex3_477 { // class S
	
									// 예외 던지기
	public static void findClass() throws Exception {
		Class.forName("java.lang.String2"); // 일반예외(실행 전 미리 알려줌)
	}

	public static void main(String[] args) throws Exception{ 
		try {
			findClass();
		} 
		catch (Exception e) {
			
		}
		System.out.println("실행");
	} 
	
	
} // class E

/*
	예외 떠넘기기 
		- 함수 내부에서 예외발생시 함수를 호출했던 곳으로 예외를 떠넘김
			: throws
		- 함수마다 예외처리를 하면 코드가 지저분해짐
			-> 이동 후 한 곳에서 처리

*/