package Day06;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex3_문자열2 { // class S
	public static void main(String[] args) throws Exception { // main S
		
		while( true ) { // whlie S
			
			// 1. 문자열 입력받기
				// 1-1. 입력 객체
				Scanner scanner = new Scanner(System.in); 
				// 1-2. 입력받은 문자열을 변수에 저장
				String input= scanner.nextLine()+"\n";
				
			// 2. 문자열 파일에 저장[ 자바 외 키보드/파일/네트워크 등등 통신할 때 무조건 바이트 단위 ]
			FileOutputStream fout = new FileOutputStream("c:/java/test.txt" , true);
			fout.write( input.getBytes() );
			
		} // while E
		
		
	} // main E
} // class E

/*
	FileOutputStream("파일경로") : 파일 쓰기 클래스
		FileOutputStream("파일경로") : 파일 새로 쓰기
		FileOutputStream("파일경로", true ) : 파일 이어쓰기
			.write(바이트배열) :
			
	문자열.getBytes() : 해당 문자열을 바이트배열 반환

*/
