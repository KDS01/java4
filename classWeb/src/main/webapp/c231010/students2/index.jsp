
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${students[0].name }<br>
	${students[1].name }
	<%-- 존재하는지 확인 순서 => page => request => session => application(ConText,ServletContext) --%>
	${requestScope.error }
	<%--page를 거치지 않고 request에서 직접 뽑아오려면 scope를 명령어를 사용하면 됨
	requestScope, pageScope, sessionScope, applicationScope 
	--%>

		%>
	

</body>
</html>