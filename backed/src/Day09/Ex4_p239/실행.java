package Day09.Ex4_p239;

public class 실행 { // class S
	public static void main(String[] args) {
		Calcuator myCalcuator = new Calcuator();
		
		double result1 = myCalcuator.areaRectangle(10);
		
		double result2 = myCalcuator.areaRectangle(10,20);
		
		System.out.println(result1);
		System.out.println(result2);
	}
} // class E
