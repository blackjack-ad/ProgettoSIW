<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>descrizioneProdotto</title>


<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"
	type="text/javascript"></script>

<!-- Bootstrap core CSS -->
<link href="ubuntu/bootstrap.min.css" rel="stylesheet">

<link
	href='http://fonts.googleapis.com/css?family=Josefin+Sans:400,700,100italic'
	rel='stylesheet' type='text/css'>

</head>
<body>
	<f:view>
		<%@ include file="standard-header.jsp"%>
		<h2>${descrizioneProdottoController2.descrizioneProdotto.nome}</h2>
		<h3>Dettagli Prodotto:</h3>
		<p>
		<p>
		<div>
			<Strong>Prezzo</Strong>:
			${descrizioneProdottoController2.descrizioneProdotto.prezzo}
		</div>
		<div>
			<strong>Descrizione:</strong>
			${descrizioneProdottoController2.descrizioneProdotto.descrizione}
		</div>
		<p>
		<p>
		<p>
			<h:form>
				<h4>
					Torna al
					<h:commandLink
						action="#{descrizioneProdottoController2.listDescrizioneProdotti}"
						value="catalogo" />
				</h4>
			</h:form>
	</f:view>
</body>
</html>