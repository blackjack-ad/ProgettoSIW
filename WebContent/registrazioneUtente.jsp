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
		<%@ include file="standard-header.jsp"%>
		<h:form>
			<h3>Compilare i seguenti dati per effettuare la registrazione</h3>
			<h4>Inizia subito ad acquistare su GameStore</h4>
			<div>
				Nome:
				<h:inputText value="#{utenteController.nome}" required="true"
					requiredMessage=" Il nome e' obbligatorio" id="nome" />
				<h:message for="nome" />
			</div>
			<p>
			<div>
				Cognome:
				<h:inputText value="#{utenteController.cognome}" required="true"
					requiredMessage=" Il cognome e' obbligatorio" id="cognome" />
				<h:message for="cognome" />
			</div>
			<p>
			<div>
				Email:
				<h:inputText value="#{utenteController.email}" required="true"
					requiredMessage=" La email e' obbligatorio" id="email" />
				<h:message for="email" />
			</div>
			<p>
			<div>
				Crea la password:
				<h:inputSecret value="#{utenteController.password}" required="true"
					requiredMessage=" La password e' obbligatoria" id="password" />
				<h:message for="password" />
			</div>
			<p>
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
				<h:selectOneMenu id="giorno" value="#{utenteController.giorno}">
					<f:selectItem id="item1" itemLabel="01" itemValue="1" />
					<f:selectItem id="item2" itemLabel="02" itemValue="2" />
					<f:selectItem id="item3" itemLabel="03" itemValue="3" />
					<f:selectItem id="item4" itemLabel="04" itemValue="4" />
					<f:selectItem id="item5" itemLabel="05" itemValue="5" />
					<f:selectItem id="item6" itemLabel="06" itemValue="6" />
					<f:selectItem id="item7" itemLabel="07" itemValue="7" />
					<f:selectItem id="item8" itemLabel="08" itemValue="8" />
					<f:selectItem id="item9" itemLabel="09" itemValue="9" />
					<f:selectItem id="item10" itemLabel="10" itemValue="10" />
					<f:selectItem id="item11" itemLabel="11" itemValue="11" />
					<f:selectItem id="item12" itemLabel="12" itemValue="12" />
					<f:selectItem id="item13" itemLabel="13" itemValue="13" />
					<f:selectItem id="item14" itemLabel="14" itemValue="14" />
					<f:selectItem id="item15" itemLabel="15" itemValue="15" />
					<f:selectItem id="item16" itemLabel="16" itemValue="16" />
					<f:selectItem id="item17" itemLabel="17" itemValue="17" />
					<f:selectItem id="item18" itemLabel="18" itemValue="18" />
					<f:selectItem id="item19" itemLabel="19" itemValue="19" />
					<f:selectItem id="item20" itemLabel="20" itemValue="20" />
					<f:selectItem id="item21" itemLabel="21" itemValue="21" />
					<f:selectItem id="item22" itemLabel="22" itemValue="22" />
					<f:selectItem id="item23" itemLabel="23" itemValue="23" />
					<f:selectItem id="item24" itemLabel="24" itemValue="24" />
					<f:selectItem id="item25" itemLabel="25" itemValue="25" />
					<f:selectItem id="item26" itemLabel="26" itemValue="26" />
					<f:selectItem id="item27" itemLabel="27" itemValue="27" />
					<f:selectItem id="item28" itemLabel="28" itemValue="28" />
					<f:selectItem id="item29" itemLabel="29" itemValue="29" />
					<f:selectItem id="item30" itemLabel="30" itemValue="30" />
					<f:selectItem id="item31" itemLabel="31" itemValue="31" />
				</h:selectOneMenu>

				Mese
				<h:selectOneMenu id="mese" value="#{utenteController.mese}">
					<f:selectItem id="itemm1" itemLabel="01" itemValue="1" />
					<f:selectItem id="itemm2" itemLabel="02" itemValue="2" />
					<f:selectItem id="itemm3" itemLabel="03" itemValue="3" />
					<f:selectItem id="itemm4" itemLabel="04" itemValue="4" />
					<f:selectItem id="itemm5" itemLabel="05" itemValue="5" />
					<f:selectItem id="itemm6" itemLabel="06" itemValue="6" />
					<f:selectItem id="itemm7" itemLabel="07" itemValue="7" />
					<f:selectItem id="itemm8" itemLabel="08" itemValue="8" />
					<f:selectItem id="itemm9" itemLabel="09" itemValue="9" />
					<f:selectItem id="itemm10" itemLabel="10" itemValue="10" />
					<f:selectItem id="itemm11" itemLabel="11" itemValue="11" />
					<f:selectItem id="itemm12" itemLabel="12" itemValue="12" />
				</h:selectOneMenu>
				Anno
				<h:inputText value="#{utenteController.anno}" required="true"
					requiredMessage=" Campo obbligatorio" id="anno" />
				<h:message for="anno" />
			</div>
			<h4>Indirizzo di residenza</h4>
			<div>
				Stato
				<h:inputText value="#{utenteController.stato}" required="true"
					requiredMessage=" Campo obbligatorio" id="stato" />
				<h:message for="stato" />
			</div>
			<p>
			<div>
				Citta'
				<h:inputText value="#{utenteController.citta}" required="true"
					requiredMessage=" Campo obbligatorio" id="citta" />
				<h:message for="citta" />
			</div>
			<p>
			<div>
				Cap
				<h:inputText value="#{utenteController.cap}" required="true"
					requiredMessage=" Campo obbligatorio" id="cap" />
				<h:message for="cap" />
			</div>
			<p>
			<div>
				Via:
				<h:inputText value="#{utenteController.via}" required="true"
					requiredMessage=" Campo obbligatorio" id="via" />
				<h:message for="via" />
			</div>
			<p>
			<p>
			<div>
				<h:commandButton value="Invia"
					action="#{utenteController.createUtente}" />
			</div>
		</h:form>
		<p>
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