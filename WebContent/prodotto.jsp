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
		<h2>Prodotto inserito correttamente nel magazzino</h2>
		<p>
		<p>
		<h4>
			Torna alla pagina di inserimento dei prodotti in <a href="prodottiMagazzino.jsp">magazzino</a> oppure alla pagina dell'<a
				href="adminPage.jsp"> admin</a>
		</h4>
	</f:view>
</body>
</html>