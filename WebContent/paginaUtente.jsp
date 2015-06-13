<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

<!-- Bootstrap core CSS -->
<link href="ubuntu/bootstrap.min.css" rel="stylesheet">
<title>Pagina personale</title>
</head>
<body>
	<f:view><%@ include file="standard-header.jsp"%></f:view>

	<h2>Ciao ${loginController.utenteCorrente.nome},</h2>
	<h3>Questi sono i tuoi dati di registrazione:</h3>
	<div>
		<strong>Nome: </strong> ${loginController.utenteCorrente.nome}
	</div>
	<div>
		<strong>Cognome: </strong> ${loginController.utenteCorrente.cognome}
	</div>
	<div>
		<strong>Email: </strong> ${loginController.utenteCorrente.email}
	</div>
	<div>
		<strong>Data di nascita: </strong>
		${loginController.utenteCorrente.dataNascita}
	</div>

	<p>
	<p>
	<h4>Operazioni disponibili</h4>
	<p>
	<p>
		<button type="button" class="btn btn-primary"
			onclick="location.href='faces/ordini.jsp'">I miei ordini</button>
		<button type="button" class="btn btn-primary"
			onclick="location.href='index.jsp'">Torna alla homepage</button>
	<p>
	<p>
</body>
</html>