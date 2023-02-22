package 과제.과제11;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
	
	// 싱글톤
	private static View view = new View();
	private View() { }
	public static View getInstance() { return view; }
	
	Scanner scanner = new Scanner(System.in);
	
	// 1. 메인페이지
	public void index() {
		
		System.out.println("1.관리자 2.사용자");
		while(true) {
			int check = scanner.nextInt();
			if(check==1) { // 관리자 페이지
				while(true) {
					System.out.println("1.제품등록 2.제품출력 3.제품수정 4.재고수정/변경 5.제품삭제");
					int ch = scanner.nextInt();
					if(ch==1) {registration();}
					else if(ch==2) {list();}
					else if(ch==3) {product_update();}
					else if(ch==4) {stock_update();}
					else if(ch==5) {delete();}
				}
			}
			else if(check==2) { // 사용자 페이지
				while(true) {
					System.out.println("1.제품출력 2.제품선택 3.장바구니 0.결제하기");
					int ch = scanner.nextInt();
					if(ch==1) {list2();}
					else if(ch==2) {product_choose();}
					else if(ch==3) {product_basket();}
					else if(ch==0) {product_payment();}
					/*
					 * 1. 제품 목록
					 * 2. 제품 선택
					 * 3. 장바구니
					 * 4. 결제
					 * 
					*/
				}
			}
		}
		
	}
	
	////////////////////////////////////////////////관리자 페이지//////////////////////////////////////////////
	
	// 2. 제품 등록 ---------------------------------------------------------------------
	public void registration() {
		System.out.println("-----------------제품등록----------------");
		System.out.println("제품명 : ");		String pname = scanner.next();
		System.out.println("제품가격 : ");		int pprice = scanner.nextInt();
		System.out.println("재고 : ");		int pstock = scanner.nextInt();
		
		boolean result = Controller.getInstance().registration(pname, pprice, pstock);
		
		if(result) {System.out.println("제품 등록 성공");}
		else {System.out.println("제품 등록 실패");}
	}
	
	// 2. 모든 제품 출력 ---------------------------------------------------------------------
		public void list() {
			System.out.println("-----------------제품목록----------------");
			System.out.printf("%2s \t %10s \t %10s \n" , "번호", "제품명", "가격", "재고");
			ArrayList<ProductDto> result = Controller.getInstance().list();
			for(ProductDto dto : result) {
				System.out.printf(
							"%2s \t %10s \t %10s \n",  
							dto.getPno(), dto.getPname(), dto.getPprice(), dto.getPstock()
						);
			}
		}
		
	// 3. 제품 수정 ---------------------------------------------------------------------
		public void product_update() {
			System.out.println("-----------------제품수정----------------");
			System.out.println("제품번호 : ");			int pno = scanner.nextInt();
			System.out.println("새로운 제품명 : ");		String pname = scanner.next();
			
			boolean result = Controller.getInstance().product_update(pno, pname);
			
			if(result) {System.out.println("제품 수정 성공");}
			else {System.out.println("제품 수정 실패");}
		}
		
	// 4. 재고 수정 ---------------------------------------------------------------------
		public void stock_update() {
			System.out.println("-----------------재고수정----------------");
			System.out.println("제품번호 : ");			int pno = scanner.nextInt();
			System.out.println("재고 : ");			int pstock = scanner.nextInt();
			
			boolean result = Controller.getInstance().stock_update(pno, pstock);
			
			if(result) {System.out.println("재고 수정 성공");}
			else {System.out.println("재고 수정 실패");}
		}
		
	// 5. 제품 삭제 ---------------------------------------------------------------------
		public void delete() {
			System.out.println("-----------------제품삭제----------------");
			System.out.println("삭제할 제품 번호 : ");	int pno = scanner.nextInt();
			
			boolean result = Controller.getInstance().delete(pno);
			
			if(result) {System.out.println("삭제 성공");}
			else {System.out.println("삭제 실패");}
		}
		
	//////////////////////////////////////////////////////////////////////////////////////////////////////
		
	////////////////////////////////////////////////사용자 페이지//////////////////////////////////////////////
		
	// 1. 제품 목록 ---------------------------------------------------------------------
		public void list2() {
			System.out.println("-----------------제품목록----------------");
			System.out.printf("%2s \t %10s \t %10s \n" , "번호", "제품명", "가격", "상태");
			ArrayList<ProductDto> result = Controller.getInstance().list();
			for(ProductDto dto : result) {
				System.out.printf(
						"%2s \t %10s \t %10s \n", 
						dto.getPno(), dto.getPname(), dto.getPprice()
						);
			}
		}
		
	// 2. 제품 선택 ---------------------------------------------------------------------
		public void product_choose() {
			
		}
	// 3. 장바구니 ---------------------------------------------------------------------
		public void product_basket() {
			// 재고가 있으면 장바구니에 담기
			
		}
	// 4. 결제 ---------------------------------------------------------------------
		public void product_payment() {
			
		}
		
		
		
		
		
		
}
