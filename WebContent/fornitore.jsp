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
<title>Conferma inserimento fornitore</title>
</head>
<body>
	<f:view><%@ include file="standard-header.jsp"%></f:view>

	<h2>Fornitore inserito con successo</h2>
	<h3>Dati registrazione:</h3>
	<div>
		<strong>Nome: </strong> ${fornitoreController.fornitore.nome}
	</div>
	<div>
		<strong>Email: </strong> ${fornitoreController.fornitore.email}
	</div>
	<div>
		<strong>Indirizzo: </strong> ${fornitoreController.fornitore.indirizzo.stato}, ${fornitoreController.fornitore.indirizzo.via},
		${fornitoreController.fornitore.indirizzo.citta}
		(${fornitoreController.fornitore.indirizzo.cap})
	</div>
	<div>
		<p>
		<p>
		<h4>
			Torna alla <a href="index.jsp"> homepage</a> oppure alla pagina dell'<a href="adminPage.jsp"> admin</a>
		</h4>
	</div>

</body>
</html>