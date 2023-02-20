package Day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex4_DB연동 { // class S
	public static void main(String[] args) { // main S
		
		
		try { // try S
			
			// 1. 연결 인터페이스
			Connection con = DriverManager.getConnection(
					// 자바에서 DB 생성 불가능하기에 DB 생성 후 실행
					"jdbc:mysql://localhost:3306/java", "root", "1234" 
					);
			System.out.println("[DB 연동 성공]");
			
			// 2. 테이블 생성하는 sql 구문을 문자열 변수에 저장
			String sql = "create table member( num int, id varchar(20), pwd varchar(20) )";
			
			// 3. DML, DDL 조작 인터페이스에 연결된 DB연결구현객체에 SQL 대입
			PreparedStatement ps = con.prepareStatement(sql);
			
			// 4.
			ps.execute(); // 실행
			
			// 5. 삭제
			// sql = "drop table member";
			
		} // try E
		catch (Exception e) { // catch S
			System.out.println("[DB 연동 실패] 사유 : " + e);
		} // catch E
		
		
		
	} // main E
} // class E

/*
	JDBC : 자바와 DB 연결 드라이브
		- 해당 DBMS 마다 라이브러리 [.JAR] 파일이 필요함
		- 보관장소 : C://mysql-connector-j-8.0.XX
		
	- 1. 라이브러리 추가 
		- 해당 프로잭트 오른쪽 클릭 -> bulid path -> Configure build path
		- Libraries -> 1.8 ver -> Apply
		- add External jars 클릭 -> mysql-connector-j-8.0.XX .jar 파일 찾아서 추가
	
	- 2. DB 연결
		- Connection 
		- DriverManager
			1. DriverManager.getConnection(1.DB주소 2.계정 3.비밀번호);
				// * 일반예외 발생 (예외처리 필수!!)
				// * mysql server 주소 : jdbc:mysql://ip주소:포드번호/db명
				// * 로컬pc 기준 : jdbc:mysql://localhost:3306/db명
		- mysql 워크벤치에서 생성한 DB : 
*/	
