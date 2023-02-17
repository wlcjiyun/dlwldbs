package Day13.Ex2_p347;

public class Televison implements RemoteControl {

	
	// 필드
	private int volume;
	
	// 1. 클래스명 implements 클래스명
		// 해당 클래스가 인터페이스에서 추상된 메소드를 구현하겠다!
	
	// 2. 필수! : Override
		// 구현한다 했기에 해당 메소드를 오버라이딩 해서 구현하기
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if( volume > RemoteControl.MAX_VOLUME ) { // 만약에 요청한 볼륨이 최대 볼륨보다 크면
			this.volume = RemoteControl.MAX_VOLUME; // 현재 볼륨에 최대 볼륨을 대입
			System.out.println("최대 볼륨보다 더 커질 수 없음. 최대 볼륨으로 설정 : 10");
			
		}else if( volume < RemoteControl.MIN_VOLUME ) { // 만약에 요청한 볼륨이 최소 볼륨보다 크면
			this.volume = RemoteControl.MIN_VOLUME;	// 현재 볼륨에 최소 볼륨을 대입
			System.out.println("최소 볼륨보다 더 커질 수 없음. 최소 볼륨으로 설정 : 0");
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + volume);
	}
	
}
