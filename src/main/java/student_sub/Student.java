package student_sub;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import c230926_student.studentDAO;
import c230926_student.studentVO;

/**
 * Servlet implementation class Student
 */
@WebServlet("/student")
public class Student extends HttpServlet {

       
    /**
	 * 
	 */
	private static final long serialVersionUID = 134037935343500382L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		studentDAO dao = new studentDAO();
		List<studentVO> list = dao.getList();
		studentVO studentid=null;
		if(request.getParameter("id")!=null) {
			 dao.getStudentId(Integer.parseInt(request.getParameter("id")));
		}
		else {
			
		}
		System.out.println(list.size());
		String html = "<html>";
		html+="<head>";
		html+="<meta charset ='UTF-8' />";
		html+="<title>";
		html+="학생목록";
		html+="</title>";
		html+="<body>";
		html+="<form action='student' method='post'>";
		html+="<input type='text' name='nickname' placeholder='ID' />";
		html+="<input type='text' name='password' placeholder='PASSWORD' />";
		html+="<button>로그인</button>";
		html+="</form>";
		if(studentid ==null) {
			html+="<form action='student' method='post'>";
			html+="<input type='text' name='nickname' placeholder='ID' />";
			html+="<input type='text' name='password' placeholder='PASSWORD' />";
			html+="<button>로그인</button>";
			html+="</form>";
		}
		else {
			html+="<div>";
			html+=studentid.getName() +"님 어서오세요";
			html+="</div>";
			
		}
		html+="<ol>";
		for(int i =0; i<list.size(); i++) {
			html+="<li>";
			html+= list.get(i).getName();
			html+="</li>";
		}
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
		studentDAO dao = new studentDAO();
		// TODO Auto-generated method stub
		String studentnickname=request.getParameter("nickname");
		studentVO temp=dao.getStudentID(studentnickname);
		if(temp!=null&&temp.getStudentPw().equals(request.getParameter("password")))
			response.sendRedirect("student"+"?id="+temp.getId());
		else
			response.sendRedirect("student");
		
		
		
		
		
	}

}
