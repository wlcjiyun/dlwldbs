package Day09.Ex4_p239;

/*
	오버라이딩 : 이미 존재하는 메소드를 재정의(리모델링)한다
	
		VS
		
	오버로딩 : 이름은 같되 매개변수의 타입, 개수, 순서가 다르게 메소드를 여러 개 선언
		- 생성자와 메소드에서 사용됨
*/
public class Calcuator { // class S
	
	// 1. 정사각형 넓이 구하기
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 2. 직사각형 넓이 구하기					오버로딩
	double areaRectangle(double width , double height) {
		return width * height;
	}
	
} // class E
