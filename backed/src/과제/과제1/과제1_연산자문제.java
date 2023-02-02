package 과제.과제1;

import java.util.Scanner;

public class 과제1_연산자문제 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*--문제1---------------------------------------------------------*/
		/*
		 * System.out.println("문제1 : 강아지 콘솔 출력"); 
		 * System.out.println(" |\\_/| ");
		 * System.out.println(" |q p| "); 
		 * System.out.println(" ( 0 )\"\"\"\\ ");
		 * System.out.println(" |\"^\"`    | "); 
		 * System.out.println(" ||_/=\\\\__| ");
		 */
		
		/*--문제2---------------------------------------------------------*/
		 /*
		 * System.out.println("문제2 : 입력받은 데이터 3개를 이용한 표 만들기"); 
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.print("이름 : "); String 작성자 = scanner.next(); 
		 * scanner.nextLine(); // 충돌 해결
		 * System.out.print("내용 : "); String 내용 = scanner.nextLine();
		 * System.out.print("날짜 : "); String 날짜 = scanner.next();
		 * 
		 * System.out.printf("---------------------방문록-------------------\n");
		 * System.out.printf("%3s | %6s | %15s | %6s \n" , "번호" , "작성자" , "내용" , "날짜");
		 * System.out.printf("%4d | %6s | %15s | %6s \n" , 1 , 작성자 , 내용 , 날짜);
		 * System.out.println("---------------------------------------------");
		 */
	     
	    /*--문제3---------------------------------------------------------*/
		 /*
		 * System.out.println("문제3 : 급여계산");
		 * 
		 * System.out.println("기본급 : "); int 기본급 = scanner.nextInt();
		 * System.out.println("수당 : "); int 수당 = scanner.nextInt();
		 * 
		 * int 실수령액 = 기본급 + 수당 - (int)(기본급*0.1); // 1 : 100% | 0.1 : 10% // int = int +
		 * int - ( int*double ); ==> 강제타입변환하기 // 0.1 : 자동 기본값 doduble // int * double :
		 * 피연산자 중 더 큰 허용 범위를 결과로 씀 -> double 
		 * System.out.println("실수령액 : " + 실수령액);
		 */
		
		/*--문제4---------------------------------------------------------*/
		 /*
		 * System.out.println("문제4 : 지폐세기");
		 * 
		 * System.out.println("금액 : "); int 금액 = scanner.nextInt(); 
		 * // 십만원권
		 * System.out.println("십만원 : " + (금액/100000) + "장"); 
		 * // 만원권 -> 원금에서 십만원권 제외 금액
		 * -= (금액/100000) * 100000; 
		 * System.out.println("만원 : " + (금액/10000) + "장"); 
		 * // 천원권 -> 원금에서 만원권 제외 금액 -= (금액/10000) * 10000; 
		 * System.out.println("천원 : " + (금액/1000) + "장"); 
		 * // 백원권 -> 원금에서 천원권 제외 
		 * 금액 -= (금액/1000) * 1000;
		 * System.out.println("백원 : " + (금액/100) + "장");
		 */
		
		/*--문제4---------------------------------------------------------*/
		 /*
		 * System.out.println("문제5 : 하나의 정수를 입력받아 7의 배수인지 출력[ 'O' 혹은 'X' 로 출력]");
		 * System.out.println("정수 : "); int 정수 = scanner.nextInt();
		 * System.out.println(정수/7 == 1 ? "O" : "X");
		 */
		
		/*--문제6---------------------------------------------------------*/
		 /*
		 * System.out.println("문제6 : 하나의 정수를 입력받아 홀수 인지 출력 [ 'O' 혹은 'X' 로 출력]");
		 * System.out.println("정수 : "); int 정수 = scanner.nextInt();
		 * System.out.println(정수/2 == 0 ? "O" : "X");
		 */
		
		/*--문제7---------------------------------------------------------*/
		 /*
		 * System.out.println("문제7 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 출력 [ 'O' 혹은 'X' 로 출력 ]");
		 * System.out.println("정수 : "); int 정수 = scanner.nextInt();
		 * System.out.println( 정수/7==0 && 정수/2==0 ? "O" : "X" );
		 */
		
		/*--문제8---------------------------------------------------------*/
		 /*
		 * System.out.println("문제8 : 하나의 정수를 입력받아 7의 배수 이거나 호수 인지 출력 [ 'O' 혹은 'X' 로 출력 ]");
		 * System.out.println("정수 : "); int 정수 = scanner.nextInt();
		 * System.out.println(정수/7==1 || 정수/2==1 ? "O" : "X");
		 */
		
		/*--문제9---------------------------------------------------------*/
		 /*
		 * System.out.println("문제9 : 두개의 정수를 입력받아 더 큰수 출력");
		 * System.out.println("정수1 : "); int 정수1 = scanner.nextInt();
		 * System.out.println("정수2 : "); int 정수2 = scanner.nextInt();
		 * System.out.println(정수1>정수2);
		 */
		/*--문제10---------------------------------------------------------*/
		 /*
		 * System.out.println("문제10 : 반지름을 입력받아 원 넓이 출력하기");
		 * System.out.println("반지름 : "); int 반지름 = scanner.nextInt();
		 * System.out.println("원 넓이 : " + (반지름*반지름)*3.14);
		 */
		
		/*--문제11---------------------------------------------------------*/
		//System.out.println("문제11 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기 ");
		
		/*--문제12---------------------------------------------------------*/
		 /*
		 * System.out.println("문제12 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기");
		 * System.out.println("윗변 : "); int 윗변 = scanner.nextInt();
		 * System.out.println("밑변 : "); int 밑변 = scanner.nextInt();
		 * System.out.println("사다리꼴 넓이 : " + (윗변*밑변)/2);
		 */
		
		/*--문제13---------------------------------------------------------*/
		 /*
		 * System.out.println("문제13: 키를 정수를 입력받아 표준체중 출력하기");
		 * System.out.println("키 : "); int 키 = scanner.nextInt();
		 * System.out.println("표준체중 : " + (키-100)*0.9);
		 */
		
		/*--문제14---------------------------------------------------------*/
		System.out.println("문제14: 키와 몸무게를 입력받아 BMI 출력하기");
		System.out.println("키 : "); int 키 = scanner.nextInt();
		System.out.println("몸무게 : "); int 몸무게 = scanner.nextInt();
		System.out.println("MBI : " + 몸무게/(키/100)*(키/100));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
