package Day20.gallery.view;

import java.util.ArrayList;
import java.util.Scanner;

import Day20.gallery.controller.BController;
import Day20.gallery.controller.MController;
import Day20.gallery.model.Dto.CategoryDto;

public class BoardView {
	private static BoardView boardView = new BoardView();
	private BoardView() {}
	public static BoardView getInstance() { return boardView;}
	
	private Scanner scanner = new Scanner(System.in); 
	
	// 1. 게시물 모든 게시물
	public void index() {
		while( true ) {
			System.out.println(" =============== 이젠 갤러리 ============== ");
			// 최신 게시물 3개 출력
			// 모든 갤러리 출력
			System.out.print(" -1:로그아웃 / 0:갤러리추가 / 이동할 갤러리 번호 선택 :  ");
			int ch = scanner.nextInt();
			if( ch == -1 ) { 
				MController.getInstance().setLoginSession(0); // 로그인세션 초기화 
				System.out.println("[로그아웃] 안녕히 가세요! ");
				break; 
			}
			else if( ch == 0 ) { }
			else if( ch > 0 ) {}
		}
	}
	
	// 2. 카테고리=갤러리 추가
	public void categoryAdd() {
		System.out.println("=============== 갤러리 추가 ==============");
		System.out.println("추가할 갤러리 이름 : ");
		String cname = scanner.nextLine();
		
		boolean result = BController.getInstance().categoryAdd(cname);
		
		if(result) {System.out.println("[성공] 갤러리가 추가 되었습니다");}
		else {System.out.println("[실패] 관리자에게 문의하세요");}
	}
	
	// 3. 모든 카테고리 내 
	public void categoryPrint() {
		ArrayList<CategoryDto> clist = BController.getInstance().categoryPrint();
		
		int count = 0;
		for(CategoryDto dto : clist) {
			System.out.println(dto.getCno() + "-" + dto.getCname() + "\t");
			count++;
			if(count % 4 == 0)System.out.println();
		}
		System.out.println();
	}
}
