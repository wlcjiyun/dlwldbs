package Day13.Ex1_p342;

public class Televsion implements RemoteControl{ // class S
	// class implements 인터페이스명 : 구현하다
		// 인터페이스 안에 추상된 메소드를 해당 클래스가 구현하겠다는 뜻
		// 필수 작업 : !! 추상메소드 구현 @Override
	
	// 1. 인터페이스에 추상메소드를 구현
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	
} // class E
