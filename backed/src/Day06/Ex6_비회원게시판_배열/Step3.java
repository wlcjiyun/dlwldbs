package Day06.Ex6_비회원게시판_배열;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Step3 { // class S step3. 입력된 데이터를 파일처리 [ 영구 저장 ]
	public static void main(String[] args) throws Exception { // main S // 2. 예외처리 던지기
		
		// step2. 쓰기 페이지 실행되는 조건
		
		// * 입력 객체
		Scanner scanner = new Scanner(System.in);
		
		while(true) { // while S 무한루프[ 종료조건 : -2 입력시 ]
			// 게시물들이 출력되는 위치
			System.out.println("메뉴> 쓰기[-1] 나가기[-2]");
			int check = scanner.nextInt();
			if(check == -1) {
				System.out.println("제목 : ");		String title = scanner.next();
				System.out.println("내용 : ");		String content = scanner.next();
				System.out.println("작성자 : ");		String writer = scanner.next();
				System.out.println("비밀번호 : ");	String password = scanner.next();
				
				// 2. , : 열 구분선(데이터구분)		\n : 행 구분선(게시물구분)
				String outStr = title + "," + content + "," + writer + "," + password + "\n";
				
				// 1. 파일처리 객체 생성( "파일경로" , true )
				FileOutputStream fout = new FileOutputStream("c:/java/board.txt",true);
				fout.write( outStr.getBytes() );
				
			}else if(check == -2) {break;} 
		} // while E
		
	} // main E
} // class E
