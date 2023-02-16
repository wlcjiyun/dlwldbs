// 2. 클래스 사용 목적 : 설계도

// 클래스 선언 
	// - 첫 글자 영문&대문자
	// - 띄어쓰기X
	// - 숫자 X
	// - 멤버 : 1.필드 2.생성자 3.메소드
package Day08.Ex1_p218;

public class Car { // class S
	
	// 1. 필드
		/* private */ 
		String model;
		String color;
		int maxSpeed;
		
	// 2. 생성자
		// 2-1. 생성자가 1개도 없을 때 기본생성자 -> 1개 이상이면 기본생성자X
		// 2-2. 생성자 이름은 클래스명과 동일해야 한다 != 다르면 함수로 취급함
		// 2-3. 기본생성자(빈깡통), 풀생성자 --> 관례적으로 만들고 시작함
		// 2-4. 오버로딩 : 이름이 동일할 경우 시그니처(매개변수 개수, 타입)를 이용해 식별이 가능함 
				// VS 오버라이딩 : 부모의 메소드를 재정의함(리모델링)
	
		// 1. 빈생성자 = 객체 생성시 매개변수가 없다
		Car() { }
		// 2 . 생성자 = 2개의 매개변수를 받는다
		Car( String model, String color){
			this.model = model; // this.내부필드명 = 매개변수
			this.color = color;
			// this.내부필드명 = 매개변수
		}
		// 3 . 생성자 = 3개의 매개변수를 받는다
		Car( String model, String color, int maxSpeed ){
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
		
	// 3. 메소드
		@Override
		public String toString() {
			return "Car [model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
		}
		
	
} // class E
