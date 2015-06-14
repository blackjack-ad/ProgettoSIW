<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Pagina dell'amministratore</title>

<!-- Bootstrap core CSS -->
<link href="ubuntu/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<link
	href='http://fonts.googleapis.com/css?family=Josefin+Sans:400,700,100italic'
	rel='stylesheet' type='text/css'>
</head>
</head>
<body>
	<f:view>
		<%@ include file="standard-header.jsp"%>
	</f:view>
	<button type="button" class="btn btn-primary"
		onclick="location.href='faces/nuovaDescrizioneProdotto.jsp'">Inserisci
		prodotto nel catalogo</button>
	<button type="button" class="btn btn-primary"
		onclick="location.href='faces/nuovoFornitore.jsp'">Inserisci
		un nuovo fornitore</button>

	<button type="button" class="btn btn-primary">Inserisci
		prodotto nel magazzino</button>

	<button type="button" class="btn btn-primary">Evadi Ordine</button>
</body>
</html>