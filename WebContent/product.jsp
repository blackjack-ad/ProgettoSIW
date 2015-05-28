<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Product</title>
</head>
<body>
	<f:view>
		<h1>${descrizioneProdottoController.descrizioneProdotto.nome}</h1>
		<h2>Details</h2>
		<div>Price: ${descrizioneProdottoController.descrizioneProdotto.prezzo}</div>
		<div>Description: ${descrizioneProdottoController.descrizioneProdotto.descrizione}</div>
	</f:view>
</body>
</html>