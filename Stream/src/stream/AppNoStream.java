package stream;

import java.util.ArrayList;
import java.util.List;

import bo.Personne;
import util.Util;

public class AppNoStream {

	public static void main(String[] args) {

		List<Personne> personnes = new ArrayList<Personne>();
		Util.mockList(personnes);

		// Objectif 1 : trouver et afficher Etienne Cassin dans la liste
		Personne etienne = null;
		for (Personne personne : personnes) {
			if ("Etienne".equals(personne.getPrenom()) && "Cassin".equals(personne.getNom()))
				etienne = personne;
		}
		if (etienne != null)
			System.out.println(etienne);

		// Objectif 2 : lister et afficher tous les membres dont le nom de famille est
		// Cassin
		List<Personne> brothers = new ArrayList<>();
		for (Personne personne : personnes) {
			if ("Cassin".equals(personne.getNom()))
				brothers.add(personne);
		}
		if (!brothers.isEmpty())
			System.out.println(brothers);

		// Objectif 3 : Envoyer une notification à chacun des membres ainsi récupérés
		for (Personne cassin_bro : brothers) {
			Util.notify(cassin_bro);
		}

		// Objectif 4 : Passer en majuscule les noms des 3 premiers membres de la liste
		for (int i = 0; i < 3; i++) {
			if (i < personnes.size()) {
				Personne personne = personnes.get(i);
				personne.setNom(personne.getNom().toUpperCase());
			}
		}
		System.out.println(personnes);

		// Objectif 5 : Recuperer tous les noms de famille de facon unique
		List<String> namesList = new ArrayList<String>();
		for (Personne personne : personnes) {
			if (!namesList.contains(personne.getNom()))
				namesList.add(personne.getNom());
		}
		System.out.println(namesList);
	}
}
