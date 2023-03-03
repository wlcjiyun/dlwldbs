package 개인.web1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	
	private static Dao dao = new Dao();
	public static Dao getInstance() {return dao;}
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jspweb",
					"root",
					"1234"
					);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
