<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="css/full-width-pics.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="css/Connection.css" />
<title>Connection</title>
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
              <a class="nav-link" >Contact</a>
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
<h1>Inscrivez vous!<span>Vous aurez accès à plus de contenu sur notre site!</span></h1>
<form>
    <div class="section"><span>1</span>Nom &amp; Adresse</div>
    <div class="inner-wrap">
        <label>Votre nom <input type="text" name="field1" /></label>
        <label>Votre Adresse Postale <textarea name="field2"></textarea></label>
    </div>

    <div class="section"><span>2</span>Email &amp; Téléphone</div>
    <div class="inner-wrap">
        <label>Adresse email <input type="email" name="field3" /></label>
        <label>Numero de telephone <input type="text" name="field4" /></label>
    </div>

    <div class="section"><span>3</span>Mot de passe</div>
        <div class="inner-wrap">
        <label>Mot de passe <input type="password" name="field5" /></label>
        <label>Confirmer le mot de passe<input type="password" name="field6" /></label>
    </div>
    
    <div class="section"><span>3</span>Risque de santé</div>
        <div class="inner-wrap">
        <label>Risque de santé ? </label>
        <h3><input type="checkbox" name="field7">Cochez si oui</h3>
    </div>
    
    
    <div class="button-section">
     <input type="submit" name="Sign Up" value="Je m'inscris"/>
     <span class="privacy-policy">
     <input type="checkbox" name="field7">J'ai bien lu et accepte la charte
     </span>
    </div>
</form>
</div>

 <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Bossert Kerherne 2018</p>
      </div>
      <!-- /.container -->
    </footer>
</body>
</html>