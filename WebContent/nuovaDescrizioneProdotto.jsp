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

<title>nuovaDescrizioneProdotto</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="cover.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<link
	href='http://fonts.googleapis.com/css?family=Josefin+Sans:400,700,100italic'
	rel='stylesheet' type='text/css'>

</head>
<body>
	<f:view>

		<h:form>
			<div>
				Nome:
				<h:inputText value="#{descrizioneProdottoController.nome}" />
			</div>
			<div>
				Prezzo:
				<h:inputText value="#{descrizioneProdottoController.prezzo}" />
			</div>
			<div>
				Descrizione:
				<h:inputText value="#{descrizioneProdottoController.descrizione}" />
			</div>
			<div>
				<h:commandButton value="Crea Prodotto"
					action="#{descrizioneProdottoController.createDescrizioneProdotto}" />
			</div>
		</h:form>
		
		<h:commandButton value="Crea Prodotto"
			action="#{descrizioneProdottoController.createDescrizioneProdotto}" />
		</div>
	</f:view>
</body>
</html>

