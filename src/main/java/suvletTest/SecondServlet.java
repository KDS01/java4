package suvletTest;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SecondServlet extends HttpServlet {
	
	public void init() throws ServletException {
		System.out.println("두번째 컨테이너가 생성됨");
	}
	public void destroy() {
		System.out.println("두번째 컨테이너가 삭제됨");
	}
	protected void doGet(HttpServletRequest rqs, HttpServletResponse res) throws ServletException,IOException {
		System.out.println("두번째 컨테이너도 요청 받았음");
	}
	

}
