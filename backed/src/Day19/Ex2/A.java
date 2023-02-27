package Day19.Ex2;

public class A extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("2.A스레드 실행중");
			try {Thread.sleep(1000);}
			catch (Exception e) {}
		}
	}
}	
