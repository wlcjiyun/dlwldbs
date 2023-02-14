package 과제.과제4_싱글톤.controller;

/* 컨트롤(이벤트) 설계
	1. 회원가입
		- 인수 : id, pw, confirmpw, name, phone	- 반환 : 0(성공)/1(pw실패)
	2. 로그인
		- 인수 : id, pw							- 반환 : i(회원번호)/-1(pw틀림)/-2(id틀림)
	3. 아이디 찾기
		- 인수 : name, phone 					- 반환 : 찾은 아이디/null			
	4. 비밀번호 찾기
		- 인수 : id, phone						- 반환 : 찾은 비밀번
	5. 글 쓰기
		- 인수 : id, title, content				- 반환 : true(성공)/false(실패)
	6. 글 출력
		- 인수 :	X[페이징처리, 검색처리 -> 추후 기능]	- 반환 : 모든 글이 담긴 ArrayList 							
	7. 글 상세보기
		- 인수 : 글 번호							- 반환 : 해당 번호의 Board 하나
		- * 조회수 증가
	8. 글 삭제
		- 인수 : 글 번호							- 반환 : true(성공)/false(실패)
	9. 글 수정
		- 인수 : 글번호, 새로운 제목/내용				- 반환 : true(성공)/false(실패)
	10. 로그아웃 
		- 인수 : X								- 반환 : true(성공)/false(실패)
*/
public class Mcontorller {
	
	// 1. 회원가입 처리
	public int signup( String id, String pw, String confirmpw, 
						String name, String phone ) {
		// 로직 예정
		return 0;
	}
	
	// 2. 로그인 처리
	public int login(String id, String pw) {
		return -2;
	}
	
	// 3. 아이디 찾기
	public String findId(String name, String phone) {
		return null;
	}
	
	// 4. 비밀번호 찾기
		public String findPw(String id, String phone) {
			return null;
		}
		
	// 10. 로그아웃
		public boolean logOut() {
			return true;
		}
	
}
