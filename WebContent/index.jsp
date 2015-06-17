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
<link href="ubuntu/bootstrap.min.css" rel="stylesheet">

</head>

<body>

	<f:view>

		<div class="site-wrapper">

			<div class="site-wrapper-inner">

				<div class="cover-container">

					<div class="masthead clearfix">
						<div class="inner">
							<nav class="navbar navbar-default navbar-static-top">
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
										<c:if test="${not loginController.loggedIn}">
											<li><a href="faces/adminPage.jsp">Accedi come
													amministratore</a></li>
										</c:if>


										<li><a href="faces/registrazioneUtente.jsp">Registrati</a></li>
										<c:if test="${not loginController.loggedIn}">
											<li><a href="faces/login.jsp">Login</a></li>
										</c:if>
										<c:if test="${loginController.loggedIn}">
											<li><a href="faces/logout.jsp">Logout</a></li>
										</c:if>
									</ul>
									<c:if test="${loginController.loggedIn}">
										<h4 class="navbar-text navbar-right">
											Benvenuto <strong><a href="faces/paginaUtente.jsp"
												style="color: #231A24">${loginController.utenteCorrente.nome}
													${loginController.utenteCorrente.cognome}</a></strong>&nbsp
										</h4>
									</c:if>
								</div>
								<!-- /.navbar-collapse -->
							</div>
							<!-- /.container-fluid --> </nav>
						</div>
					</div>

				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
			</nav>


		</div>
		</div>

		<div class="center jumbotron" padding='15px' align="center">
			<h1>Perché non acquisti un gioco di qualità top?</h1>
			<p>Il nostro catalogo contiene tutto ciò che un giocatore
				potrebbe mai desiderare: videogiochi, console, accessori, guide e
				molto altro ancora</p>

			<p>
				<h:form>
					<h:commandButton styleClass="btn btn-primary"
						action="#{descrizioneProdottoController2.listDescrizioneProdotti}"
						value="Consulta il nostro catalogo">
					</h:commandButton>
				</h:form>
			</p>


		</div>

		<div id="myCarousel" class="carousel slide" data-ride="carousel"
			align="center">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>

			<!-- Wrapper for slides -->

			<div class="carousel-inner" role="listbox">

				<div class="item active">
					<img src="tab0.jpg" alt="Flower">
				</div>

				<div class="item">
					<img src="tab1.jpg" alt="Chania">
				</div>

				<div class="item">
					<img src="tab2.jpg" alt="Chania">
				</div>

			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
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