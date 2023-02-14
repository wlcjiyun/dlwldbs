package 과제.과제4_싱글톤;

import 과제.과제4_싱글톤.view.Front;

/*
	M(model) 		: 데이터 모델링 : 저장하고자 하는 데이터들의 설계
	V(view) 		: 입·출력
	C(controller) 	: 제어 / 비지니스 로직 / 기능처리
	
	예) 회원가입
		V : 아이디, 비밀번호 등 입력만 받음
		C : 입력받은 데이터 저장( + 유효성 검사 ) -> 실제 기능 처리 담당
		M : 컨트롤이 데이터를 저장할 때 사용되는 모델링
*/
public class Start { // class S
	public static void main(String[] args) { // main S
		Front.getInstance().index();
	} // main E
} // class E
