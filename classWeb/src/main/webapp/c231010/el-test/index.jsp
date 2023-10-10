<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%--useBean과 set,getproperty => name에 해당하는 param을 전부 받아온다 
    Expression Language => 표현 언어(${})를 사용한다.
    --%>
    <%-- 
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
	<%=student.getName() %>
	<jsp.getProperty property="name" name="student"/>
	--%>
	${1+3 }<br/>
	${2 eq 2 }<br/>
	${3 > 2 }<br/>
	${3 gt 2 }<br/>
	${3 >= 2 }<br/>
	${3 ge 2 }<br/>
	${2 lt 3 }<br/>
	${2 le 3 }<br/>
	<hr/>
	${true && false }<br/>
	${true and false }<br/>
	${true || false }<br/>
	${true or false }<br/>
	${!true}<br/>
	${not true}<br/>
	${empty null }<br/>
	${empty "" }<br/>

</body>
</html>