package 과제.과제11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDao {
	
	// 싱글톤
	private static ProductDao dao = new ProductDao();
	public static ProductDao getInstance() { return dao;}
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	// DB 연동
	private ProductDao() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","1234");
			System.out.println("DB 연동 성공");
		} 
		catch (Exception e) {
			System.out.println("DB 연동 실패: " + e);
		}		
	}
	
	// 1. 메인페이지
	public boolean registration(ProductDto dto) {
		String sql = "insert into member(pname, pprice, pstock) values(?, ?, ?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getPname());
			ps.setInt(2, dto.getPprice());
			ps.setInt(3, dto.getPstock());
			ps.executeUpdate();
			return true;
		} 
		catch (Exception e) {
			 System.out.println("DB 오류 : " + e);
		}
		return false;
	}
	
	// 2. 제품 목록
	public ArrayList list() {
		ArrayList list = new ArrayList<>();
		String sql = "select * from member";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				ProductDto dto = new ProductDto( rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4) );
				list.add(dto);
			}
			return list;
		} 
		catch (Exception e) {
			System.out.println("DB 오류 : " + e);
		}
		return null;
	}
	
	// 3. 제품 수정
	public boolean product_update(int pno, String pname) {
		String sql = "update member set pname = ? where pno = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, pname);
			ps.setInt(2, pno);
			ps.executeUpdate();
			return true;
		} 
		catch (Exception e) {
			System.out.println("DB 오류 : " + e);
		}
		return false;
	}
	
	// 4. 재고 수정
	public boolean stock_update(int pno, int pstock) {
		String sql = "update member set pstock = ? where pno = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, pstock);
			ps.setInt(2, pno);
			ps.executeUpdate();
			return true;
		} 
		catch (Exception e) {
			System.out.println("DB 오류 : " + e);
		}
		return false;
	}
	
	// 5. 제품 삭제
	public boolean delete( int pno ) {
		String sql = "delete from member where pno = ? "; // 1. 
		try {
			ps = conn.prepareStatement(sql); // 2.
			ps.setInt( 1 , pno ); // 3.
			ps.executeUpdate();	// insert , update , delete  	// 4.
			return true; 	// 5.
		}
		catch (Exception e) { 
			System.out.println("DB 오류 : " + e); 
		}
		return false;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
