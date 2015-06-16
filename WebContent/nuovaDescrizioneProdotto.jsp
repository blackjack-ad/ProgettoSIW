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


<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"
	type="text/javascript"></script>

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
<body>

	<f:view>

		<h:form>
			<h1>Inserisci i dati del prodotto da inserire nel catalogo</h1>
			<div>
				Nome:
				<h:inputText value="#{descrizioneProdottoController2.nome}" />
			</div>
			<div>
				Prezzo:
				<h:inputText value="#{descrizioneProdottoController2.prezzo}" />
			</div>
			<div>
				Descrizione:
				<h:inputText value="#{descrizioneProdottoController2.descrizione}" />
			</div>

			<div>
				<h:form>
					<input type='file' id="imgInp" />
					<img id="blah" src="#" alt="your image" />
					<h:commandButton action="#{descrizioneProdottoController.immagine}"></h:commandButton>
					<script type="text/javascript">
					function readURL(input) {
						if (input.files && input.files[0]) {
							var reader = new FileReader();

							reader.onload = function(e) {
								$('#blah').attr('src', e.target.result);
								
							}
							reader.readAsDataURL(input.files[0]);
					
						}
					}
					$('#imgInp').change( function(){ readURL(this);} );
				</script>
				</h:form>
			</div>
			<div>
				<h:commandButton value="Inserisci"
					action="#{descrizioneProdottoController2.createDescrizioneProdotto}" />
			</div>
			<h:commandLink
				action="#{descrizioneProdottoController2.listDescrizioneProdotti}"
				value="List all Products" />
		</h:form>

	</f:view>

</body>
</html>

