package location_vehicules;

public class Main {
	public static void main(String[] args) {

		// creation des clients
		Client client1 = new Client("Rami", "Ahmed ");
		Client client2 = new Client("kadiri", "Salma");

		// creation des vehicules
		Voiture voiture1 = new Voiture("A3428", "Renault Clio", 300, 5);
		Voiture voiture2 = new Voiture("123-b", "Dacia logan", 400, 7);
		Moto moto = new Moto("2222-A", "C90", 150, 125);

		// tableau des vehicules
		Vehicule[] vehicules = { voiture1, voiture2, moto };

		// location des vehicules
		Location location1 = new Location(3, client1, voiture1);
		Location location2 = new Location(2, client2, voiture2);
		Location location3 = new Location(6, client1, moto);

		// tableau des locations
		Location[] locations = { location1, location2, location3 };

		// affichage des vehicules et des locations

		System.out.println("les informations des vehicules ");
		for (Vehicule v : vehicules) {
			v.afficherDetails();
		}

		System.out.println("les informations des location ");

		for (Location l : locations) {
			l.afficherRecapitulatif();
		}
		// calule du montant total
		double montant = voiture1.calculerCout(3) + voiture2.calculerCout(2) + moto.calculerCout(6);
		System.out.println("le montant total de toutes les locations est :" + montant);
	}

}
