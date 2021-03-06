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

<title>Login</title>
</head>
<body>

	<f:view>
		<%@ include file="standard-header.jsp"%>
		<h:form>
			<h3>Effettua il login:</h3>
			<h:panelGrid columns="3">
			<div>
				Email
				<h:inputText value="#{loginController.email}" required="true"
					requiredMessage=" Devi inserire la tua emial per effettuare il login"
					id="email" />
				<h:message for="email" />
			</div>
			<p>
			<div>
				Password
				<h:inputSecret value="#{loginController.password}" required="true"
					requiredMessage=" Devi inserire la tua password" id="password" />
				<h:message for="password" />
			</div>
			</h:panelGrid>
			<p>
			<div>
				<h:commandButton styleClass="btn btn-primary" value="Accedi"
					action="#{loginController.verifyPasswordUtente}" />
			</div>
		</h:form>
	</f:view>

	<p>
	<p>
	<div>
		<h4>
			Non sei ancora registrato? <a href="registrazioneUtente.jsp">
				registrati</a> subito!
		</h4>
	</div>


</body>
</html>