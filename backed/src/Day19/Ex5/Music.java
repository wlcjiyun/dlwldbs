package Day19.Ex5;
					// 상속 받기
public class Music extends Thread{
	
	public boolean stop = false; // 작동 스위치
	
	@Override
	public void run() {
		
		while(stop) { // while S
			System.out.println("---음악 재생 중---");
			try {Thread.sleep(1000);} // 1초간
			catch (Exception e) {}
		} // while E
		
	}
}
