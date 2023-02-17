package Day13.Ex1_p342;


// class 키워드 : 클래스 선언
	// -> extends(연장하다) : 상속
// interface 키원드 : 인터페이스 선언 
	// -> implement(구현하다)
public interface RemoteControl { // in S
	/*
		인터페이스 멤버 
			1. 상수 필드 ( 변수 X ) 
			2. 생성자 X  ( new X : 스스로 객체를 못 만든다 )
			3. 메소드 
 				- ! 추상(abstract) 메소드 
				- 디폴트 메소드
	 			- 정적 메소드
	 */
	
	// * 추상 메소드 : 선언부만 작성함 / 구현부 { } 작성 안 함
	public void turnOn();
	
	
} // in E
