package Day19.Ex4;

public class 실행 {
	public static void main(String[] args) {
		
		// 1. 계산기 객체 생성
		Calculator calculator = new Calculator();
		
		// 2. 유저1 객체 생성
		user1Thread user1Thread = new user1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();
		
		// 2. 유저2 객체 생성
		user2Thread user2Thread = new user2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();
		
	}
}