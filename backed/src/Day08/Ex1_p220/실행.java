package Day08.Ex1_p220;

public class 실행 { // class S
	public static void main(String[] args) { // main S
		
		// 1. 객체 생성 (빈생성자)
		Korean k1 = new Korean();
			// 1-1. 객체 정보[ 객체명.toString() ] 출력
		System.out.println(k1.toString());	
			// 1-2. 객체 필드 호출[ 객체명.필드명 / .(도트)접근연산자 ]
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		// 2. 객체 생성
		Korean k2 = new Korean("박자바", "031219-0591651");
		System.out.println(k2.toString());
		
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		
	} // main E
} // class E
