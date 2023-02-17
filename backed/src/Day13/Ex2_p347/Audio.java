package Day13.Ex2_p347;

public class Audio implements RemoteControl{
	
	// 필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
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
		System.out.println("현재 Audio 볼륨 : " + volume);
	}
	
	// p_355 추가 내용
		// 필드 
		private int memoryVolume; // 추가 필드 선언
			// 음소거 하기 전 기본 볼륨 저장하는 변수
	@Override // 디폴트 메소드 오버라이드
	public void setMute(boolean mute) {
		if( mute ) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다");
			// 기존 볼륨 가져오기
			setVolume(this.memoryVolume);
		}
	}
}















