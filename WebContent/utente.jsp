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
<title>Conferma registrazione</title>
</head>
<body>

	<h2>Registrazione avvenuta con successo</h2>
	<h3>Dati registrazione:</h3>
	<div>
		<strong>Nome:</strong> ${utenteController.utente.nome}
	</div>
	<div>
		<strong>Cognome:</strong> ${utenteController.utente.cognome}
	</div>
	<div>
		<strong>Email:</strong> ${utenteController.utente.email}
	</div>
	<div>
		<strong>Data di nascita:</strong>
		${utenteController.utente.dataNascita}
	</div>

	<div>
		<strong>Indirizzo:</strong> ${utenteController.utente.via}
		${utenteController.utente.cap} ${utenteController.utente.citta}
	</div>
	<div>
		<p>
			<a href="homepage.jsp"> Homepage</a>
		</p>
	</div>

</body>
</html>