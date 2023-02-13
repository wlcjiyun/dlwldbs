package Day09.Ex7_p252;
/*
	final 필드 : 최종적
		- 수정 불가 만들기
		- 무조건 초기화가 있어야 함
		- 필드에 직접 초기화를 하거나 생성자를 이용한 초기화를 한다
		JS : const
		JAVA : static final 필드 : 상수(고정된 수)
			- 수정 불가
			- 공통 메모리 사용
			- 상수 : 관례적으로 대문자를 사용함


*/
public class Korean { // class S
	
	// 1. final : 수정불가, 메모리 공유X
	final String nation = "대한민국";
	final String ssn;
	// final : 무조건 초기화(값)이 존재해야 함
	
	String name;

	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	// 2. static final : 수정불가, 메모리 공유O
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
} // class E
