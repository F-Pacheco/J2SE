<%@page import="com.curso.educacionIt.Entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>BIENVENIDO</h1>
	<%
		Usuario user = (Usuario) request.getAttribute("usuario");
		out.print(user.getDescripcion().toUpperCase());
		
		
	%>
</body>
</html>