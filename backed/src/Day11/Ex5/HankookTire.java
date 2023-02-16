package Day11.Ex5;

public class HankookTire extends Tire { // 하위클래스
			// 하위클래스 extends 상위클래스명
	@Override
	public void roll() { // 오버라이딩 : 부모클래스의 메소드를 재정의/리모델링
		System.out.println("한국타이어가 굴러갑니다");
	}
	@Override
	public void stop() {
		System.out.println("한국 타이어가 멈춥니다");
	}
}
