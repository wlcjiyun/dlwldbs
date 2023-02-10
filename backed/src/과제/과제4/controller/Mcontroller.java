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
	public int login(String id, String pwd) { // login S
			
		if(!(id).equals(id)) { return 1; }
		Member member = new Member();
		memberDb.add(member);
		return 0;
		
		} // login E
	
	// 3. 아이디 찾기 로직
	
	// 4. 비밀번호 찾기 로직
	
} // class E
