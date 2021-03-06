<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
								<a class="navbar-brand" href="index.jsp">GameStore</a>
							</div>

							<!-- Collect the nav links, forms, and other content for toggling -->
							<div class="collapse navbar-collapse"
								id="bs-example-navbar-collapse-1">
								<ul class="nav navbar-nav"><c:if test="${not loginController.loggedIn}">
										<li><a href="adminPage.jsp">Accedi come amministratore</a></li>
									</c:if>
									<li><a href="registrazioneUtente.jsp">Registrati</a></li>
									<c:if test="${not loginController.loggedIn}">
										<li><a href="login.jsp">Login</a></li>
									</c:if>
									<c:if test="${loginController.loggedIn}">
										<li><a href="logout.jsp">Logout</a></li>
									</c:if>
								</ul>

								<c:if test="${loginController.loggedIn}">
									<h4 class="navbar-text navbar-right">
										Benvenuto <strong><a href="faces/paginaUtente.jsp"
											style="color: #231A24">${loginController.utenteCorrente.nome}
												${loginController.utenteCorrente.cognome}</a></strong>&nbsp
									</h4>
								</c:if>

								<c:if test="${loginController.creatingOrder}">
									<h4 class="navbar-text navbar-right">
										<strong><a href="ordine.jsp" style="color: #231A24">Ordine<span
												class="badge">${ordineController.num}</span></a></strong>&nbsp
									</h4>
								</c:if>
							</div>
							<!-- /.navbar-collapse -->
						</div>
						<!-- /.container-fluid -->
					</nav>
				</div>
			</div>