package personne.base;

public class Personne {

	private Integer idPersonne = null;
	private String nom = null;
	private String prenom = null;
	private String email = null;
	private Boolean RAS = null;

	public Personne() {

	}

	public Integer getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(Integer idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getRAS() {
		return RAS;
	}

	public void setRAS(Boolean rAS) {
		RAS = rAS;
	}

	public Personne(String nom,String prenom,String email, Boolean RAS ) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.RAS = RAS;
	}

}




