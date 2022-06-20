<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
		<head>
		<meta charset="ISO-8859-1">
		<title>Tabuada</title>
		
		<style>
		button{
		cursor: pointer;
		width: 8em;
		height: 1.5em;
		border-radius: 4px;
		border: none;
		background: #fff;
		color: #222;
		transition: .4s;
		}
		
		button:hover{
		background: Lightgreen;
		color: #fff;
		}
		
		</style>
		
		</head>
	<body style="display: flex; justify-content: center;">
	<div style="display: flex; justify-content: center; background-color: gray; whidth: 10%; border-radius: 1em; padding: 16px">
		<table>
		<%
			List<Integer> resultado = new ArrayList<Integer>();
			Integer numero = (Integer)session.getAttribute("numero");
			Integer valor;
		
			resultado = (ArrayList<Integer>)session.getAttribute("tabuada");
			
			for(Integer n: resultado) {
				valor = resultado.indexOf(n)+1;
		%>
		
			<tr style="font-family: Arial; font-size: 20px; color: white">
			
				<td>
				<%=numero %>
				</td>
				
				<td>
				x
				</td>
				
				<td>
				<%=valor %>
				</td>
				
				<td>
				=
				</td>
				
				<td>
				<%=n %>
				</td>
				
			</tr>
			<%
			}
			%>
			
			<tr>
			<td colspan=4 style="padding: 10px;">
			<a href="index.html"><button>Inicio</button></a>
			</td>
			</tr>
			
		
		</table>
	</div>
</body>
</html>