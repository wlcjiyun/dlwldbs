package 과제.과제4_싱글톤.controller;

import java.util.ArrayList;

import 과제.과제4_싱글톤.model.Board;

/*
	5. 글 쓰기
		- 인수 : id, title, content				- 반환 : true(성공)/false(실패)
	6. 글 출력
		- 인수 :	X[페이징처리, 검색처리 -> 추후 기능]	- 반환 : 모든 글이 담긴 ArrayList 							
	7. 글 상세보기
		- 인수 : 글 번호							- 반환 : 해당 번호의 Board 하나
		- * 조회수 증가
	8. 글 삭제
		- 인수 : 글 번호							- 반환 : true(성공)/false(실패)
	9. 글 수정
		- 인수 : 글번호, 새로운 제목/내용				- 반환 : true(성공)/false(실패)
	10. 로그아웃 
		- 인수 : X								- 반환 : true(성공)/false(실패)
*/
public class Bcontroller {
	
	// 싱글톤
	private static Bcontroller bc = new Bcontroller();
	private Bcontroller() {} 
	public static Bcontroller getInstance() {return bc;}
	
	private ArrayList<Board> boardDB = new ArrayList<>();
	
	// 5. 글 쓰기 
	public boolean write(String title, String content) {
		// 5-1. 유효성 검사 [ 로그인이 안 되어 있는 겨우 false ] 
		if( Mcontorller.getInstance().LogSession == null ) { return false; }
		// 5-2. DB에 저장
			// 5-2-1. 객체화 [ 글 작성 : 입력받은 데이터 2개, 초기값 0, 로그인 회원 객체 = 글쓴이 ]
			Board board = new Board( title, content, 0, Mcontorller.getInstance().getLogSession() );
			// 5-2-2. DB에 저장
			boardDB.add(board);
			// 5-2-3. 멤버 객체에 내가 쓴 글 등록
			Mcontorller.getInstance().getLogSession().getBoardList().add(board);
			return true;
	}
	
	// 6. 글 출력 
	public ArrayList<Board> getList() {
		// 추후에 페이징처리, 검색처리 등등 로직이 들어갈 예정
		return boardDB;
	}
	
	// 7. 글 상세보기 
	public Board getBoard(int bno) {
		return boardDB.get(bno); // 인수로 전달받은 인덱스의 게시물을 반환
	}
	
	// 8. 글 삭제 
	public boolean delete(int bno) {
		boardDB.remove(bno);
		return true;
	}
	
	// 9. 글 수정 
	public boolean update(int bno, String title, String content) {
		boardDB.get(bno).setTitle(title); 		// 인수로 전달받은 인덱스의 게시물 제목 수정
		boardDB.get(bno).setContent(content); 	// 인수로 전달받은 인덱스의 게시물 내용 수정
		return true;
	}

}
