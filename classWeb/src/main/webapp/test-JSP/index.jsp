<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="javax.servlet.RequestDispatcher"
    import="java.util.*"
    pageEncoding="UTF-8"
    %>
<%!
	//선언문(<%!) ==> 클래스 자체에 변수를 선언(스크립트릿에 선언 시 메서드 내에서만 동작하는 지역변수로써 선언하게 됨)
	// body 중간에 선언하지 않고,위에서 선언함
	String hobby = "음악듣기";
	public String getHobby(){
		return hobby;
	}
%>

<%
	String name ="송성민";
	getHobby();
	String age = request.getParameter("age");
	Cookie cookie =new Cookie("test","1");
	response.addCookie(cookie);
	application.setAttribute("servletContext", "입니다");
	session.setAttribute("session", "입니다");
	request.setAttribute("num", 3);
	request.setAttribute("name", "김남균");
	request.setAttribute("hobby", "음악 듣기");
	
	//스크립트릿==> 자바를 적는 곳
			//body 내에서 필요하다면 선언하여 사용할 수 있음.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여기가 진짜 테스트</title>
</head>
<body>
	<%@ include file="./table.jsp"%>
	<%=name+"입니다"%>
	<%=Integer.parseInt(age)+ 10%>
	<%=session.getAttribute("session")%>
	<%--표현식 ==> HTML 내에서 자바에 있는 변수를 사용한다 --%>
	<%

	RequestDispatcher  dispatch =request.getRequestDispatcher("./table.jsp");
	dispatch.forward(request, response);
	%>
</body>
</html>