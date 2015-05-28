<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Cover Template for Bootstrap</title>

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

				<div class="center jumbotron"
					style="font-family: 'Josefin+Sans', serif;" padding='15px'>
					<h1>Perché non acquisti un gioco di qualità top?</h1>
					<p>Il nostro catalogo contiene tutto ciò che un giocatore
						potrebbe mai desiderare: videogiochi, console, accessori, guide e
						molto altro ancora</p>
					<a class="btn btn-success btn-lg" role="button">Consulta il
						catalogo </a>
					</p>
				</div>

				<!-- Bootstrap core JavaScript
    ================================================== -->
				<!-- Placed at the end of the document so the pages load faster -->
				<script
					src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
				<script src="js/bootstrap.min.js"></script>
				<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
				<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>