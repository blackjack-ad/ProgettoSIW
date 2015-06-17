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
					/>
			</div>
			<p>
			<div>
				Fornitore
				<h:selectManyListbox value="#{prodottoController.idFornitori}">
					<f:selectItem itemValue="#{null}" itemLabel="-- select one or more --" />
					<f:selectItems value="#{prodottoController.fornitori}"
						var="fornitore" itemLabel="#{fornitore.nome}"
						itemValue="#{fornitore.id}" />
				</h:selectManyListbox>
			</div>

				<div>
				Tipo Prodotto
				<h:selectOneMenu value="#{prodottoController.idDescrizioneProdotto}">
					<f:selectItem itemValue="#{null}" itemLabel="-- select one--" />
					<f:selectItems value="#{prodottoController.descrizioneProdotti}"
						var="descrizione" itemLabel="#{descrizione.nome}"
						itemValue="#{descrizione.id}" />
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