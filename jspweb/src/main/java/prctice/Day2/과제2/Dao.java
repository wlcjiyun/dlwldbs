package prctice.Day2.과제2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao {
	
	// 싱글톤
	private static Dao dao = new Dao();
	public static Dao getInstance() {return dao;}
	
	// DB 연동
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/과제2",
					"root",
					"1234"
					);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public boolean setData(Dto dto) {
		String sql = "insert into 과제2 values(?,?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getData1());
			ps.setString(2, dto.getData2());
			ps.setDouble(3, dto.getData3());
			ps.setInt(4, dto.getData4());
			ps.setString(5, dto.getData5());
			ps.setString(6, dto.getData6());
			ps.setBoolean(7, dto.isData7());
			ps.setString(8, dto.getData8());
			ps.setString(9, dto.getData9());
			ps.executeUpdate();
			
			return true;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	public ArrayList<Dto> getData(){
		ArrayList<Dto> list = new ArrayList<>();
		
		String sql = "select * from 과제2";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Dto dto = new Dto(
						rs.getString(1), rs.getString(2), rs.getDouble(3),
						rs.getInt(4), rs.getString(5), rs.getString(6),
						rs.getBoolean(7), rs.getString(8), rs.getString(9)
						);
				list.add(dto);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	
}
