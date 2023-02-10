package 과제.과제4.controller;

import java.util.ArrayList;

import 과제.과제4.model.Member;

// * 처리/제어 
public class Mcontroller { // class S
	
	// DB를 대신할 리스트(데이터 저장소)
	ArrayList<Member> memberDb = new ArrayList<>();
	
	// 1. 회원가입 로직
	public int signup(String id, String pwd, String confirmpwd, String name, String phone) { // singup S
		
		// 1. 유효성 검사
		if(!pwd.equals(confirmpwd)) { return 1; } // 1 : 회원가입 실패 
		// 2. 객체 만들기
		Member member = new Member(id, confirmpwd, name, phone);
		// 3. DB처리 [ list로 대체함 ] 
		memberDb.add(member);
		return 0; // 0 : 회원가입 성공
	} // signup E
	
	// 2. 로그인 로직
	public int login( String id , String pwd ) { // login S
		
		// 모든 멤버들 중 동일한 아이디/비밀번호 찾기
		for(int i = 0; i<memberDb.size(); i++) { // for S
			
			// 1. 만약 i번 째 회원의 아이디와 입력받은 아이디와 같으면
			if( memberDb.get(i).id.equals(id)) { // if S
				
				// 2. 만약에 i번 째 비밀번호와 입력받은 비밀번호가 같으면
				if(memberDb.get(i).pwd.equals(pwd)) { 
					return i; // 회원 번호(인덱스) 반환
				}else {
					return -1; // 비밀번호가 틀림
				}
				
			} // if E
		} // for E
		return -2; // 아이디가 없음
	} // login E
	
	// 3. 아이디 찾기 로직
	public int findId( String name , String phone ) {
		for(int i = 0; i<memberDb.size(); i++) {
			if(memberDb.get(i).equals(name)) {
				if(memberDb.get(i).equals(phone)) {
					return i;
				}else {
					return -3;
				}
			}
		}
		return -4;
	}
	// 4. 비밀번호 찾기 로직
	public int findPassword( String name , String id ) {
		for(int i = 0; i<memberDb.size(); i++) {
			if(memberDb.get(i).equals(name)) {
				if(memberDb.get(i).equals(id)) {
					return i;
				}else {
					return -3;
				}
			}
		}
		return 0;
	}
} // class E

/* 헿 난 바본가봐~ 아무것도 모르겠다~ */


