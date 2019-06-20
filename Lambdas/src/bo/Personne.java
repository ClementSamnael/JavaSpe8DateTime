package bo;

public class Personne {

	private String nom;
	private String prenom;

	public Personne() {
	}

	public Personne(String nom, String prenom) {
		super();// appelle la classe object
		this.nom = nom;
		this.prenom = prenom;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personne [nom =");
		builder.append(nom);
		builder.append(", prenom =");
		builder.append(prenom);
		builder.append("]");
		return builder.toString();
	}

}
