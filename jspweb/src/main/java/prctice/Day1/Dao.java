package prctice.Day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao {
	
	// 1. 내부객체와 내부객체 반환 메소드
	private static Dao dao = new Dao();
	public static Dao getInstance() {return dao;}
	
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	private Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jspweb",
					"root",
					"1234"
					);
			System.out.println("DB연동성공");
		} catch (Exception e) {
			System.out.println("DB연동실패 : " + e);
		}
		
	}
	
	// 2. SQL 메소드
	// 데이터 저장
	public boolean setData( String data) {
		// 1. SQL 작성
		String sql = "insert into ex1 value(?)";
		try {
			ps = con.prepareStatement(sql);		// 2. SQL 대입
			ps.setString(1, data);				// 3. SQL 조작
			ps.executeUpdate();					// 4. SQL 실행 --> 5. SQL 결과
			return true;						// 6. 응답
		}catch (Exception e) {
			System.err.println(e);
		}
		return false;
	}
	
	// 3. 데이터들 호출
	public ArrayList<String> getData(){
		
		ArrayList<String> list = new ArrayList(); 
		
		String sql = "select * from ex1";		// 1. SQL 작성
		try {
			ps = con.prepareStatement(sql);		// 2. 연결된 JDBC에 SQL 대입
			rs = ps.executeQuery();				// 3. SQL 조작 X // 4. SQL 실행
			while(rs.next()) {	// 레코드1개 = if / 레코드 여러개 = while
				// 해당 레코드의 첫 번째 필드를 리스트에 저장
				list.add(rs.getString(1));
			}
		}catch (Exception e) {
			System.err.println(e);
		}
		return list;
	}
	
	// 과제
	public boolean setQ1Data( String Q1data) {
		// 1. SQL 작성
		String sql = "insert into Q1 values(?)";
		try {
			ps = con.prepareStatement(sql);		
			ps.setString(1, Q1data);				
			ps.executeUpdate();					
			return true;						
		}catch (Exception e) {
			System.err.println(e);
		}
		return false;
	}
	public ArrayList<String> getQ1Data(){
		ArrayList<String> list = new ArrayList(); 
		String sql = "select * from Q1";		
		try {
			ps = con.prepareStatement(sql);		
			rs = ps.executeQuery();				
			while(rs.next()) {
				list.add(rs.getString(1));
			}
		}catch (Exception e) {
			System.err.println(e);
		}
		return list;
	}
}
