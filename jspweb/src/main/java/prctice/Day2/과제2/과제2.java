package prctice.Day2.과제2;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class 과제2
 */
@WebServlet("/과제2")
public class 과제2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public 과제2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Dto> list = Dao.getInstance().getData();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		String jsonArray = objectMapper.writeValueAsString(list);
		
		System.out.println(list);
		System.out.println(jsonArray);
		
		response.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("application/json");
		response.getWriter().print(jsonArray);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		double data3 = Double.parseDouble(request.getParameter("data3"));
		int data4 = Integer.parseInt(request.getParameter("data4"));
		String data5 = request.getParameter("data5");
		String data6 = request.getParameter("data6");
		boolean data7 = Boolean.parseBoolean(request.getParameter("data7"));
		String data8 = request.getParameter("data8");
		String data9 = request.getParameter("data9");
		
		Dto dto = new Dto(data1, data2, data3, data4, data5, data6, data7, data8, data9);
		
		boolean result = Dao.getInstance().setData(dto);
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(result);
	}

}
