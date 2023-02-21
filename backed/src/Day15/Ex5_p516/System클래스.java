package Day15.Ex5_p516;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Properties;

public class System클래스 { // class S		// 예외 던지기
	public static void main(String[] args) throws UnsupportedEncodingException { // main S
		
	/*
		밀리초* ->							: 1/1000
			마이크로초 ->						: 1/1,000,000
				나노초* ->					: 1/1,000,000,000
					피코초 ->					: 1/1,000,000,000,000
						펨토초 ->				: 1/1,000,000,000,000,000
							아토초 ->			: 1/1,000,000,000,000,000,000
								젭토초 ->		: 1/1,000,000,000,000,000,000,000
									욕토초 ->	: 1/1,000,000,000,000,000,000,000,000
	*/
		// 1. p_517
		long time1 = System.nanoTime(); // 현재시간을 나노초롤 표현
		System.out.println(time1);
		int sum = 0;
		for(int i =0; i<=1000000; i++) { // 백만 반복(회전) [ * CPU마다 다름 ]
			sum += i++; // i를 sum에 누적 합계 더하기
		}
		long time2 = System.nanoTime();	// 현재시간을 나노초롤 표현
		System.out.println((time2-time1) + "나노초가 소요 되었습니다");
		
		// 2. p_518
		System.out.println("=================================");
		System.out.println("Key :               Value :");
		Properties props = System.getProperties(); // 모든 시스템 속성의 키 호출
		
		for( Object obj : props.keySet() ) { // for S // 시스템 속성들의 키를 반복문 돌림
			System.out.println( (String)obj + "                       " + // 해당 키를 문자열 변환 
								System.getProperty( (String)obj ) ); // 해당 키를 이용한 시스템 속성 정보 호출
		} // for E
		
		// 3. p_520
		String data = "자바"; // 문자열을 저장하고 조작하는 클래스
		
		// 해당 문자열을 바이트열로 변환 -> getBytes()	인코딩 타입 : UTF-8
		byte[] arr1 = data.getBytes(); 
		// 배열의 주소값 출력
		System.out.println(arr1); 
		// 배열 내 데이터 출력 Arrays.toString(배열명)
		System.out.println(Arrays.toString(arr1));
		
		// 문자열 -> 바이트열 변환 getBytes()			인코딩 타입 : EUC_KR
		byte[] arr2 = data.getBytes("EUC_KR");
		System.out.println(Arrays.toString(arr2)); 
		
		// 바이트열 -> 문자열 변환 new String(배열명)
		String str1 = new String(arr1);
		System.out.println(str1);
		
		String str2 = new String(arr2, "EUC-KR");
		System.out.println(str2);
		
	} // main E
} // class E
