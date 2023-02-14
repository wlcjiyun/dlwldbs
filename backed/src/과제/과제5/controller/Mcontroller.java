package 과제.과제5.controller;

import java.util.ArrayList;

import 과제.과제5.model.Member;

public class Mcontroller {
	/*
		회원가입
			: id, pwd, name
		로그인
			: id, pwd
	*/
	
	// * 싱글톤
	static Mcontroller mc = new Mcontroller();
	public Mcontroller() {}
	public static Mcontroller getInstance1() {return mc;}
	
	// MemberDB
	private ArrayList<Member> memberDB = new ArrayList<>();
	// 로그인 회원 객체 저장
	Member logSession = null;
	public Member getInstance() {
		return logSession;
	}
	
	// 1. 회원가입 
	public int signup(String id, String pwd, String name) {
		Member m = new Member();
		memberDB.add(m);
		return 0;
	}
	
	// 2. 로그인
	public int login(String id, String pwd) {
		for( int i = 0; i<memberDB.size(); i++ ) {
			if( memberDB.get(i).getId().equals(id) ) {
				if( memberDB.get(i).getPwd().equals(pwd) ) {
					logSession = memberDB.get(i);
					return i;
				}
			}else {
				return -1;
			}
		}
		return -2;
	}
	
	
	
	
	
}
