package location_vehicules;

public class Location {
	private int nbJour;
	private Client client;
	private Vehicule vehicule;

	// constructeur
	public Location(int nbJour, Client client, Vehicule vehicule) {
		super();
		this.nbJour = nbJour;
		this.client = client;
		this.vehicule = vehicule;
	}

	public void afficherRecapitulatif() {
		System.out.print("Location { client=" + client + " ; nbJour= " + nbJour +";");
		vehicule.afficherDetails();
		System.out.println("}");
	}

}
