<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<title>ordiniDaEvadere</title>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"
	type="text/javascript"></script>

<!-- Bootstrap core CSS -->
<link href="ubuntu/bootstrap.min.css" rel="stylesheet">

<link
	href='http://fonts.googleapis.com/css?family=Josefin+Sans:400,700,100italic'
	rel='stylesheet' type='text/css'>

</head>
<body>
	<f:view>
		<%@ include file="standard-header.jsp"%>
		<h2>Ordini in attesa di essere evasi</h2>
		<table class="table table-hover">
			<tr>
				<th>Codice</th>
				<th>Data Apertura</th>
				<th>Stato</th>
			</tr>
			<c:forEach var="ordine" items="#{ordineController.ordini}">
				<tr>
					<td> <h:form>
							<h:commandLink action="#{ordineController.findOrdine}"
								value="#{ordine.id}">
								<f:param name="id" value="#{ordine.id}" />
							</h:commandLink>
						</h:form></td>
					<td>${ordine.dataInizio}</td>
					<td>${ordine.stato}</td>
					<c:if test="${ordine.stato eq 'chiuso'}">
						<td><h:form>
								<h:commandButton action="#{ordineController.evadiOrdine}"
									value="Evadi">
									<f:param name="id" value="#{ordine.id}" />
								</h:commandButton>
							</h:form></td>
					</c:if>
					<c:if test="${ordine.stato eq 'sospeso'}">
						<td><h:form>
								<h:commandButton action="#{ordineController.evadiOrdine}"
									value="Evadi">
									<f:param name="id" value="#{ordine.id}" />
								</h:commandButton>
							</h:form></td>
					</c:if>
				</tr>
			</c:forEach>
		</table>
	</f:view>
</body>
</html>