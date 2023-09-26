package board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Board
 */
@WebServlet("/Board")
public class Board extends HttpServlet {

       
    /**
	 * 
	 */
	private static final long serialVersionUID = -1916906384070651911L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Board() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String html = "<html>";
		html+="<head>";
		html+="<meta charset ='UTF-8' />";
		html+="<title>";
		html+="게시판";
		html+="</title>";
		html+="<body>";
		html+="<form action='BBoard' method='post'>";
		html+="<button>글쓰기</button>";
		html+="<input type='text' name='gitaddress' placeholder='gitaddress' />";
		html+="</form>";
		html+="</ol>";
		html+="</body>";
		html+="</head>";
		System.out.println(html);
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append(html);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
