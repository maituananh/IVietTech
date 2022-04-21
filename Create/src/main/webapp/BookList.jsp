<%@page import="entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="Pages/MasterPage/Header.jsp"%>

<%
@SuppressWarnings("unchecked")
List<Student> students = (List<Student>) request.getAttribute("students");
for (Student student : students) {
%>
<a href="detail?id=<%=student.getId()%>"> <%=student.getName()%>
</a>
<%
}
%>


<%@ include file="Pages/MasterPage/Footer.jsp"%>