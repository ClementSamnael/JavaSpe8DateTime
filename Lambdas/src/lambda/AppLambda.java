package lambda;

import java.util.ArrayList;
import java.util.List;

import bo.Personne;

public class AppLambda {

	public static void main(String[] args) {

		List<Personne> personnes = new ArrayList<Personne>();
		mockList(personnes);

		for (Personne personne : personnes) {
			System.out.println(personne);
		}

		personnes.sort((p1, p2) -> {
			int nomComp = p1.getNom().compareTo(p2.getNom());
			return (nomComp != 0) ? nomComp : p1.getPrenom().compareTo(p2.getPrenom());
		});

		// personnes.sort((p1,p2)->p1.getNom().compareTo(p2.getNom()));

		System.out.println("---");
		for (Personne personne : personnes) {
			System.out.println(personne);
		}
	}

	private static void mockList(List<Personne> personnes) {
		personnes.add(new Personne("Etienne", "Cassin"));
		personnes.add(new Personne("Valentin", "Grimoux"));
		personnes.add(new Personne("Quentin", "Forgeau"));
		personnes.add(new Personne("François", "Mauxion"));
		personnes.add(new Personne("Argann", "Bonneau"));
	}
}
