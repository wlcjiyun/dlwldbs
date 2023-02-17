package Day13.Ex1_p342;

public class 실행 { // class S
	public static void main(String[] args) { // main S
		
		// 1. 인테페이스를 사용하는 구현 객체
			// 1-1. 인터페이스는 타입이므로 변수처럼 사용 가능
			// 1-2. 참조하지 않고 있는 변수는 null 대입
		RemoteControl contro1 = null;
		// == > String s = null;
			// 1-3. 해당 인터페이스를 implements 선언한 객체의 주소 대입 O
		RemoteControl contro2 = new Televsion();
			// 1-4. 해당 인터페이스를 implements 선언하지 않는 객체의 주소 대입 X
		// RemoteControl control3 = new Audio();
		
		// 2. 구현 객체 만들기
			// 2-1. 인터페이스 변수 선언 [ 스택영역 선언 ]
		RemoteControl rc;
		rc = new Televsion(); 
			// 2-2. 힙 영역에 객체를 선언하고 주소를 반환
			// -> 반환된 주소는'rc'라는 스택 영역의 변수 대입
		
		// 3. 구현 객체를 이용한 메소드 실행
		rc.turnOn();
		
			new Televsion().turnOn();
		
		// 4. 리모콘 교체
		rc = new Audio();
		rc.turnOn();
		
		
	} // main E
} // class E
