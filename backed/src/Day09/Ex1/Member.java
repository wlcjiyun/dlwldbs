/*
 	클래스 사용 용도
 	
	1. 라이브러리 : 다른 클래스로부터 사용되는 클래스
		협업에서 쓰이는 디자인 패턴 : M(model) V(view) C(controller)
		
	
	2. 실행 : main 함수를 갖고 있는 클래스
	
	- JVM
	
		메소드역역			VS			스택영역					VS 		힙영역
		
		String				String name; --> 로컬(지역)변수
							String name  --> 로컬(지역)변수		= new String("유재석") --> 인스턴스
							
		클래스(필드)

	- 필드 : 객체의 데이터를 저장하는 곳 ( 로컬(지역)변수와 비슷하지만 사용되는 목적이 다르다 )
		
	-		지역변수			VS			필드
		메소드{}에서 선언				클래스{}에서 선언
		메소드 실행시 존재함				객체를 생성시 존재함
		메소드 내부에서만 사용			객체 내/외부에서 사용
	
	- 초기화	
		직접 초기화 해야 함				객체 생성시 자동으로 초기화함
		 							정수 0 / 실수 0.0 / 논리 false / 참조(클래스, 배열) null
		 							
	- 필드 사용
		객체 내부 : 생성자, 메소드
		객체 외부 : 객체명.필드명
		
	- 
	
*/
package Day09.Ex1;

public class Member { // class S
	
	// 클래스 멤버
		// 1. 필드
		String name; 	// 초기값 null
		int num;		// 0
		double num2;	// 0.0
		boolean num3; 	// false
		String[] array = new String[3];	// null null null
		// 2. 생성자
	
		// 3. 메소드
		void setName() { 
			String inputName; // 로컬(지역)변수 : 초기화를 못함
			System.out.println(name);
			// System.out.println(inputName);
		}
		void getName() {
			
		}
	
} // class E

/*
	클래스 사용 용도
	1. 라이브러리 : 다른 클래스로부터 사용되는 클래스 
		협업에서 사용되는 디자인 패턴 : MVC
		
	2. 실행클래스 : main함수 가지고 있는 클래스 
	
	JVM
	
	메소드영역  	VS	스택영역					VS	힙영역
	String		String name ;	-- 변수
				String name ; 	-- 변수	= 	new String("유재석")	-- 인스턴스(객체)
				
	클래스(필드)	지역변수							객체

	
	- 필드 : 객체의 데이터 저장하는곳 [ 지역변수와 비슷하지만 사용되는 목적 다르다. ] 
	
	-	지역변수			vs			필드 
		메소드 {} 선언					클래스 { } 선언 
		메소드 실행시 존재					객체 생성시 존재
		메소드 {}에서만 사용				객체 내·외부에서 사용 
		
	 - 초기화
	 	직접 초기화						객체 생성시 자동으로 초기화
	 								정수 : 0  실수:0.0 논리:false 참조[클래스,배열]:null
	 - 필드 사용
	 	객체 내부 : 생성자 , 메소드 
	 	객체 외부 : 객체명.필드명
 
*/