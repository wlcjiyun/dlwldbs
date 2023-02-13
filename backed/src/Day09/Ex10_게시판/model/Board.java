package Day09.Ex10_게시판.model;
/*
	클래스 model 클래스 만들기 -> 모델링
	1. 필드 산정
	2. 모든 필드는 private(권장함)
	3. 생성자 [ 관례적으로 1.깡통 2.풀 ]
	4. 메소드 [ 1.toString 2.getter/setter ]
*/

import java.util.ArrayList;
import java.util.Date;

public class Board { // class S
	
	// 필드
	private String title;
	private String content;
	private String writer;
	private Date date;
	private int view;
	private String password;
	// ArrayList<reply> list = new 
	
	// 생성자
	public Board() {}
	public Board(String title, String content, String writer, Date date, int view, String password) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.view = view;
		this.password = password;
	}
	
	// 메소드
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + ", date=" + date + ", view="
				+ view + ", password=" + password + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
} // class E
