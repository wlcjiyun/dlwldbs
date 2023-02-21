package Day15.Ex9_MVC_DB;

import java.util.Scanner;

public class View {
	
	// 싱글톤
	private static View view = new View();
	private View() {}
	public static View getInstance() {return view;}
	
	// 필드
	Scanner scanner = new Scanner(System.in);
	
	// 1. 초기 메인 페이지 ----------------------------------------------------------------
	public void index() {
		while(true) {
			System.out.println("1.회원등록[c] 2.회원출력[r] 3.회원수정[u] 4.회원삭제[d] : ");
			int ch = scanner.nextInt();
			if(ch==1) {signup();}
			else if(ch==2) {list();}
			else if(ch==3) {}
			else if(ch==4) {}
		}
	}
	
	// 2. 회원가입 페이지 ----------------------------------------------------------------
	public void signup() { // view(입출력==html)
		System.out.println("--------------------------등록[c]----------------------");
		// 2-1. 입력받기
		System.out.println("아이디 : ");		String mid = scanner.next();
		System.out.println("비밀번호 : ");		String mpw = scanner.next();
		// 2-2. 입력받은 데이터 컨트롤에게 전달 후 결과 얻기
		boolean result = Controller.getInstance().signup(mid, mpw);
		// 2-3. 결과에 따른 출력
		if(result == true) {System.out.println("***회원가입 성공***");}
		else if(result == false) {System.out.println("***회원가입 실패***");}
	}
	
	// 3. 회원목록 보기 페이지 ----------------------------------------------------------------
	public void list() {
		System.out.println("--------------------------출력[r]----------------------");
		
	}
	
}
