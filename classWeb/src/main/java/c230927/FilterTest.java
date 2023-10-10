package c230927;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class FilterTest
 */
@WebFilter({"/api"})
public class FilterTest extends HttpFilter implements Filter {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = -4904157687242638647L;

	/**
     * @see HttpFilter#HttpFilter()
     */
    public FilterTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		 //place your code here

		// pass the request along the filter chain
		HttpSession session =((HttpServletRequest)request).getSession();
		//<= 세션과 request의 타입이 다르므로, 형변환을 해 줄 필요가 있다. 
		session.setAttribute("testing", "테스트중");
		response.getWriter().print("<html><head><meta charset ='utf-8'></head><body><h1>");
		chain.doFilter(request, response);   
		response.getWriter().print("</h1></body></html>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
