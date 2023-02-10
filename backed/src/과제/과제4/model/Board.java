package 과제.과제4.model;

public class Board {
	// 필드
	public String write;
	public String show;
	public String writer;
	public String title;
	public String content;
	public String like;
	
	// 생성자
	public Board() {}
	public Board(String write, String show, String writer, String title, String content, String like) {
		super();
		this.write = write;
		this.show = show;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.like = like;
	}
	
	// 메소드
}
