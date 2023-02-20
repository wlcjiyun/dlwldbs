package 과제10.과제1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DB과제1 { // class S
	public static void main(String[] args) { // main S
		
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		
		while(true) { // while S
			
			try {
				System.out.println("1.DB연결 2.SQL구문 작성 3.매개변수 입력");
				int ch = scanner.nextInt();
				
				if(ch==1) {
					System.out.println("--- 연결할 DB명 입력하세요 ---");
					String DBname = scanner.next(); // 과제1
					System.out.println("*** " + DBname + "에 연결합니다 ***");
											/* ! */
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DBname, "root", "1234");
					System.out.println("*** DB 연결에 성공하였습니다 ***");
				}
				else if(ch==2) {
					System.out.println("--- 생성할 테이블 SQL 입력하세요 : ");
					scanner.nextLine();
					String sql = null;
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.execute();
				}
				else if(ch==3) {
					System.out.println("제품번호 : ");		int num = scanner.nextInt();
					System.out.println("제품명 : ");		String pname = scanner.next();
					System.out.println("제품정보 : ");		String pinfo = scanner.next();
					System.out.println("제품가격 : ");		int pprice = scanner.nextInt();
					
					String sql = "insert into product valuse(?, ?, ?, ?);";
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ps.setInt(1, num);
					ps.setString(2, pname);
					ps.setString(3, pinfo);
					ps.setInt(4, pprice);
					
					ps.executeUpdate();
				}
			}
			catch (InputMismatchException e) {
				System.out.println("[알림] 알 수 없는 번호입니다");
				scanner = new Scanner(System.in);
			}
			catch (SQLException e) {
				System.out.println("[오류] : " + e);
			}
			
		} // while E
	} // main E
} // class E
