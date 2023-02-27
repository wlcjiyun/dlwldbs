package Day19.Ex1_p596;

import java.awt.Toolkit;

public class 실행 {
	public static void main(String[] args) {
		
		System.out.println("-----------1. 싱글스레드 시작----------");
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}
			catch (Exception e) {}
		}
		for( int i = 0 ; i<5 ;i++ ) {
			System.out.println("띵");
			try { Thread.sleep(500); }
			catch (Exception e) {}
		}
		
		System.out.println("-----------2. 멀티스레드 시작----------");
		Thread thread = new Thread( new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for( int i = 0 ; i<5 ; i++ ) {
					toolkit.beep();
					try { Thread.sleep(500); }
					catch (Exception e) {}
				}
			}
		});
		thread.start(); 
		
		for( int i = 0 ; i<5 ;i++ ) { 
			System.out.println("띵");
			try { Thread.sleep(500);} catch (Exception e) {}
		}
		
		System.out.println("-----------3. 멀티스레드 시작----------");
		Sound thread2 = new Sound();
		thread2.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}
			catch (Exception e) {}
		}
		
		System.out.println("-----------4. 멀티스레드 시작----------");
		Runnable runnable = new Sound2();
		Thread thread3 = new Thread(runnable);
		thread3.start();
		
		for( int i = 0 ; i<5 ;i++ ) { 
			System.out.println("띵");
			try { Thread.sleep(500);} catch (Exception e) {}
		}
	}
}
