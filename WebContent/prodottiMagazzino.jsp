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

<title>Magazzino</title>
</head>
<body>

	<f:view>
		<%@ include file="standard-header.jsp"%>
		<h:form>
			<div>
				Codice Seriale
				<h:inputText value="#{prodottoController.codiceSeriale}"
					required="true"
					requiredMessage="Il codice del prodotto e' obbligatorio"
					id="codice" />
				<h:message for="codice" />
			</div>
			<p>
			<div>
				Fornitore
				<h:selectOneMenu id="fornitore"
					value="#{prodottoController.fornitore}">
					<!--<f:selectItems value="#{fornitoreController.fornitori}"
						var="fornitore" itemLabel="#{fornitore.nome}"
						itemValue="#{fornitore}" />-->
				</h:selectOneMenu>
			</div>

			<div>
				Tipo prodotto nel catalogo
				<h:selectOneMenu id="descrizione"
					value="#{prodottoController.descrizione}">
					<!--<f:selectItems value="#{descrizioneProdottoController.descrizioneProdotti}"
						var="descrizione" itemLabel="#{descrizione.nome}"
						itemValue="#{descrizioneProdotto}" />-->
				</h:selectOneMenu>
			</div>

			<div>
				<h:commandButton value="Inserisci prodotto nel magazzino"
					action="#{prodottoController.createProdotto}" />
			</div>

		</h:form>
	</f:view>
</body>
</html>