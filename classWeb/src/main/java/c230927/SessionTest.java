package c230927;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest
 */
@WebServlet("/SessionTest")
public class SessionTest extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7274483572218170364L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public SessionTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession();
//		session.invalidate();//세션을 즉시 삭제 
		
		response.getWriter().print(session.getId() +"<br />");
		response.getWriter().print(session.getCreationTime() +"<br />");
		response.getWriter().print(session.getMaxInactiveInterval() +"<br />");
		response.getWriter().print(session.getLastAccessedTime() +"<br />");
		response.getWriter().print(session.getAttribute("test-session") +"<br />");
		session.setMaxInactiveInterval(10);
		session.setAttribute("test-session", "ㅎㅇ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
