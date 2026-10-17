package location_vehicules;

public class Client {
	private static int compteur = 0;
	private final int id;
	private String nom;
	private String prenom;

	// constructeur
	public Client(String nom, String prenom) {
		id = ++compteur;
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
