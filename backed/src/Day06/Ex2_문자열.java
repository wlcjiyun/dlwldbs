package Day06;

public class Ex2_문자열 { // class S
	public static void main(String[] args) { // main S
		
		// 1. 자바 문자열을 사용하는 방법
			// 1-1. 배열
			char[] 문자열1 = new char[] {'안','녕'};
			// 1-2. 클래스(객체)
			String 문자열2 = new String("안녕");
			// 1-3. 문자리터럴 " "
			String 문자열3 = "안녕";
			
		// 2. p_156
		String strVar1 = "홍길동"; // 10번지
		String strVar2 = "홍길동"; // 10번지
		
			// 2-1. 주소 비교
			if( strVar1 == strVar2 ) {
				System.out.println("참조(주소) 같음");
			}else {
				System.out.println("참조(주소) 다름");
			}
			// 2-2. 주소 아네 있는 데이터 비교
			if( strVar1.equals(strVar2) ) {
				System.out.println("참조(주소) 내부도 같음");
			}
			
			String strVar3 = new String("홍길동"); // 20번지
			String strVar4 = new String("홍길동"); // 30번지
			if( strVar3 == strVar4 ) {
				System.out.println("참조(주소) 같음");
			}else {
				System.out.println("참조(주소) 다름");
			}
			if( strVar3.equals(strVar4) ) {
				System.out.println("참조(주소) 내부도 같음");
			}
			
		// 3. p_157
		String hobby = ""; // "" VS null
		if( hobby.equals("") ) {System.out.println("\"\"의 객체");}
		
		String bobby2 = null;
		if( bobby2 == null ) {System.out.println("null 주소 확인");}
		
		// 문자열 관련된 API함수
		// 1. p_158 charAt(인덱스)
		String ssn = "950624-1230123";
		char sex = ssn.charAt(6); System.out.println(sex);
		if( sex == '1' || sex == '3' ) {System.out.println("남자");}
		else {System.out.println("여자");}
		
		// 2.p_159 length()
		int length = ssn.length(); // 0~12 -> 13
		if( length == 13 ) {
			System.out.println("주민등록번호 자릿수 맞음");
		}else {
			System.out.println("주민등록번호 자릿수 다름");
		}
		
		// 3. p_160 replace("기존문자", "새로운문자")
		String oldStr = "자바 문자열 불변입니다. 자바 문자열은 String 입니다";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		// 4. p_161 subString(인덱스) VS split(기준문자)
		String  ssn2 = "880815-1234567";
		System.out.println( ssn2.substring(7) ); // 인덱스 7 전 자르기
		System.out.println( ssn2.substring(0,6) ); // 인덱스 0~6 전까지 
		
		System.out.println( ssn2.split("-") ); // "-" 자르면 2조각/인덱스 -> 배열 반환
		System.out.println( ssn2.split("-")[0] ); // 1번 조(880815) 확인
		System.out.println( ssn2.split("-")[1] ); // 2번 조각(1234567) 확인
		
		String board = "1, 자바 학습, 찹조 타입 String을 합습합니다, 홍길동";
		String[] tokens = board.split(","); // ","으로 분리했을 때 4조각/인덱스 -> 배열 반환
		
		System.out.println("번호 : " + tokens[0]);
		System.out.println("제목 : " + tokens[1]);
		System.out.println("내용 : " + tokens[2]);
		System.out.println("이름 : " + tokens[3]);
		
		// 5. p_163 indexOf(찾을 문자) VS contains(찾을 문자)
		String subject = "자바 프로그래밍"; // 띄어쓰기도 문자
		System.out.println( subject.indexOf("자바") ); // 찾으면 0~ 인덱
		System.out.println( subject.indexOf("파이썬") ); // 없으면 -1
		
		System.out.println( subject.contains("자바") ); // 찾으면 true
		System.out.println( subject.contains("파이썬") ); // 없으면 false
		
	} // main E
} // class E
