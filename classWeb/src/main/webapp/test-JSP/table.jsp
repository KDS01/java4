<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
    <%
    String name1 =(String)request.getAttribute("name");
    String hobby1 =(String)request.getAttribute("hobby");
    Integer num1 =(Integer)request.getAttribute("num");
	%>
<table>
	<tr>
		<th><%=num1 %></th>
		<th><%=name1 %></th>
		<th><%=hobby1 %></th>
	</tr>
</table>