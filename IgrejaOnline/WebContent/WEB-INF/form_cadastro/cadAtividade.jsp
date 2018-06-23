<!DOCTYPE html>
<html>
  <head>
	<meta charset="utf-8">
	<meta name="author" content="IgrejaOnLine">
	<title>IgrejaOnLine</title>
	<link rel="icon" href="img\cruz2_ico.png">
	<!--link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"-->
	<link rel="stylesheet" type="text/css" href="..\css\font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="..\css\jquery-ui.css">
	<link rel="stylesheet" type="text/css" href="..\css\tooltipui.css">
	<link rel="stylesheet" type="text/css" href="..\css\igrejaol.css">
	<link rel="stylesheet" type="text/css" href="..\css\cadastro.css">
	<script src="..\js\jquery-3.1.0.js"></script>
	<script src="..\js\jquery.mask.js"></script>
	<script src="..\js\igrejaol.js"></script>
	<script src="..\js\jquery-ui.js"></script>
	<script src="..\js\cadastro.js"></script>
	<meta name="viewport" content="width=device-width,initial-scale=1">
  </head>
  <body>
	<h2>Cadastro de Atividades</h2>
	<p>Preencha os campos abaixo para cadastrar uma nova atividade no Calendário</p>
	<!-- ************** FORMULÁRIO PARA ENTRADA DO CALENDÁRIO DE ATIVIDADES ************** -->
	<form class="style1 style2">
		<fieldset>
			<legend>Nova Atividade</legend>
			<label for="titulo">Título:</label>
			<input type="text" name="titulo" id="titulo" size="40"/><br /><span id="sptitulo"></span>
			<label for="local">Local:</label>
			<input type="text" name="local" id="local"  size="40"/><br /><span id="splocal"></span>
			<label for="data">Data:</label>
			<input type="text" name="data" id="data"  size="8"/><br /><span id="spdata"></span>
			<label for="hora">Hora:</label>
			<input type="text" name="hora" id="hora" size="8"/><br /><span id="sphora"></span>
			<button type="button" onclick="myFunction()">Submit</button>
		</fieldset>
	</form>
	<script>
		$("#data").mask("00/00/00");
		$("#hora").mask("00:00");
	</script>
  </body>
</html>