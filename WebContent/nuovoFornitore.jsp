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

<title>Nuovo Fornitore</title>
</head>
<body>

	<f:view>
		<%@ include file="standard-header.jsp"%>
		<h:form>
			<h3>Compilare i seguenti dati per registrare un nuovo fornitore</h3>
			<h:panelGrid columns="3">
				<div>
					Nome
					<h:inputText value="#{fornitoreController.nome}" required="true"
						requiredMessage=" Il nome e' obbligatorio" id="nome" />
					<h:message for="nome" />
				</div>
				<p>
				<div>
					Email
					<h:inputText value="#{fornitoreController.email}" required="true"
						requiredMessage=" La email e' obbligatorio" id="email" />
					<h:message for="email" />
				</div>
				<p>
				<div>
					Numero telefono
					<h:inputText value="#{fornitoreController.telefono}"
						required="true"
						requiredMessage=" Il numero di telefono e' necessario"
						id="telefono" />
					<h:message for="telefono" />
				</div>
				<p>
				<div>
					Partita IVA
					<h:inputText value="#{fornitoreController.partitaIVA}"
						required="true" requiredMessage=" La partita IVA e' necessaria"
						id="iva" />
					<h:message for="iva" />
				</div>
			</h:panelGrid>

			<h4>Indirizzo</h4>
			<h:panelGrid columns="3">
				<div>
					Stato
					<h:inputText value="#{fornitoreController.stato}" required="true"
						requiredMessage=" Campo obbligatorio" id="stato" />
					<h:message for="stato" />
				</div>
				<p>
				<div>
					Citta'
					<h:inputText value="#{fornitoreController.citta}" required="true"
						requiredMessage=" Campo obbligatorio" id="citta" />
					<h:message for="citta" />
				</div>
				<p>
				<div>
					Cap
					<h:inputText value="#{fornitoreController.cap}" required="true"
						requiredMessage=" Campo obbligatorio" id="cap" />
					<h:message for="cap" />
				</div>
				<p>
				<div>
					Via
					<h:inputText value="#{fornitoreController.via}" required="true"
						requiredMessage=" Campo obbligatorio" id="via" />
					<h:message for="via" />
				</div>
			</h:panelGrid>
			<p>
			<p>
			<p>
			<div>
				<h:commandButton styleClass="btn btn-primary" value="Invia"
					action="#{fornitoreController.createFornitore}" />
			</div>
		</h:form>
		<p>
		<p>
		<h4>
			Torna alla <a href="adminPage.jsp">pagina dell'admin</a>
		</h4>

	</f:view>



</body>
</html>