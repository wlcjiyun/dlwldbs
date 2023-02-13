package Day09.Ex8.package2;

import Day09.Ex8.package1.A;

public class C {
	// 1. A클래스가 public일 때
	A a; // 가능 : 같은 패키지는 아니지만 import를 해서 가능함
	
	// 2. A클래스가 pulic이 아닐 때 
	// 불가능 : default은 같은 패키지만 가능
	
	// 3. 
	A a1 = new A(true); 		// public이기에 가능
	// A a2 = new A(1); 		// default는 다른 패키지일 경우 불가능
	// A a3 = new A("문자열"); 	// private 불가능
	
	public static void main(String[] args) {
		A a4 = new A(true);
		a4.field1 = 10;
		// a4.field2 = 10; // default 불가능
		// a4.field3 = 10; // private 불가능
	}
	
}
