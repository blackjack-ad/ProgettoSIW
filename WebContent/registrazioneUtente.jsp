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

<title>Nuovo Utente</title>
</head>
<body>

	<f:view>
		<h:form>
			<h3>Compilare i seguenti dati per effettuare la registrazione</h3>
			<h4>Inizia subito ad acquistare su GameStore</h4>
			<div>
				Nome:
				<h:inputText value="#{utenteController.nome}" required="true"
					requiredMessage=" Il nome e' obbligatorio" id="nome" />
				<h:message for="nome" />
			</div>
			<div>
				Cognome:
				<h:inputText value="#{utenteController.cognome}" required="true"
					requiredMessage=" Il cognome e' obbligatorio" id="cognome" />
				<h:message for="cognome" />
			</div>
			<div>
				Email:
				<h:inputText value="#{utenteController.email}" required="true"
					requiredMessage=" La email e' obbligatorio" id="email" />
				<h:message for="email" />
			</div>
			<div>
				Crea la password:
				<h:inputText value="#{utenteController.password}" required="true"
					requiredMessage=" La password e' obbligatoria" id="password" />
				<h:message for="password" />
			</div>
			<div>
				Numero telefono:
				<h:inputText value="#{utenteController.numeroTelefono}"
					required="true"
					requiredMessage=" Il numero di telefono e' necessario"
					id="telefono" />
				<h:message for="telefono" />
			</div>
			<h4>Data di nascita:</h4>
			<div>
				Giorno
				<h:inputText value="#{utenteController.giorno}" required="true"
					requiredMessage=" Campo obbligatorio" id="giorno" />
				<h:message for="giorno" />

				Mese
				<h:inputText value="#{utenteController.mese}" required="true"
					requiredMessage=" Campo obbligatorio" id="mese" />
				<h:message for="mese" />

				Anno
				<h:inputText value="#{utenteController.anno}" required="true"
					requiredMessage=" Campo obbligatorio" id="anno" />
				<h:message for="anno" />
			</div>
			<h4>Indirizzo di residenza</h4>
			<div>
				Stato:
				<h:inputText value="#{utenteController.stato}" required="true"
					requiredMessage=" Campo obbligatorio" id="stato" />
				<h:message for="stato" />
			</div>
			<div>
				Citta':
				<h:inputText value="#{utenteController.citta}" required="true"
					requiredMessage=" Campo obbligatorio" id="citta" />
				<h:message for="citta" />
			</div>
			<div>
				Cap:
				<h:inputText value="#{utenteController.cap}" required="true"
					requiredMessage=" Campo obbligatorio" id="cap" />
				<h:message for="cap" />
			</div>
			<div>
				Via:
				<h:inputText value="#{utenteController.via}" required="true"
					requiredMessage=" Campo obbligatorio" id="via" />
				<h:message for="via" />
			</div>
			<div>
				<h:commandButton value="Invia"
					action="#{utenteController.createUtente}" />
			</div>
		</h:form>

		<div>

			Cliccando sul pulsante "Invia", acconsento che:
			<ul>
				<li>Ho almeno 18 anni di eta'</li>
				<li>Ho inserito dati validi</li>
				<li>Accetto il trattamento dei miei dati personali</li>
			</ul>
		</div>
		<div>
			<a href="homepage.jsp"> Homepage</a>
		</div>

	</f:view>



</body>
</html>