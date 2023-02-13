package Day09.Ex8.package1;

public class B {
	A a; // 가능 : 같은 패키지 이기에
	A a1 = new A(true);
	A a2 = new A(1);
	// A a3 = new A("문자열"); : private 무조건 내부에서만 사용 가능
	
	public static void main(String[] args) {
		A a4 = new A(true);
		a4.field1 = 10;		// 가능	
		a4.field2 = 10;		// 가능
		// a4.field3 = 10; 	// private 필드는 외부에서 사용 불가능
	}
}
