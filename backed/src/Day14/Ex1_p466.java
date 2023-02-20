package Day14;

public class Ex1_p466 { // class S
	
	// 2. 함수 선언
		// : 접근제한자 키워드 반환타입 함수명(타입 매개변수, ..){return 데이터;}
			// 접근제한자 : public, private, default(생략), protected
			// 키워드(생략) : static(정적), final(오버라이딩 금지)
			// 반환타입 : return 할 데이터의 타입
			// 함수명 : 카멜표기법
			// 매개변수 : 타입에 맞춰 선언
	
	public static void printLength(String data) {
		try { // * 예외가 발생할 것 같은 코드를 try{} 안에 넣기
			int result = data.length();			// 문자열 길이 : 문자열.length();
			System.out.println("문자 수 : " + result);
		}
		catch(NullPointerException e) {
			// * 만약에 try{} 안에서 예외가 발생했을 때 실행되는 catch{} 코드
				// * 만일 try{} 안에서 예외가 발생하지 않으면 catch{} 실행 안됨
				// * e : 예외 객체명(아무거나) 예외 정보가 담겨 있음
			System.out.println( e.getMessage() );
		}
		finally { // * 예외가 있건말건 실행되는 코드
			System.out.println("마무리 실행");
		}
	}
	
	// 1. main 함수 선언 : main 스레드가 포함된 함수
		// 스레드 : 코드를 읽어주는 흐름단위( 단일 스레드 )
	public static void main(String[] args) { // main S
		
		System.out.println("프로그램 시작");
		printLength("This is JAVA");
		printLength(null);					// 실행예외가 발생할 것 같은 코드
											// -> NullPointerException : 데이터가 null이라서 length()
		System.out.println("프로그램 종료");
		
	} // main E
} // class E

/*
	에러 : 컴퓨터 하드웨어의 고장으로 인해 응용 프로그램 실행 오류 발생
	예외 : 에러 이외 예외라는 오류
		* 잘못된 사용, 코딩으로 인해 발생
		* 잘못된 사용 : 사용자가 비정상적인 행동을 했을 때 -> 경험 바탕
			1. 일반 예외 : 컴파일 전에 발생할 수 있는 에외 검사 [ *스트림(자바 외부) ]
			2. 실행 예외 : 컴파일 후에 발생하는 예외
	
	예외 클래스
		Exception 클래스(슈퍼) : 모든 예외를 받을 수 있는 예외 중 최상위 클래스(부모)
		
	문법	
		try{
			1. 예외가 발생할 것 같은 코드( 경험 )
		}
		catch( 예외 클래스 e ){
			2. try{}에서 예외가 발생하면 실행되는 코드( 예외 발생시 이후 실행 코드 ) 
		}
		finally{	
			3. 예외가 있건말건 실행되는 코드( 생략 가능 ) 
		}
	
*/