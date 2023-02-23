package Day17;

import java.util.Calendar;
import java.util.Scanner;

public class Ex3_달력 { // class S
	public static void main(String[] args) { // main S
		
		// * 1. static 멤버는 인스턴스 멤버 호출 불가함
			// * 1-1. (해당 메소드나 필드가 static멤버이면) run메소드도 정적멤버로 하자
			run2();
			// * 1-2. (해당 멤버가 인스턴스멤버) 객체 만들어서 메소드 호출하자
			Ex3_달력 ex3_달력 = new Ex3_달력();
			ex3_달력.run();
		
	} // main E
	
	// 1. 달력 함수
	static void run2() {}
	void run() {
		
		// 1-1. 현재 날짜
		Calendar cal = Calendar.getInstance();
		// 1-2. 현재 연도
		int year = cal.get(Calendar.YEAR);
		// 1-3. 현재 월
		int month = cal.get(Calendar.MONTH)+1;
		// 1-4. 현재 일
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) { // while S
		
			System.out.printf("\n==================== %d 년 %d 월 ==================\n", year, month);
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			// **** 1. 현재 월의 1일 날짜 요일
			cal.set(year, month-1, 1); // 캘린더 날짜 수정 : 현재 연도, 월의 1일 날짜 형식으로 변경
			int sweek = cal.get(Calendar.DAY_OF_WEEK); // 2023-02-01의 요일 구함
			// **** 2. 현재 월의 마지막 일 
			int eday = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 2023-02월의 일 수 의 최대 수 = 마지막 일 구하기
			
			// 1-5. 출력
			// **** 3. 해당 월 1일 전까지 공백으로 채우기
			for(int i = 1; i<sweek; i++) { System.out.print("\t"); }
			// *
			for(int i = 1; i<=eday; i++) {
				System.out.printf("%d \t", i);
				if(sweek % 7 == 0) {System.out.println();} // 토요일마다 줄바꿈 처리
				sweek++; // 요일 증가
			}
			
			System.out.println("\n======================================================");
			System.out.println("1.이전 달 2.다음 달 3.검색 : ");
			int ch = scanner.nextInt();
			if(ch == 1) {
				month--;
				if(month < 1) {month = 12; year--;}
			}
			if(ch == 2) {
				month++;
				if(month > 12) {month = 1; year++;}
			}
			if(ch == 3) {
				System.out.println("연도 : ");	int inputY = scanner.nextInt();
				System.out.println("월 : ");		int inputM = scanner.nextInt();
				
				// 정상 범위 입력이면
				if(inputY >= 1900 && inputY <= 9999 && inputM >= 1 && inputM <=12) {
					year = inputY;
					month = inputM;
				}else { // 아니면
					System.out.println(" *** 출력할 수 없는 달력입니다 ***");
				}
				
			}
		} // while E
	}
	
} // class E
