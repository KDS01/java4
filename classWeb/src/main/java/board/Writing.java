package board;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Writing
 */
@WebServlet("/Writing")
public class Writing extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6846532986422475823L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Writing() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		WriterDAO dao=new WriterDAO();
		String html = "<html>";
		html+="<head>";
		html+="<meta charset ='UTF-8' />";
		html+="<title>";
		html+="글쓰기";
		html+="</title>";
		html+="<body>";
		html+="<form action='BBoard' method='post'>";
		html+="<input type='text' name='title' placeholder='글쓴이' />";
		html+="<input type='text' name='writer' placeholder='작성자 입력' />";
		html+="<textarea name='contents' placeholder='여기에 내용을 입력하세요'>";
		html+="</textarea>";
		html+="<button type ='submit'>작성완료</button>";
		html+="</form>";
		html+="</body>";
		html+="</head>";
		System.out.println(html);
		String title=request.getParameter("title");
		String content=request.getParameter("contents");
		String writer=request.getParameter("writer");
		try {
			dao.insert(title, content, writer);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append(html);
//		if(request.getParameter("title")!=null&&
//				request.getParameter("contents")!=null&&
//				request.getParameter("writer")!=null
//				) {
//				"insert into BBorad('title','contents','writer)" 
//				   + "VALUES("+request.getParameter("title")+","+request.getParameter("contents")+","+request.getParameter("writer")+")";
//		}
//		else {
			
		}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


}
