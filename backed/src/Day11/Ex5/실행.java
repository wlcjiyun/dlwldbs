package Day11.Ex5;

public class 실행 {
	public static void main(String[] args) {
		
		// 1. 자동차 객체 생성
		Car myCar = new Car();
		// 자동차 객체에 아티어 객체 1개 포함
		// 2. 기본 타이어 장착
		myCar.tire = new Tire();
		myCar.run();
		// 3. 한국 타이어 교채
		myCar.tire = new HankookTire();
		myCar.run();
		// 4. 금호 타이어 교채
		myCar.tire = new KumhoTire();
		myCar.run();
	}
}
