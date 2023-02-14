package 과제.과제4_싱글톤.controller;

import java.util.ArrayList;

import Day09.Ex10_게시판.model.Board;

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
	
	// 5. 글 쓰기 
	public boolean write(String title, String content) {
		return true;
	}
	
	// 6. 글 출력 
	public ArrayList<Board> getList() {
		return null;
	}
	
	// 7. 글 상세보기 
	public Board getBoard(int bno) {
		return null;
	}
	
	// 8. 글 삭제 
	public boolean delete(int bno) {
		return true;
	}
	
	// 9. 글 수정 
	public boolean update(int bno, String title, String content) {
		return true;
	}
	
}
