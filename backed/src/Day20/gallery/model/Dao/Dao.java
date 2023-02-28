package Day20.gallery.model.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	
	// 1. JDBC 인터페이스 3개
	public Connection con;			// DB 연동 인터페이스 
	public PreparedStatement ps;	// SQL 조작 인터페이스
	public ResultSet rs;			// SQL 결과 조작 인터페이스
	
	public Dao() {
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/boardDB",
					"root",
					"1234"
					);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
}
