<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:useBean id="list" class="java.util.ArrayList" />
    <%
    	list.add("김동선");
    	list.add("권현규");
   
    %>
    
    
    <c:set var="name" value="권원준" /><%--변수로 name을 선언하고 값을 권원준을 부여 --%>
    <c:set var="className" value="${\"java\"}" />
    <c:remove var="className"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom Tags</title>
</head>
<body>
	커스텀 태그 : JSP에서 자바를 더 쓰기 싫어서 만들어짐<br />
	JSTL :Jsp Standard Tage Library
	tomcat 홈페이지 -> taglibs -> 맨 밑에 4개 다운로드<br/>
	${name }
	${className }
	조건문 / if, else, else if, switch, case, default<br/>
	<c:if test="${3> 1 }">
		크다!<br/>
	</c:if>
	<c:if test="${3< 1 }">
		크다!!!<br/>
	</c:if>
	<%--switch => choose// case=>when// otherwise => default --%>
	<hr>
	<c:choose>
		<c:when test="${3<1 }">
		크다!!<br/>
		</c:when>
		<c:when test="${3>6 }">
		크다!!!!!!!!!!!!<br/>
		</c:when>
		<c:otherwise>전부 거짓이야, default<br/></c:otherwise>
	</c:choose>
	반복문 / for, while,forEach<br/>
	<c:forEach var="i" begin="0" end="10" step="2" varStatus="Loop">
		${i } :${Loop.count }<br />
	</c:forEach>
	<c:forEach var="item" items="${list }" varStatus="loop">
		번호 ${loop.count } : ${item }<br/>
	</c:forEach>
	<%--out ==> 그대로 출력해줌(텍스트로써) html형식으로 인식하게 하려면 'escapeXml=false' 태그를 입력하면 html 형식으로 인식함 --%>
	<c:out value="&lt" escapeXml="false">
	</c:out>
	<c:out value="&gt" escapeXml="false">
	</c:out>
	<hr>
	<c:url var="urlTest" value="../c231010/student">
		<c:param name="name" value="테스터"></c:param>
	</c:url>
	<a href="${urlTest }">테스트로 보내자</a>
	<%-- <c:redirect url ="../c231010/student">
		<c:param name="name" value="테스터"></c:param>
	</c:redirect>
	--%>
	

</body>
</html>