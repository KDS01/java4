package student_sub;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import c230926_student.studentDAO;
import c230926_student.studentVO;

/**
 * Servlet implementation class student_membership
 */
@WebServlet("/student_membership")
public class student_membership extends HttpServlet {
	
       
    /**
	 * 
	 */
	private static final long serialVersionUID = -6800177432909265453L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public student_membership() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		studentDAO dao = new studentDAO();
		List<studentVO> list = dao.getList();
		studentVO vo=new studentVO(
				10,
				request.getParameter("name"),
				request.getParameter("nickname"),
				request.getParameter("password"),
				Integer.parseInt(request.getParameter("age")),
				request.getParameter("gitaddress")
				);
		response.
		String html = "<html>";
		html+="<head>";
		html+="<meta charset ='UTF-8' />";
		html+="<title>";
		html+="회원가입";
		html+="</title>";
		html+="<body>";
		html+="<form action='student' method='post'>";
		html+="가입할 아이디를 입력하세요";
		html+="<input type='text' name='nickname' placeholder='ID' />";
		html+="비밀번호를 입력하세요";
		html+="<input type='password' name='password' placeholder='PASSWORD' />";
		html+="이름을 입력하세요";
		html+="<input type='text' name='name' placeholder='name' />";
		html+="나이를 입력하세요";
		html+="<input type='text' name='age' placeholder='age' />";
		html+="깃 주소를 입력하세요";
		html+="<input type='text' name='gitaddress' placeholder='gitaddress' />";
		html+="<button>확인</button>";
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
