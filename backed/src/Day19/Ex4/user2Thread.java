package Day19.Ex4;

public class user2Thread extends Thread{
	private Calculator calculator; // 필드
	public user2Thread() { // 생성자
		setName("use2Thread");
	}
	public void setCalculator(Calculator calculator) { // setter
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
