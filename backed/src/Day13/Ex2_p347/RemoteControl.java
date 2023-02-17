package Day13.Ex2_p347;

	// 인터페이스는 변수를 못 씀
public interface RemoteControl {
	// 상수 필드
		// new 연산자(생성자)가 X --> 객체 X --> 인스턴스멤버 X --> static 멤버만 가능
		// 상수 : public static final	// 고정된 값 O -> 초기값 필수 : 변수 선언시 값 대입
		// 인터페이스에서는 생략
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; // 자동으로 public static final 
	
	// 추상 메소드
		// 리턴타입, 메소드명, 매개변수만 선언
		// {} 선언 X
		// public abstract( 생략 가능 --> 생략시 자동으로 선언됨 )
		// 해당 클래스들이 implement 했을 때 -> 오버라이딩 필수
	
	// 1. 
	public abstract void turnOn();
	void turnOff();
	void setVolume( int volume );
	
	// 디폴트 메소드
		// 클래스에서 사용하는 메소드 동일
		// 선언부 앞에 default
	default void setMute( boolean mute ) {
		if( mute ) {
			System.out.println("무음 처리합니다");
			setVolume(0); // 최소 볼륨
		}else {
			System.out.println("무음 해제합니다");
		}
	}
	
	// 정적 메소드
		// 구현 객체가 필요 없다.. implement 없이 가능함
		// static 선언
	// 3.
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
