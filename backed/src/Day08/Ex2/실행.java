// 클래스는 두 가지의 사용 목적이 있다 
	// 2. 실행(main함수)
package Day08.Ex2;

public class 실행 {
	public static void main(String[] args) {
		
		// 1. 클래스를 이용한 갹채 생성
		car mycar = new car(); // 32번지의 메모리 생성
		// 클래스명 변수명 = new 생성자명();
		
		// 2. 객체의 필드 호출 [.접근연산자]
		System.out.println("모델명 : " + mycar.model);
		System.out.println("시동여부 : " + mycar.start);
		System.out.println("현재속도 : " + mycar.speed);
		
		// 3. 
		car yourcar = new car(); // 33번지의 메모리 생성
		yourcar.model = "현대자동차"; // 호출 및 변경
		
		System.out.println("mycar 모델명 : " + mycar.model);
		System.out.println("yourcar 모델명 : " + yourcar.model);
	}
}
