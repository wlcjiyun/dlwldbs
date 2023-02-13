package Day09.Ex9;
/*
	싱글톤 : 프로그램 내 하나의 객체를 갖는 패턴
		1. 클래스 내부에 객체 생성
		2. 생성자 private
		3. 내부 객체를 반환해주는 함수 생성 : getInstance()
		* 함수 호출시 객체가 필요한데 외부에서 객체 금지 -> static 사용
		* 
*/
public class Member {
	
	//1. 
	private static Member mem = new Member();
	// 2. private
	// 3. 생성자도 private으로 막는다
	private Member() {}
	// 4. 
	public static Member getInstance() {
		return mem;
	}
	// 5. static
	
}
