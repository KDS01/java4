<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Date"%>
    <%--fmt format, ==> 언어 형식 --%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<title>원하는 언어로 즉각적인 적용</title>

</head>
<body>
	<fmt:setLocale value="ko_KR"/><%--현재 언어  --%>
	<%--<fmt:setLocale value="en_US"/>
	<fmt:setLocale value="ja_JP"/>
	<fmt:setLocale value="zh_CN"/>--%>
	<div id="locale" data-locale="ko_KR">
		<div id="name" data-name="test_ko.name">
		
		</div>
		<%--파일의 위치는 WEB-INF/classes/student.properties --%>
	</div>
	<fmt:bundle basename="student">
		<fmt:message key="student.name" /><br>
		<fmt:message key="student.className" /><br>
	</fmt:bundle>
	<%-- <fmt:setLocale value="en_US"/>--%>
	<fmt:setBundle basename="student"/>
	<fmt:message key="student.name" /><br>
	<fmt:message key="student.className" /><br>
	<fmt:formatNumber value="1000" type="number" var="won" />
	${won }
	<fmt:formatNumber value="1000" type="currency" currencySymbol="\\" groupingUsed="true" />
	<c:set var="now" value="<%=new Date() %>" />
	${now }<br>
	<fmt:formatDate value="${now }" type="time" dateStyle="full" timeStyle="full"/><br>
	<fmt:timeZone value="America/New York">
		<fmt:formatDate value="${now }" type="time" dateStyle="full" timeStyle="full"/><br>
		<fmt:formatDate value="${now }" pattern="YYYY / MM / dd -hh :mm :ss"/>
	</fmt:timeZone>
	<button class="btn btn-danger btn-lg" >부트스트랩 테스트</button>
</body>
</html>