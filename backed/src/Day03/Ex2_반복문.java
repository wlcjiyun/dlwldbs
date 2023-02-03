package Day03;

public class Ex2_반복문 {
	public static void main(String[] args) {
		
		/*
		 * for( 1.초기값 , 2.조건식 , 4. 증감식) { 3. 실행문 }
		 */
		
		// 1. for(반복)문
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		
		for(int i=1; i<=5; i++) {sum = sum + i;}
		
		// 2. 1~10까지 출력
		for(int i=1; i<=10; i++) {
			// i는 1부터 10까지 1씩 증가/반복
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 3. 
		int total = 0;
		for(int i = 1; i<=100; i++) {
			// i는 1부터 100까지 1씩 증가/반복
			System.out.println(i + " ");
			total += i; // sum = sum + i
		}
		System.out.println("\n총 누적합계 : " + total);
		
		// 4. 
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			// x는 0.1부터 1.0까지 0.1씩 증가
			System.out.println(x + " ");
		}
		
		// 5. for문 중첩 : 구구단 예제 
		for(int 단=2; 단<=9; 단++) { // 단
			System.out.println("***" + 단 + "단***");
			for(int 곱=1; 곱<=9; 곱++) { // 곱
				System.out.println("\t곱 : " + 곱);
				System.out.println("\t\t" + 단 + "x" + 곱 + "=" + (단*곱));
			}
		}
		
		// 6. break; : 반복문 탈출 / (!=)return; : 함수종료
		while(true) { // 무한루프
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) { // 만약에 난수가 6이면
				System.out.println("while{}탈출");
				break; // 가장 가까운 반복문 탈출
			}
		}
		
		// 7. p.135
		// for1
		첫번째for : for(char upper = 'A'; upper <= 'Z'; upper++) {
					// 'A' ~ 'Z'까지 문자 하나씩 증가/반복
				System.out.println(upper);
				// for2
				두번째for : for( char lower = 'a'; lower <= 'z'; lower++) {
					System.out.println("\t" + lower);
					if(lower == 'g') {
						// 만약에 소문자 g이면
						//break; // 가장 가까운 반목문 탈출 : for2탈출
						break 첫번째for; // 특정 for문 탈출
					}
				}
			}
		
		// 8. p.136 continue
		forname : for(int i=1; i<=10 ; i++) {
			if(i%2 !=0) { //i가 홀수이면
				//continue; // 가장 가까운 반복문(증감식)으로 이동
				continue forname; // 특정 반복문(증감식)으로 이동
			}
			System.out.println(i + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
