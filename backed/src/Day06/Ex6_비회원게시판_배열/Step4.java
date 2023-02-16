package Day06.Ex6_비회원게시판_배열;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Step4 { // class S step4. 파일에 있는 문자열 갖고 오기
	public static void main(String[] args) throws Exception { // main S
		
		// * 입력 객체
		Scanner scanner = new Scanner(System.in);
		
		while(true) { // while S 무한루프[ 종료조건 : -2 입력시 ]
			// 현재 파일에 존재하는 모든 문자열 호출
			// 1. 파일입력 클래스 객체 생성(파일경로)
			FileInputStream fin = new FileInputStream("c:/java/board.txt");
			// 2. 읽어 온 바이트를 저장하기 위해 바이트 배열 1000바이트 미리 생성
			byte[] inbytes = new byte[1000];
			// 3. .read() 메소드를 이용한 파일 읽기
				// inbytes : 읽어온 바이트를 배열에 저장
				// bytecount : 읽어온 바이트의 개수를 변수에 저장
			int bytecount = fin.read(inbytes);
			// 4. 바이트배열 -> 문자열
				// new Stirng("유재석");
				// new Stirng("바이트배열");	new String( 바이트배열 , 시작인덱스 , 마지막인덱스 );
			String fStr = new String(inbytes, 0, bytecount);
			
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
				fout.write( outStr.getBytes() ); // 스트림 : 바이트 단위
				
			}else if(check == -2) {break;} 
		} // while E
		
	} // main E
} // class E
