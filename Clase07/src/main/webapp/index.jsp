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
	
	<table style="border: 1px solid blue;">
		<tr >
			<th>Header 1</th>
			<th>Header 2</th>
			<th>Header 3</th>
		</tr>
		
		<%
			for (int i =0; i<10;i++){
		%>
		<tr>
			<td>Columna 1 valor <%=i%><td>
			<td>Columna 2 valor <%=i%><td>
			<td>Columna 3 valor <%=i%><td>
		</tr>
		<%
			}
		%>
	</table>
	
</body>
</html>