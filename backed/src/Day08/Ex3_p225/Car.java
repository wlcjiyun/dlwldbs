package Day08.Ex3_p225;

public class Car {
	
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
		// 오버로딩 : 매개변수의 타입, 개수, 순서가 다르게 여러 개 생성자 선언
		// 오른쪽 클릭 -> source -> Generate Constructor using Fields -> 필드 선택
		// 깡통, 풀, 투스트링
	
		// 1생성자 : 빈생성자
		public Car() {} 
		
		// 2생성자 : 1개 매개변수
		public Car(String model) {  
			super();
			this.model = model;
		}
		
		// 3생성자 : 2개 매개변수
		public Car(String model, String color) { 
			super();
			this.model = model;
			this.color = color;
		}
		
		// 4생성자 : 3개 매개변수
		public Car(String model, String color, int maxSpeed) { 
			super();
			this.model = model;
			this.color = color;
			// this(model,color);
			this.maxSpeed = maxSpeed;
		}
		// 5생성자 : 모든 필드를 받는 매개변수
		public Car(String company, String model, String color, int maxSpeed) {
			super();
			this.company = company;
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}

	// 메소드
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}

}
