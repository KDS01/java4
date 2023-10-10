package c230927;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetServletContext
 */
@WebServlet("/GetServletContext")
public class GetServletContext extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 488973660667296922L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public GetServletContext() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		ServletContext context =getServletContext();
		List testArr=(ArrayList)context.getAttribute("testArr");
		InputStream is =context.getResourceAsStream("/WEB-INF/bin/test.txt");//경로상에 있는 파일을 인풋스트림으로 가져와라
		BufferedReader br =new BufferedReader(new InputStreamReader(is));//데이터는 스트림으로 받아오고, 이를 버퍼드리더에 넣어서 더 빠르게 처리할 수 있게 재정의
		StringTokenizer st= new StringTokenizer(br.readLine(),","); // =>readline이 입력한 ","를 단위로 데이터를 끊어서 받아옴
		response.getWriter().print(context.getAttribute("test")+"<br />");
		response.getWriter().print(testArr.get(0) +"<br />");
		response.getWriter().print(testArr.get(1) +"<br />");
		response.getWriter().print(context.getInitParameter("test_xml")+"<br />");
		response.getWriter().print(br.readLine()+"<br />");
		response.getWriter().print(st.nextToken()+"<br />");
		response.getWriter().print(st.nextToken()+"<br />");

//		response.getWriter().print(context.getAttribute("test"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
