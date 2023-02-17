package Day13.Ex4_p365;

public class 실행 {
	public static void main(String[] args) {
		
		// 1. 구현 객체 만들기
		interfaceCImpl impl = new interfaceCImpl();
		
		// 2. 인터페이스 변수에 구현객체 대입
		interfaceA ia = impl;
		ia.methodA(); // 본인 추상메소드 호출 가능 --> 자식 메소드 호출 불가능
		
		// 2. 
		interfaceB ib = impl;
		ib.methodB();
		
		// 2. 
		interfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
