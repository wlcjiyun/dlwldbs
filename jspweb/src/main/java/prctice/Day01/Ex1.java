package prctice.Day01;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class indextest
 */
@WebServlet("/Ex1")
public class Ex1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		
		// 1. DAO 실행해서 데이터 호출
		ArrayList<String> result = Dao.getInstance().getData();
		
		// 2 확인
		System.out.println("확인 : " + result);
		
		// 3. JS에게 응답
		response.getWriter().print(result);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 한글 인코딩
			// 0-1. 요청 인코딩 변경 : request.setCharacterEncoding("UTF-8");
			// 0-2. 응답 인코딩 변경 : response.setCharacterEncoding("UTF-8");
		
		// 1. HTTP 객체 [ request : JS에게 요청 , response : JS에게 응답
			// 1-1. request.getParameter("매개변수명");
			// 1-2. response.getWriter().print(데이터);
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		
		String data = request.getParameter("data"); 
		System.out.println("JS POST 방식으로 받은 데이터 : " + data);
		
		// 1. DB 연동 후 요청된 데이터를 DAO에게 전달 후 결과를 result에 저장
		boolean result = Dao.getInstance().setData(data);
		
		response.getWriter().print("POST 메소드 방식으로 잘 받았습니다" + result);
	}

}
