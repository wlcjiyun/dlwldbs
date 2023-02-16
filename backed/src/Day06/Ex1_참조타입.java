package Day06;

public class Ex1_참조타입 { // class S
	public static void main(String[] args) { // main S
		
		// 1. p_148
		int[] arr1;		// int형 배열 선언( 스택 영역에 변수 만들기 )
		int[] arr2;		// int형 배열 선언( 스택 영역에 변수 만들기 )
		int[] arr3; 	// int형 배열 선언( 스택 영역에 변수 만들기 )
		
		arr1 = new int[] { 1, 2, 3 }; // 힙 영역에 '1', '2', '3' 메모리 3개 
		arr2 = new int[] { 1, 2, 3 }; // 배열은 첫 번째 메모리('1') 주소를 스택 영역에 대입
		arr3 = arr2;					// arr2가 갖고 있던 메모리 주소를 arr3에 대입
		
		System.out.println( arr1 == arr2 ); // == 스택영역의 주소 비교
		System.out.println( arr2 == arr3 ); 
		
		// 2. p_151
		int[] inArray = null;	// int형 배열 선언( 스택 영역에 변수 만들기 )
			// inArray[0] = 10;	-> 오류발생 : 힙 영역이 없기에 저장 불가
		
		String str = null; 
			// System.out.println( str.length() ); -> 오류발생 : 힙 영역이 없기에 길이 불가
		
		// 3. p_153
		String hobby = "여행"; // 스택 영역에 hobby 이름으로 변수 선언하고 "여행" 힙의 메모리 주소 저장
		hobby = null; 			// hobby 변수의 null 변경하면 힙에 있던 "여행" 메모리 제거
		
		String kind1 = "자동차"; 			// '자동차' 힙의 메모리 32번지를 스택 영역의 kind1에 저장
		String kind2 = kind1; 			// kind1이 갖고 있던 32번지 kind2에게 대입
		kind1 = null;					// kind1 번지 지우기(null)
		System.out.println( kind2 );
		
	} // main E
} // class E
