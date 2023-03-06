package prctice.Day03;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class ProductBoard
 */
@WebServlet("/ProductBoard")
public class ProductBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ProductBoard() {
        super();
    }
	// 1. 등록
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// 한글 인코딩
    	request.setCharacterEncoding("UTF-8");
    	
    	String pname = request.getParameter("pname");
    	String pprice = request.getParameter("pprice");
    	
    	ProductDto productDto = new ProductDto(pname, 0);
    	
    	boolean result = ProductDao.getInstance().onproduct(productDto);
    	
    	response.getWriter().print(result);
    	
	}
    
    // 2. 출력
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		
		ArrayList<ProductDto> result = ProductDao.getInstance().onprolist();
		
		ObjectMapper mapper = new ObjectMapper();
		
		String jsonArray = mapper.writeValueAsString( result );
		
		response.setContentType("application/json");
		response.getWriter().print(jsonArray);
	}

	// 3. 삭제
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int pno = Integer.parseInt( request.getParameter("pno") );
		
		boolean result = ProductDao.getInstance().onproDelete(pno);
		// 3. Dao에서 얻은 결과를 응답
		response.getWriter().print(result);
	}
	
	// 4. 수정
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		int pno = Integer.parseInt( request.getParameter("pno") );
		
		String newPname = request.getParameter("newPname");
		int newPprice = Integer.parseInt(request.getParameter("newPprice"));

		boolean result = ProductDao.getInstance().onproUpdate(pno, newPname, newPprice);

		response.getWriter().print(result);
	}
}
