package Day15.Ex9_MVC_DB;

public class Controller {
	
	// 싱글톤
	private static Controller cont = new Controller();
	private Controller() {}
	public static Controller getInstance() {return cont;}
	
	// 1. 회원등록 페이지 ----------------------------------------------------------------
	public boolean signup(String mid, String mpw) {
		// 1. 유효성 검사 생략
		// 2. 객체화
		MemberDto dto = new MemberDto(0, mid, mpw);
		// 3. 해당 객체를 DB에 저장 (DAO 호출) 하고 실행 결과 저장
		boolean result = MemberDao.getInstance().signup(dto);
		// 4. 실행 결과 반환
		return result;
	}
	// 2. 회원목록 보기 페이지 ----------------------------------------------------------------
	public void list(int mno, String mid, String mpw) {
	
	}
	
}
