package Day09.Ex6;

import Day08.Ex4_p230.calculator;

public class 실행 {
	public static void main(String[] args) {
		
		// 1. 인스턴스 멤버 호출 : ! 객체가 필요함
			// 객체 -> 인스턴스 멤버 호출
		Calcurtor myCal = new Calcurtor();
		System.out.println(myCal.no);
		myCal.no = 10;
		System.out.println(myCal.getNo()); 
		
		// 2. 정적멤버 호출
		System.out.println(Calcurtor.pi);
		double result1 = 10*10*Calcurtor.pi;
		Calcurtor.puls(10, 5);
		Calcurtor.minus(10, 5);
		
		// 3. 
		System.out.println(Calcurtor.info);
	}
}
