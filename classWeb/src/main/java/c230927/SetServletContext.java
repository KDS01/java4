package c230927;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetServletContext
 */
@WebServlet("/SetServletContext")
public class SetServletContext extends HttpServlet {

       
    /**
	 * 
	 */
	private static final long serialVersionUID = -5651467283318530893L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public SetServletContext() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context =getServletContext();
		response.setContentType("text/html;charset=utf-8");
		List testArr = new ArrayList();
		testArr.add("추가");
		testArr.add("아무거나");
		testArr.add(123);
		context.setAttribute("testArr", testArr);
		context.setAttribute("test", "abc,defg");
		
		response.getWriter().print("입력 완료");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
