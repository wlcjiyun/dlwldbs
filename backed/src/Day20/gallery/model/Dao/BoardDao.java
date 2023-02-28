package Day20.gallery.model.Dao;

import java.util.ArrayList;

import Day20.gallery.model.Dto.CategoryDto;

public class BoardDao extends Dao{
	private static BoardDao dao = new BoardDao();
	private BoardDao() {}
	public static BoardDao getInstance() { return dao;}
	
	// 1. 카테고리 추가 SQL
	public boolean categoryAdd(String cname) {
		String sql = "insert into category( cname ) values( ? )";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, cname);
			ps.executeUpdate();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	// 2. 모든 카테고리 호출 SQL
	public ArrayList<CategoryDto> categoryPrint(){
		
		ArrayList<CategoryDto> clist = new ArrayList<>(); // 여러 개 dto를 담을 리스트 선언
		
		String sql = "select * from category";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				// 레코드 --> dto
				CategoryDto dto = new CategoryDto(rs.getInt(1), rs.getString(2));
				clist.add(dto);
			}
			return clist;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
