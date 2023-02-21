package Day15.Ex9_MVC_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao {
	
	// * 싱글톤 : Dao는 싱글톤을 주로 씀 : 프로그램에서 DB연동은 1번만 하기에.
		// 1. 내부에 객체 만들기
		private static MemberDao dao = new MemberDao();
		// 2. 생성자는 private : 외부에서 new 사용금지
		// 3. 외부에서 내부객체를 사용할 수 있게 내부객체 반환 메소드 getInstance
		public static MemberDao getInstance() {return dao;}
		
		ArrayList<MemberDao> memberDB = new ArrayList<>();
	
	
	// 1. DB 연동 시 필요 ( 필드 )
	private Connection conn;  
	private PreparedStatement ps;
	private ResultSet rs;
	
	// 2. try&catch ( 생성자 )
	// 싱글톤 2번 public BoardDao(){} -(변경)-> private BoardDao(){}
	private MemberDao() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Day15", "root", "1234");
			System.out.println("[알림] DB 연동 성공");
		} 
		catch (Exception e) {
			System.out.println("[알림] DB 연동 실패");
		}
	}
	
	// 3. SQL 처리 메소드
		// 3-1. 회원가입 메소드 ( 인수 : Dto(mid, mpw) | 반환 : 0, -1 )
		public boolean signup(MemberDto dto) {
			
			// 1. sql 작성
			String sql = "insert into member(mid,mpw) values(?,?);";
			
			// 2. 연동 DB에 SQL 대입 ( ps -> 매개변수 조작 가능 ]
			try {
				ps = conn.prepareStatement(sql);
				// 3. ps는 매개변수에 대한 조작 가능
				ps.setString(1, dto.getMid()); // 첫 번째 물음표에 대한 데이터 대입
				ps.setString(2, dto.getMpw()); // 두 번째 물음표에 대한 데이터 대입
				// 4. ps가 sql 실행
				ps.executeUpdate();
				// 5. 결과 반환
				return true; // try에서 예외(오류)가 없으면 저장 성공  
			}
			catch (Exception e) {
				System.out.println("DB 오류 : " + e);
			}
			return false; // try에서 예외(오류)가 있으면 실행됨 -> 저장 실패
		}
	
	//---------------------------------------------------------------------------------------------------------
	
	// 4. 회원목록 보기 페이지 ----------------------------------------------------------------
		// ( 인수 : X | 반환 : 여러명(ArrayList)회원정보(Member) )
	public void list() {
		
	}	
		
}
