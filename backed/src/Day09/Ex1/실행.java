package Day09.Ex1;

public class 실행 { // class S
	public static void main(String[] args) { // main S
		
		// 1. 객체 생성
		Member member = new Member();
		// 2. 멤버인 필드는 호출이 가능함
		System.out.println(member.name);
		// 3. 멤버 안에 있는 변수는 호출이 불가능함
		// System.out.println(member.inputName);
		
	} // main E
} // class E
