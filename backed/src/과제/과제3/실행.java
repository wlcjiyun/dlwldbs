package 과제.과제3;

import java.util.ArrayList;
import java.util.Scanner;

import Day07.Ex4.Member;

public class 실행 { // class S
	public static void main(String[] args) { // main S
		
		Scanner scanner = new Scanner(System.in); //입력 객체
		
		ArrayList<book> bookList = new ArrayList<>();
		
		while(true) { // while S
			
			// 출력 	:	배열명[인덱스] vs 리스트명.get(인덱스)
			System.out.println("---------------Ezen도서관--------------");
			System.out.println("번호\t대여여부\t도서장르\t도서명");
			for(int i = 0; i<bookList.size(); i++) { // i는 0부터 리스내 마지막 인덱스까지 1씩 증가
				System.out.println( i + "\t" + 
									(bookList.get(i).state ? "가능" : "불가능") + "\t" + 
									 bookList.get(i).genre + "\t" + 
									 bookList.get(i).name);
			}
			System.out.println("1.대여 2.반납 3.등록");
			int ch = scanner.nextInt();
			if(ch==1) { // if S
				System.out.println("-----------------대여---------------");
				System.out.println("대여할 도서번호 : "); int booknum = scanner.nextInt();
				if( bookList.get(booknum).state == true) { // 만약에 입력한 도서인덱스의 상태가 true이면 가능하다
					System.out.println("[알림]대여완료");
					bookList.get(booknum).state = false; // 대여중으롷 변경
				}else {
					System.out.println("[알림]대여중인 도서입니다");
				}
				
			}// if E
			else if(ch==2) {
				System.out.println("-----------------반납---------------");
				System.out.println("반납할 도서번호 : "); int booknum = scanner.nextInt();
				if(bookList.get(booknum).state == false) { // 만약에 입력한 도서인덱스의 상태가 false이면 반납가능함
					System.out.println("[알림]반납완료");
					bookList.get(booknum).state = true; // 대여가능읋 변
				}else {
					System.out.println("[알림]대여한 도서가 아닙니다");
				}
			}
			else if(ch==3) {
				System.out.println("-----------------등록---------------");
				// 1. 입력받기 -> 변수 3개
				System.out.println("도서명 : ");	String inputName = scanner.next();
				System.out.println("장르 : "); 	String inputGenre = scanner.next();
												boolean basicState = true;
				// 2. 서로 다른 자료형의 변수들을 하나의 자료형으로 만들자 -> 클래스
				book book = new book();
				book.name = inputName;
				book.genre = inputGenre;
				book.state = basicState;
				bookList.add(book);
				
				// 3. 배열 or 리스트에 저장하기
				
			}
			else {
				System.out.println("-----------------그 외---------------");
			}
		} // while E
		
	} // main E
} // class E
