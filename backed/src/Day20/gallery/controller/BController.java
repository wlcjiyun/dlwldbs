package Day20.gallery.controller;

import java.util.ArrayList;

import Day20.gallery.model.Dao.BoardDao;
import Day20.gallery.model.Dto.CategoryDto;

public class BController {
	private static BController BController = new BController();
	private BController() {}
	public static BController getInstance() { return BController;}
	
	// 1. 카테고리 추가 기능 처리
	public boolean categoryAdd(String cname) {
		return BoardDao.getInstance().categoryAdd(cname);
	}
	// 2. 모든 카테고리 호출 처리
	public ArrayList<CategoryDto> categoryPrint(){
		return BoardDao.getInstance().categoryPrint();
	}
}