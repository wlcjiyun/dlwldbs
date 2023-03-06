package prctice.Day03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDao {
	
	private static ProductDao dao = new ProductDao();
	public static ProductDao getInstance() {return dao;}
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private ProductDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			con = DriverManager.getConnection( 
					"jdbc:mysql://localhost:3306/jspweb","root","1234");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// 1. 등록 
	public boolean onproduct(ProductDto dto) {
		String sql = "insert into 과제(pname, pprice) values(?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , dto.getPname());
			ps.setInt( 2 , dto.getPprice());
			ps.executeUpdate(); 
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	// 2. 출력
	public ArrayList<ProductDto> onprolist(){
		ArrayList<ProductDto> list = new ArrayList<>();
		String sql ="select * from 과제";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) { // 레코드1개 = if / 레코드여러개 = while 
				ProductDto dto = new ProductDto( 
						rs.getString( 1 ), 
						rs.getInt(2));
				list.add(dto);
			}
		}catch (Exception e) {System.out.println(e);}
		return list;
	}
	
	// 3. 삭제
	public boolean onproDelete(int pno) {
		String sql = "delete from 과제 where pno = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, pno);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	// 4. 수정
	public boolean onproUpdate(int pno, String newPname, int newPprice) {
		String sql = "update 과제 set bcontetn = ? where pno = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, pno);
			ps.setString(2, newPname);
			ps.setInt(3, newPprice);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
}
