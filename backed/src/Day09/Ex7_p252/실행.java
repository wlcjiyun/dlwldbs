package Day09.Ex7_p252;

public class 실행 { // class S
	public static void main(String[] args) {
		
		// 1. 객체 생성
		Korean k1 = new Korean("123456-1234567", "김자바");
		
		// 2. 객체 멤버 호출
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		// 3. 객체 멤버 변경
			// k1.nation = "미국"; --> final은 변경 불가능함
			// k1.ssn = "987654-9876543"; --> final은 변경 불가능함
		k1.name = "유재석"; // --> final이 아니기에 변경 가능함
		
		// 4. 상수 호출
		System.out.println(Korean.EARTH_RADIUS);
		System.out.println(Korean.EARTH_SURFACE_AREA);
		
	}
}
