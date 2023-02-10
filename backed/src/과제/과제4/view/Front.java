package 과제.과제4.view;
// * 입출력

import java.util.Scanner;

public class Front {
	
	Scanner scanner = new Scanner(System.in);
	
	// 1. 메인페이지
	public void index() {
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
			int ch = scanner.nextInt();
			if(ch==1) {}
			else if(ch==2) {}
			else if(ch==3) {}
			else if(ch==4) {}
			else if(ch==5) {}
			else {}
		}
	}
	// 2. 회원가입 페이지
	void signup() {}
	// 3. 로그인 페이지
	void iogin() {}
	// 4. 아이디 찾기 페이지
	void findId() {}
	// 5. 비밀번호 찾기 페이지
	void findPassword() {}
}
