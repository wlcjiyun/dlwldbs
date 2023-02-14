package 과제.과제4_싱글톤.model;

//M : 데이터를 저장할 때 사용되는 데이터 모델링
	// - 회원[객체] 여러 명을 만들어 하나의 리스트/배열에 저장
	// - 필드 : private : 외부로부터 직접 접근 방지 -> getter&setter
	// - 생성자 : 1.깡통 2.풀
	// - 메소드 : 1.toString() 2.getter&setter

import java.util.ArrayList;

public class Member {
	
	// 인스턴스멤버 : 객체를 만들어서 사용 -> 스택 영역
	// 정적멤버 : 객체 없이 사용( static ) -> 메소드 영역
	
	// 1. 필드
	private String id;
	private String pw;
	private String name;
	private String phone;
	
		// 1-1. 한 명의 회원(객체)이 여러 개의 board 객체를 가질 수 있다
		private ArrayList<Board> boardList = new ArrayList<>();

	// 2. 생성자
	public Member() {}
	public Member(String id, String pw, String name, String phone, ArrayList<Board> boardList) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.boardList = boardList;
	}
	
	// 3. 메소드
	/*------------------------------Override----------------------------*/
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + pw + ", name=" + name + ", phone=" + phone + ", boardList="
				+ boardList + "]";
	}
	/*---------------------------getter&setter--------------------------*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String password) {
		this.pw = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public ArrayList<Board> getBoardList() {
		return boardList;
	}
	public void setBoardList(ArrayList<Board> boardList) {
		this.boardList = boardList;
	}
	
}
