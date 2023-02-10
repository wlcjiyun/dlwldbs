package Day08.Ex1_p220;

public class Korean {
	// 필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자	
	// 1. 빈생성자
	public Korean() {}
	
	public Korean(String n , String s) {
		name = n;
		ssn =s;
		// 이름이 다르기에 this X
	}
	
	// 메소드
	@Override
	public String toString() {
		return "Korean [nation=" + nation + ", name=" + name + ", ssn=" + ssn + "]";
	}
}
