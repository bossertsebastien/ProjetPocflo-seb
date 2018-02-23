<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/full-width-pics.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="css/Connection.css" />


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">Start Bootstrap</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href="ServletAccueil">Home
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="ServletConnexion">Connexion</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="ServletInscription" >Inscription</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="Servletinfo" >Information</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="ServletParcours" >Parcours</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <!-- Header - set the background image for the header in the line below -->
    <header class="py-5 bg-image-full" style="background-image: url('img/we-moe-assurance-emprunteur-sante-groupe-ensemble.jpg');">
     	<img class="img-fluid d-block mx-auto" src="img/cropped-logoWeMoe.jpg" alt="">
    </header>

	<div class="form-style-10">
		<form  method="post" action="ServletConnexion">
				
				
			<div class="section"><span>2</span>Identifiant &amp; Mot de passe</div>
    		<div class="inner-wrap">
        		<label>Identifiant&nbsp;:</label><input name="ident" type="text" value=""/>
        		<label>Mot de passe&nbsp;:</label><input name="mdpConnexion" type="text" value="" />
   			</div>
				

			<div class="button-section">
				<input name="submit" type="submit" value="Valider"/>
			</div>

		</form>
	</div>


	 <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Bossert&Kerherne 2018</p>
      </div>
      <!-- /.container -->
    </footer>

</body>	

</html>
