package Day09.Ex10_게시판.controller;

import java.util.ArrayList;
import java.util.Date;

import Day09.Ex10_게시판.model.Board;

public class BController {
	
	// 1. 싱글톤 객체 
		private static BController bc = new BController();
		private BController() {}
		public static BController getInstance() {
			return bc;
		}
		
		// 필드 
		private ArrayList<Board> boardDb = new ArrayList<>();
		
		// 2. 쓰기 처리 함수 
		public boolean write( String title , String content , 
				String writer , String password , 
				Date date , int view  ) {
			// 1. 유효섬검사 [ 생략 ]
			// 2. 저장[ DB 대신 리스트 ]
				// 2-1. 객체화[ ]
				Board board = new Board(title, content, writer, 
										password, date, view);
				// 2-2. 객체를 리스트 담기 
				boardDb.add(board);
			// 3. 결과 반환
			return true;
		}
		// 3. 모든 게시물 출력 처리 함수 
		public ArrayList<Board> print() {
			// 유효성검사 [ 생략 ] 검색,페이징처리 
			return boardDb;
		}
		
		// 4. 특정 게시물 출력 처리 함수
		public Board view(int bno) {
			// 1. 조회수 올리기[ 객체명.set필드명(객체명.set필드명()+1); ]
			boardDb.get(bno).setView(boardDb.get(bno).getView()+1);
			return boardDb.get(bno);
		}
}
