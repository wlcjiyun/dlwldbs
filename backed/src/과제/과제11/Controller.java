package 과제.과제11;

import java.util.ArrayList;

public class Controller {
	
	// 싱글톤
	private static Controller con = new Controller();
	private Controller() {}
	public static Controller getInstance() { return con; }
	
	// 1. 제품등록 -----------------------------------------------------------------
	public boolean registration(String pname, int pprice, int pstock) {
		ProductDto dto = new ProductDto(0, pname, pprice, pstock);
		boolean result = ProductDao.getInstance().registration(dto);
		return true;
	}
	
	// 2. 제품목록 -----------------------------------------------------------------
	public ArrayList<ProductDto> list() {
		ArrayList<ProductDto> result = ProductDao.getInstance().list();
		return result;
	}
	
	// 3. 제품수정 -----------------------------------------------------------------
	public boolean product_update(int pno, String pname) {
		return ProductDao.getInstance().product_update(pno, pname);
	}
	
	// 4. 재고수정 -----------------------------------------------------------------
	public boolean stock_update(int pno, int pstock) {
		return ProductDao.getInstance().stock_update(pno, pstock);
	}
	
	// 5. 제품삭제 -----------------------------------------------------------------
	public boolean delete(int pno) {
		return ProductDao.getInstance().delete(pno);
	}
}
