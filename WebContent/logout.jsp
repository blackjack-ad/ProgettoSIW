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

<title>Logout</title>

<!-- Bootstrap core CSS -->
<link href="ubuntu/bootstrap.min.css" rel="stylesheet">
<link
	href='http://fonts.googleapis.com/css?family=Josefin+Sans:400,700,100italic'
	rel='stylesheet' type='text/css'>
</head>
</head>
<body>
	<f:view>
		<h:form>
			<%@ include file="standard-header.jsp"%>

			<h3>Sei sicuro di voler uscire?</h3>
			<p>
			<p>
			<h4>Se vuoi uscire fai click sul bottone "logout"</h4>
			<p>
			<p>
			<div>
				<h:commandButton styleClass="btn btn-primary" value="Logout" action="#{loginController.logout}" />
			</div>
		</h:form>
	</f:view>
</body>
</html>