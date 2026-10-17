package location_vehicules;

public abstract class Vehicule   {
	protected String immatriculation ;
	protected String marque;
	protected double tarifJournalier;
	
	// constructeur 
	public Vehicule(String immatriculation, String marque, double tarifJournalier) {
		super();
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.tarifJournalier = tarifJournalier;
	}
	
	// la methode getTarifJournalier()
	public double getTarifJournalier() {
		return tarifJournalier;
	}
	
	
	//la methode abstraite  calculerCout(int nbJours)
	public abstract double calculerCout(int nbJours) ;
	
	// la methode afficherDetails() 
	public void afficherDetails() {
		System.out.println("Vehicule [immatriculation=" + immatriculation + ", marque=" + marque + ", tarifJournalier="
				+ tarifJournalier + "]");
	}

	}
	
	


