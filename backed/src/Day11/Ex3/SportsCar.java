package Day11.Ex3;

public class SportsCar {
	
	@Override
	public void speedUp() {
		super.speedUp();	// 부모 메소드 호출
	}
	@Override
	public void stop() { // 오류 : stop 메소드가 final이니까 재정의 불가함
		super.stop();
	}
}
