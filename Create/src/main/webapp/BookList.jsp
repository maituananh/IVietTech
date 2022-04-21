<%@page import="entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body>
	<%
	@SuppressWarnings("unchecked")
	List<Student> students = (List<Student>) request.getAttribute("students");
	for (Student student : students) {
	%>
		<a href="detail?id=<%= student.getId() %>"> <%= student.getName() %> </a>
	<%
	}
	%>

</body>
</html>