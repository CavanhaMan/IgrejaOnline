<!-- http://localhost:8080/sistema/frontcontroller/ -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="author" content="IgrejaOnLine">
	<title>IgrejaOnLine</title>
	<link rel="icon" href="..\img\cruz2_ico.png">
	<link rel="stylesheet" type="text/css" href="..\css\font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="..\css\jquery-ui.css">
	<link rel="stylesheet" type="text/css" href="..\css\tooltipui.css">
	<link rel="stylesheet" type="text/css" href="..\css\igrejaol.css">
	<script src="..\js\jquery-3.1.0.js"></script>
	<script src="..\js\jquery.mask.js"></script>
	<script src="..\js\igrejaol.js"></script>
	<script src="..\js\jquery-ui.js"></script>
	<meta name="viewport" content="width=device-width,initial-scale=1">
</head>
<body>
	<h1>IGREJA ONLINE</h1>
	<hr>
	<c:choose>
		<c:when test="${usuario != NULL}">
			<h1>Olá ${usuario.nome}</h1>
		<a href="logout">Logout</a>
		<a href="exibeFormCadastroUsuario">Cadastrar novo usuário</a>
		<a href="listarTodos">Listar todos</a>
		</c:when>

		<c:otherwise>
			<c:if test="${erro != NULL}">${erro}</c:if>

			<form action="login" method="post">
				Usuario:<input name="usuario"> Senha:<input name="senha">
				<input type="submit" value="ok">
			</form>
		</c:otherwise>
	</c:choose>

	<br><hr><br>
	<div class="capa">
		<a href="pesquisar.jsp"><img class="imgCapa" id="btpesquisa" src="../img/igreja_local2.png" alt="Pesquisar Igreja" title="Pesquisar Igrejas"></a>
		<a href="calendario.jsp"><img class="imgCapa" id="btcalendario" src="../img/igreja_calendario.png" alt="Ver Calendário" title="Ver Calendário de Atividades"></a>
		<a href="agenda.jsp"><img class="imgCapa" id="btagenda" src="../img/igreja_agenda.png" alt="Ver Agenda" title="Ver Agenda de Programações"></a>
	</div>


</body>
</html>

