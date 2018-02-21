<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="css/Connection.css" />
<title>Connection</title>
</head>

<body>
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
</body>
</html>