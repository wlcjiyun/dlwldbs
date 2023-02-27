package Day19.Ex4;

public class user1Thread extends Thread{
	private Calculator calculator; // 필드
	public user1Thread() { // 생성자
		setName("use1Thread"); // 스레드 이름 변경
	}
	public void setCalculator(Calculator calculator) { // setter
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
