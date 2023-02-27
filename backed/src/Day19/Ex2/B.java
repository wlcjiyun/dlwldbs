package Day19.Ex2;

public class B implements Runnable{
	@Override
	public void run() {
		while( true ) {
			System.out.println( "4.B스레드 실행중" );
			try{ Thread.sleep(1000); }
			catch (Exception e) {	}
		}
	}
}
