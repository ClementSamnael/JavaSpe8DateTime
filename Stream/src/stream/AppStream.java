package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import bo.Personne;
import util.Util;

public class AppStream {

	public static void main(String[] args) {

		List<Personne> personnes = new ArrayList<Personne>();
		Util.mockList(personnes);

		// Objectif 1 : trouver et afficher Etienne Cassin dans la liste
		Personne etienne = personnes
				.stream()
				.filter(personne -> "Etienne".equals(personne.getPrenom()) && "Cassin".equals(personne.getNom()))
				.collect(Collectors.toList())
				.get(0);

		if (etienne != null)
			System.out.println(etienne);

		// Objectif 2 : lister et afficher tous les membres dont le nom de famille est
		// Cassin
		List<Personne> cassin_bros = personnes
				.stream().filter(personne -> "Cassin".equals(personne.getNom()))
				.sorted((p1, p2) -> p1.getPrenom().compareTo(p2.getPrenom()))
				.collect(Collectors.toList());

		if (!cassin_bros.isEmpty())
			System.out.println(cassin_bros);

		// Objectif 3 : Envoyer une notification à chacun des membres ainsi récupérés
		cassin_bros.stream().forEach(personne -> 
		Util.notify(personne));

		// Objectif 4 : Passer en majuscule les noms des 3 premiers membres de la liste
		personnes.stream()
		.limit(3)
		.map(personne -> {
			personne.setNom(personne.getNom().toUpperCase());
			return personne;
		})
		.collect(Collectors.toList());
		System.out.println(personnes);

		// Objectif 5 : Recuperer tous les noms de famille de facon unique
		List<String> names = personnes.stream()
				.map(personne -> personne.getNom())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(names);
	}
}
