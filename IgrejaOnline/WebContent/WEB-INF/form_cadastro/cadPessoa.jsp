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
	<h2>Cadastro de Pessoas</h2>
	<p>Preencha os campos abaixo para cadastrar uma nova pessoa</p>
	<!-- ************** FORMULÁRIO PARA CADASTRO DE PESSOAS ************** -->
	<form class="style1 style2">
		<fieldset>
			<legend>Cadastro de Pessoas</legend>
			<label for="cpf">CPF:</label>
			<input type="text" name="cpf" id="cpf" size="11"/><br /><span id="spcpf"></span>
			<label for="nome">Nome:</label>
			<input type="text" name="nome" id="nome" size="40"/><br /><span id="spnome"></span>
			<label for="email">E-mail:</label>
			<input type="text" name="email" id="email"  size="40"/><br /><span id="sp"></span>
			<label for="endereco">Endereço:</label>
			<input type="text" name="endereco" id="endereco"  size="40"/><br /><span id="spemail"></span>
			<label for="bairro">Bairro:</label>
			<input type="text" name="bairro" id="bairro"  size="40"/><br /><span id="spbairro"></span>
			<label for="telefone">Telefone:</label>
			<input type="text" name="telefone" id="telefone" size="16"/><br /><span id="sptelefone"></span>
			<button type="button" onclick="myFunction()">Submit</button>
		</fieldset>
	</form>
  </body>
</html>