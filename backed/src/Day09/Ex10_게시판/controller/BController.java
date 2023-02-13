package Day09.Ex10_게시판.controller;

public class BController {
	
	// 1. 싱글톤 객체
	private static BController bc = new BController();
	private BController() {}
	public static BController getInstance() {
		return bc;
	}
	
}
