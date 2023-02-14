package 과제.과제4_싱글톤.controller;

import java.util.ArrayList;

import 과제.과제4_싱글톤.model.Member;

/* 컨트롤(이벤트) 설계
	1. 회원가입
		- 인수 : id, pw, confirmpw, name, phone	- 반환 : 0(성공)/1(pw실패)
	2. 로그인
		- 인수 : id, pw							- 반환 : i(회원번호)/-1(pw틀림)/-2(id틀림)
	3. 아이디 찾기
		- 인수 : name, phone 					- 반환 : 찾은 아이디/null			
	4. 비밀번호 찾기
		- 인수 : id, phone						- 반환 : 찾은 비밀번호
	10. 로그아웃 
		- 인수 : X								- 반환 : true(성공)/false(실패)
*/
public class Mcontorller {
		
		// * 싱글톤 : 다른 곳에 해당 객체를 공용으로 쓰겠다 [ 멤버 = 필드, 메소드 ] 
			// * 1. 본인 클래스로 본인 객체 만들기
			static Mcontorller mc = new Mcontorller();
			// * 2. 외부에서 생성자를 사용할 수 없도록 생성자에 private
			private Mcontorller() {}
			// * 3. 
			public static Mcontorller getInstance() { return mc; }
			// * 4. static
		
	
		// 1-2 : DB 대신 ArrayList
		private ArrayList<Member> memberDB = new ArrayList<>();
		
		// 2.1 : 로그인 한 회원의 객체를 저장 [ * 동시 접시 문제점 발생함! ]
			 // 사용목적 : 페이지가 바뀌더라도 정보 저장 [ * 메소드가 종료되더라도 정보는 저장 ]
		Member LogSession = null;	
		public Member getLogSession() {
			return LogSession;
		}
		
	// 1. 회원가입 처리
	public int signup( String id, String pw, String confirmpw, String name, String phone ) {
		// 1-1. 유효성 검사
		if( !pw.equals(confirmpw) ) { return 1; }
		// 1-2. DB에 저장 
			// 1-2-1. 객체화 [ 입력받은 데이터 4개, 회원마다 글을 저장할 리스트/배열 메모리 초기화 ]
			Member m = new Member( id, pw, name, phone, new ArrayList<>() );
				// id, pw, name, phone : 스택영역에 저장된 힙 주소 전달
				// new ArrayList<>() : 힙 영역에 생성된 힙 주소 전달
			// 1-2-2. 리스트/배열에 저장
			memberDB.add(m);
		return 0;
	}
	
	// 2. 로그인 처리
	public int login( String id, String pw ) {
		// 2-1. 반복문
		for( int i = 0; i<memberDB.size(); i++ ) {
			if( memberDB.get(i).getId().equals(id) ) { // i번 쨰 인덱스의 id와 입력받은 id가 같으면
				if( memberDB.get(i).getPw().equals(pw) ) { // i번 째 인덱스의 pw와 입력받은 pw가 같으면 로그인 성공
					LogSession = memberDB.get(i); // 로그인 성공한 회원 객체를 필드에 저장
					return i;
				}else {
					return -1;
				}
			}
		}
		return -2;
	}
	
	// 3. 아이디 찾기
	public String findId( String name, String phone ) {
		// 3-1. 향상된 for문 
		for( Member m : memberDB ) { // * memberDB에는 여러 개의 member 객체가 들어있어 하나씩 member 객체 꺼내기 반복 : 자료형은 Member
			if( m.getName().equals(name) && m.getName().equals(name) && m.getPhone().equals(phone) ) {
				return m.getId(); // 위 조건이 일치할 경우 찾은 아이디 반환
			}
		}
		return null;
	}
	
	// 4. 비밀번호 찾기
	public String findPw( String id, String phone ) {
		// 4-1. 향상된 for문 
		for( Member m : memberDB ) { // * memberDB에는 여러 개의 member 객체가 들어있어 하나씩 member 객체 꺼내기 반복 : 자료형은 Member
			if( m.getId().equals(id) && m.getPhone().equals(phone) ) {
				return m.getPw(); // 위 조건이 일치할 경우 찾은 비밀번호 반환
			}
		}
		return null;
	}
		
	// 10. 로그아웃
	public boolean logOut() {
		LogSession = null; // 필드에 저장된 로그인 성공한 회원 객체를 지우기 [ null 대입하면 GC가 힙 메모리 자동 제거 ]
		return true;
	}
	
}
