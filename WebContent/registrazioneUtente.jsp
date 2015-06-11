<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Gamestore</title>

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
		<div class="site-wrapper">

			<div class="site-wrapper-inner">

				<div class="cover-container">

					<div class="masthead clearfix">
						<div class="inner">
							<nav class="navbar navbar-inverse navbar-static-top">
							<div class="container-fluid">
								<!-- Brand and toggle get grouped for better mobile display -->
								<div class="navbar-header">
									<button type="button" class="navbar-toggle collapsed"
										data-toggle="collapse"
										data-target="#bs-example-navbar-collapse-1">
										<span class="sr-only">Toggle navigation</span> <span
											class="icon-bar"></span> <span class="icon-bar"></span> <span
											class="icon-bar"></span>
									</button>
									<a class="navbar-brand" href="#">GameStore</a>
								</div>

								<!-- Collect the nav links, forms, and other content for toggling -->
								<div class="collapse navbar-collapse"
									id="bs-example-navbar-collapse-1">
									<ul class="nav navbar-nav">

										<li><a href="#">Accedi come utente</a></li>

										<li><a href="adminPage.jsp">Accedi come
												amministratore</a></li>

										<li><a href="faces/registrazioneUtente.jsp">Registrati</a></li>
									</ul>
									<form class="navbar-form navbar-center" role="search">
										<div class="form-group">
											<input type="text" class="form-control" placeholder="Cerca">
										</div>
										<button type="submit" class="btn btn-default">Vai</button>
									</form>
								</div>
								<!-- /.navbar-collapse -->
							</div>
							<!-- /.container-fluid --> </nav>


						</div>
					</div>
					<h:form>
						<h3>Compilare i seguenti dati per effettuare la registrazione</h3>
						<h4>Inizia subito ad acquistare su GameStore</h4>
						<p>
						<div>
							Nome:
							<h:inputText value="#{utenteController.nome}" required="true"
								requiredMessage=" Il nome e' obbligatorio" id="nome" />
							<h:message for="nome" />
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
						<p>
						<h4>Data di nascita:</h4>
						<div>
							Giorno
							<h:inputText value="#{utenteController.giorno}" required="true"
								requiredMessage=" Campo obbligatorio" id="giorno" />
							<h:message for="giorno" />

							Mese
							<h:inputText value="#{utenteController.mese}" required="true"
								requiredMessage=" Campo obbligatorio" id="mese" />
							<h:message for="mese" />

							Anno
							<h:inputText value="#{utenteController.anno}" required="true"
								requiredMessage=" Campo obbligatorio" id="anno" />
							<h:message for="anno" />
						</div>
						<p>
						<h4>Indirizzo di residenza</h4>
						<div>
							Stato:
							<h:inputText value="#{utenteController.stato}" required="true"
								requiredMessage=" Campo obbligatorio" id="stato" />
							<h:message for="stato" />
						</div>
						<p>
						<div>
							Citta':
							<h:inputText value="#{utenteController.citta}" required="true"
								requiredMessage=" Campo obbligatorio" id="citta" />
							<h:message for="citta" />

							Cap:
							<h:inputText value="#{utenteController.cap}" required="true"
								requiredMessage=" Campo obbligatorio" id="cap" />
							<h:message for="cap" />

							Via:
							<h:inputText value="#{utenteController.via}" required="true"
								requiredMessage=" Campo obbligatorio" id="via" />
							<h:message for="via" />
							<p>
							<p>
								<h:commandButton value="Invia"
									action="#{utenteController.createUtente}" />
						</div>
					</h:form>

					<div>
						<p>
						<p>
						<p>Cliccando sul pulsante "Invia", acconsento che:
						<ul>
							<li>Ho almeno 18 anni di eta'</li>
							<li>Ho inserito dati validi</li>
							<li>Accetto il trattamento dei miei dati personali</li>
						</ul>
					</div>
					<div>
						<a href="homepage.jsp"> Homepage</a>
					</div>

					<!-- Bootstrap core JavaScript
    ================================================== -->
					<!-- Placed at the end of the document so the pages load faster -->
					<script
						src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
					<script src="js/bootstrap.min.js"></script>
					<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
					<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
				</div>
			</div>
		</div>
	</f:view>
</body>
</html>