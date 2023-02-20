package Day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2_468 {
	public static void main(String[] args) {
		
		// 1. Class.forName("패키지명.클래스명"); 
			// 일반 예외 : 컴파일 전에 예외 확인
		try {
			Class.forName("java.lang.String"); // 클래스 여부 찾기
			System.out.println("java.lang.String 클래스 존재");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		/* --------------------------------------------------- */
		System.out.println();
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스 존재");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		/* --------------------------------------------------- */
		// 2. 다중 catch
			// 2-1. 배열 : 타입[] 배열명 = {데이터}; 
		String[] array = {"100", "1oo"};
			// 2-2. 배열 for : index : 0 , length : 1
		for(int i = 0; i<=array.length ; i++) {
			try {
				int value = Integer.parseInt(array[i]);
					// Integer.parseInt(문자열) -> 정수형
					// 예외 발생 : "100" : 100 가능 / "1oo" : 불가능
				System.out.println("array[" + i + "] : " + value);
			}
			catch(NumberFormatException e){
				System.out.println("숫자로 변환할 수 없음 : " + e);
			}
			catch(ArrayIndexOutOfBoundsException e){ 
				System.out.println("인덱스 초과 : " + e);
			}
			catch (Exception e) { // 예외 클래스 중에 최상위 클래스는 가장 아래에 작성
				System.out.println("예외 발생 : " + e);
			}
			/* --------------------------------------------------- */
			// 3. while문
			while(true){
				try {
					Scanner scanner = new Scanner(System.in);
					int ch = scanner.nextInt();
				}
				catch(InputMismatchException e){
					System.out.println("[문자입력시] 잘못된 입력입니다." + e);
				}
				
			}
		}
		
	}
}
