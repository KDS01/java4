package suvletTest;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//HttpServlet : HTTP 기능을 갖고있는 클래스.
	//HTTP서블릿은 제네릭서블릿을 상속한다.
//GenericServlet : 공통된 서블릿
	//제네릭 서블릿은 서블릿과 서블릿콘픽을 상속한다
//Servlet : 서블릿 기본 메서드를 포함
//ServletConfig : 서블릿 기본 기능을 포함
public class FirstServ extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7974159243271125632L;
	@Override
	public void init() throws ServletException  {// 서블릿은 자체적인 엑셉션을 갖고 있으므로, 일반적인 엑셉션이 아닌 본인만의 엑셉션을 가진다.
		System.out.println("요청 받아서 컨테이너 세팅");
	}
	@Override
	public void destroy() {// => 요청 종료시 close를 쓰지만, 서블릿에서는 다시 사용할 수 없게 박살낸다는 뜻으로 destroy를 쓴다.
		System.out.println("컨테이너 종료시 삭제");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		// get은 protected를 사용한다. //doGet, doPut 등등은 내부에 매개변수를 받아야 함
		// 여기서는 IOException(입력,출력 오류 또한 던져줘야 한다)
		System.out.println("Get 받았음");
	}
	
	//TOmCAt과 JAVA를 연결하는 방법은 lib 폴더의 web.xml을 사용
	
	
	
	

}
