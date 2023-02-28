package Day20.gallery.model.Dao;

import Day20.gallery.model.Dto.memberDto;

public class memberDao extends Dao{
	
	// 1. 싱글톤
	private static memberDao dao = new memberDao();
	private memberDao() {}
	public static memberDao getInstance() {return dao;}
	
	// 1. 기능 메소드
	
		// 1. 아이디 중복 체크
		public boolean idCheck(String mid) {
			String sql = "select * from memebr where mid = ?";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, mid);
				rs = ps.executeQuery();
				if(rs.next()) {return true;} // 검색된 레코드가 있으면 중복된 아이디이다
				else {return false;} // 검색된 레코드가 없으면 중복된 아이디가 아님
			} catch (Exception e) {
				System.out.println(e);
			}
			return true;
		}
		// 2. 비밀번호 중복 체크
		public boolean pwCheck(String mpw) {
			String sql = "select * from memebr where mpw = ?";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, mpw);
				rs = ps.executeQuery();
				if(rs.next()) {return true;} // 검색된 레코드가 있으면 중복된 아이디이다
				else {return false;} // 검색된 레코드가 없으면 중복된 아이디가 아님
			} catch (Exception e) {
				System.out.println(e);
			}
			return true;
		}
		
		// 2. 회원가입
		public int sginup(memberDto dto) {
			String sql = "insert into member( mid, mpw, manme, mphone) values(?,?,?,?);";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, dto.getMid());
				ps.setString(2, dto.getMpw());
				ps.setString(3, dto.getMname());
				ps.setString(4, dto.getMphone());
				return 1;
			} catch (Exception e) {
				System.out.println(e);
			}
			return 3;
		}
		
		// 3. 로그인
			// 로그인세션(로그인 되어있는 동안 저장되는 공간) : 1. 회원번호 2. loginDto
		public int login(String mid, String mpw) {
			String sql = "select * from member where mid = ? and mpw = ?";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, mid);
				ps.setString(2, mpw);
				rs = ps.executeQuery();
				if(rs.next()) { // 만약에 다음 레코드가 존재하면 로그인 성공
					return rs.getInt(1); // 검색된 레코드에서 첫 번째 필드(회원번호)
				}else { // 다음 레코드가 존재하지 않으면 로그인 실패
					return rs.getInt(0);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			return 0;
		}
}