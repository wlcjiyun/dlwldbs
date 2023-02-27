package Day19.Ex2;

public class 실행 {
	public static void main(String[] args) {

		A a = new A();
		a.start();
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				while( true ) {
					System.out.println( "3.익명스레드1 실행중" );
					try{ Thread.sleep(1000); }
					catch (Exception e) {	}
				}
			}
		};
		thread.start();

		B b = new B();
		Thread thread2 = new Thread(b);
		thread2.start();
		
		Thread thread3 = new Thread( new Runnable() {
			@Override
			public void run() {
				while( true ) {
					System.out.println( "5.익명스레드2 실행중" );
					try{ Thread.sleep(1000); }
					catch (Exception e) {	}
				}
			}
		});
		thread3.start();
		
		while( true ) {
			System.out.println( "1.main스레드 실행중" );
			try{ Thread.sleep(1000); }
			catch (Exception e) {	}
		}
	}
}
