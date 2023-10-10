<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
    import="c231006.StudentBean"%>
<%-- ><jsp:useBean id="student" class="c231006.StudentBean" />--%>
<%-- <jsp:setProperty property="student" name="*"/>--%>
<jsp:useBean id="students" class="java.util.ArrayList" scope="page" />
<jsp:useBean id="students2" class="java.util.ArrayList" scope="page" />
<jsp:useBean id="studentsMap" class="java.util.HashMap" scope="page" />
<jsp:useBean id="studentsMap2" class="java.util.HashMap" scope="page" />
<%
	students.add(new StudentBean("한상윤"));
	students.add(new StudentBean("김남균"));
	request.setAttribute("students", students);
	request.setAttribute("error", false);
	studentsMap.put("students", students);
	studentsMap.put("error", false);
	request.setAttribute("students", studentsMap);
	students2.add(new StudentBean("김남균"));
	students2.add(new StudentBean("이민규"));
	studentsMap2.put("students", students2);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--${empty student }--%>
	${empty students }
	<%--<%=request.getParameter("name")--%>
	<%-- ${student.name }student에게서 name의 파라미터를 뽑아와달라 --%>
	${students[0].name }<%--students에게서 length 파라미터를 뽑아와라 --%>>
	<jsp:forward page="../students2/index.jsp" />
</body>
</html>