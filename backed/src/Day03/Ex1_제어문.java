package Day03;

import java.util.Random;

public class Ex1_제어문 {
	public static void main(String[] args) {
		
		// if형태
			// 1. if(조건식) 실행문; -> 실행문 1개 {} 생략 가능
			// 2. if(조건식) {실행문; 실행문;}
			/* 3. if(조건식){
						true
					}else {
						false
					}*/
			/* 
			  	4. if(조건식){
			  			true
			  		}else if(조건식){
			  			true
			  		}else if(조건식){
			  			false
			  		}
			  
			 */
			/*
			 	5. if 중첩
			 	if(조건식){
			 		if(조건식){
			 			
			 		}else if{
			 		
			 		}
			 	}else{}
			 		
			 
			 
			*/
		
		// 1. if
		int score = 93; // 변수 선언
		if( score >= 90) { // 제어문
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A등급입니다");
		}
		if( score >= 90) 
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B등급입니다");
		
		// 2. if else 
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A등급입니다");
		}else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B등급입니다");
		}
		
		// 3. if else if else ==> true 1개 산출
		if( score >= 90 ) {
			System.out.println("점수가 100~90입니다");
			System.out.println("등급은 A등급입니다");
		}else if(score >=80 ) {
			System.out.println("점수가 80~89입니다");
			System.out.println("등급은 B등급입니다");
		}else if(score >=70 ) {
			System.out.println("점수가 70~79입니다");
			System.out.println("등급은 C등급입니다");
		}else {
			System.out.println("점수가 70미만입니다");
			System.out.println("등급은 D등급입니다");
		}
		
		// 4. 
		 System.out.println(Math.random()); // 0~1사이의 실수 난수
		 System.out.println(Math.random()+1); // 1~2사이의 실수
		 System.out.println((int)Math.random()+1); // 1~2사이의 정수
		 System.out.println((int)Math.random()*6 +1); // 1~6사이의 정수 난수
		
		 // Math : 수학 관련 메소드를 제공하는 클래스
		 // Random : 난수 관력 메소드를 제공하는 클래스
		 
		 Random random = new Random();
		 System.out.println(random.nextInt()); // +-21억 중 하나 : int가 표현할 수 있는 범위 내 난수 생성
		 System.out.println(random.nextInt(3)); // 0~2
		 System.out.println(random.nextInt(6)+1); // 1~6
		 char c1 = (char)(random.nextInt(26)+97); // (강제형변환:char) a~z 문자 난수 생성
		 System.out.println(c1); 
		 char c2 = (char)(random.nextInt(26)+65); // (강제형변환:char) A~Z 문자 난수 생성
		 System.out.println(c2); 
		 
		 int num = (int)(Math.random()*6) + 1;
		 if(num == 1) {
			 System.out.println("1번이 나왔습니다.");
		 }else if(num == 2) {
			 System.out.println("2번이 나왔습니다.");
		 }else if(num == 3) {
			 System.out.println("3번이 나왔습니다.");
		 }else if(num == 4) {
			 System.out.println("4번이 나왔습니다.");
		 }else if(num == 5) {
			 System.out.println("5번이 나왔습니다.");
		 }else {
			 System.out.println("6번이 나왔습니다.");
		 }
		 
		 // 5. 
		 int score2 = (int)(Math.random()*20) + 81;
		 System.out.println("점수 : " + score2);
		
		 // 6. 중첩 if
		 int score3 = (int)(Math.random()*20) + 81; //81~100
		 System.out.println("점수 : " + score3);
		 
		 String  grade;
		 
		 if( score3 >= 90 ){
			if(score3 >= 95){
				grade = "A+";
			}else{ 
				grade = "A";
				} 
		 	}else{
		 		if(score3 >= 85){
		 			grade ="B+";
		 		}else{
		 			grade ="B";
		 		} 
		 	}
		 System.out.println("학점 : " + grade);
		 

		
		
		
		
		
		
		
			
	}
}
