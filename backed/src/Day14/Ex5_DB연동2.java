package Day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5_DB연동2 { // class S
	public static void main(String[] args) { // main S
		
		Scanner scanner = new Scanner(System.in);
		Connection conn = null; // 여러 if{} 안에서 사용하기 위해 밖에 작성 
		
		while(true) { // while S
			
			try { // try S // 1. 예외가 발생할 것 같은 코드 ( 예상 : nextInt() 안에 문자열 입력시 예외 발생 )
				System.out.println("1.연결 2.테이블생성 3.데이터추가");
				int ch = scanner.nextInt();
				
				if(ch==1) {
					System.out.println("--연동할 DB명 입력 : ");
					String dbname = scanner.next();
					System.out.println("**" + dbname + "에 연결합니다**");
					
					// * 입력받은 DB와 연결
					conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/" + dbname, "root", "1234" );
					System.out.println("**DB 연결 성공**");
				}
				else if(ch==2) {
					System.out.println("--생성할 table sql 입력 : ");
					scanner.nextLine(); // * .nextLine(); 앞에 다른 .next()가 있을 때 오류 방지
					String sql = scanner.nextLine();
					// * 연결된 DB 객체에 SQL 대입 [ PreparedStatement 매개변수 처리 ] 
					PreparedStatement ps = conn.prepareStatement(sql);
					// * sql 실행
					ps.execute();
				}
				else if(ch==3) {
					System.out.println("번호 : ");		int num = scanner.nextInt();
					System.out.println("아이디 : ");		String id = scanner.next();
					System.out.println("비밀번호 : ");		String pwd = scanner.next();
					// * sql 구문 작성 [ ? : 변수가 들어갈 자리 ]
					String sql = "insert into member values(?, ?, ?);";
					PreparedStatement ps = conn.prepareStatement(sql);
					// * ? 매개변수에 데이터변수를 대입
					ps.setInt(1, num); 		// 1 : sql 구문에서 첫 번째 ? 자리
					ps.setString(2, id);	// 2 : sql 구문에서 두 번째 ? 자리
					ps.setString(3, pwd);	// 3 : sql 구문에서 세 번째 ? 자리
					// 실행
					ps.executeUpdate();
				}
				
			} // try E
			catch (InputMismatchException e) { // catch S // 2. try{} 에서 예외가 발생하면 실행되는 코드
				System.out.println("[알림] 알 수 없는 번호입니다");
				scanner = new Scanner(System.in); // 기존에 입력된 데이터 초기화
			} // catch E
			catch (SQLException e) {
				System.out.println("[SQL 오류] : " + e);
			}
			
		} // while E
		

	} // main E
} // class E
