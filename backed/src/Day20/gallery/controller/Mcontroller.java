package Day20.gallery.controller;

import Day20.gallery.model.Dao.memberDao;
import Day20.gallery.model.Dto.memberDto;

public class Mcontroller {
	// 1. 싱글톤
	private static Mcontroller Mcontroller = new Mcontroller();
	private Mcontroller() {}
	public static Mcontroller getInstance() {return Mcontroller;}
	
	// 1. 회원가입 처리
	public int signup(String mid, String mpw, String mname, String mphone) {
		
		// 1. 유효성 검사 ( 글자수, 중복 등)
			// 1-1. 아이디 중복 체크
			if(memberDao.getInstance().idCheck(mid)) {
				return 2;
			}
		// 2. 객체화
			memberDto dto = new memberDto(0, mid, mpw, mname, mphone);
		// 3. 회원가입 DB 처리
		return memberDao.getInstance().sginup(dto);
	}
	
	private int loginSession = 0; // 로그인된 회원번호 담기
	public int getLoginSession() {return loginSession;}
	
	// 2. 로그인 처리
	public boolean login(String mid, String mpw) {
		
		// 1. 유효성 검사
		// 2. 객체화
		int result = memberDao.getInstance().login(mid, mpw);
		// 3. 로그인 성공 증거
		if(result == 0) {return false;}
		else {
			loginSession = result; // 반환된 회원번호를 세션에 저장
			return true;
		}
	}
	
}
