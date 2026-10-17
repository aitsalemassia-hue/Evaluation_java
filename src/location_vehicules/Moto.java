package location_vehicules;

public class Moto extends Vehicule {
	private int cylindree;

	// constructeur
	public Moto(String immatriculation, String marque, double tarifJournalier, int cylindree) {
		super(immatriculation, marque, tarifJournalier);
		this.cylindree = cylindree;
	}

	@Override
	public double calculerCout(int nbJours) {
		if (cylindree < 5) {
			return tarifJournalier * nbJours;
		} else {
			return (tarifJournalier * nbJours )-0.1;
		}

	}

}
