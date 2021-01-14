<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Principal</title>
</head>
<body>
	<h1>Mi primer pagina JSP</h1>
	
	<div>
		<form action="Ingreso" method="post">
		<label>
			Descripcion
			<input type="text" name= "descripcion" required>
		</label>
		<label>
			Clave
			<input type="password" name = "clave" required>
		</label>
		
		<button>Enviar</button>
		
		</form>
	
	</div>
	
	<%
		String error =(String) request.getAttribute("error");
		if (null!=error && !error.isEmpty()){
	%>
	<h1 style="color: red;"><%=error %></h1>
	<% }%>
	
</body>
</html>