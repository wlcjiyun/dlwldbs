package Day15.Ex9_MVC_DB;

public class MemberDto {
	
	// 1. 필드 ( DB 필드와 일치화 )
	private int mno;
	private String mid;
	private String mpw;
	// 2. 생성자( 1.깡통 2.풀 )
	public MemberDto() {}
	public MemberDto(int mno, String mid, String mpw) {
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpw = mpw;
	}
	// 3. 메소드( 무조건 1. get&set 2. toString() )
	@Override
	public String toString() {
		return "BoardDto [mno=" + mno + ", mid=" + mid + ", mpw=" + mpw + "]";
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
}
