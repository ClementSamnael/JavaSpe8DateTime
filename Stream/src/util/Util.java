package util;

import java.util.List;

import bo.Personne;

public abstract class Util {

	public static final int it = 100000;

	public static void mockList(List<Personne> personnes) {
		personnes.add(new Personne("Etienne", "Cassin"));
		personnes.add(new Personne("Antoine", "Cassin"));
		personnes.add(new Personne("François", "Cassin"));
		personnes.add(new Personne("Valentin", "Grimoux"));
		personnes.add(new Personne("Quentin", "Forgeau"));
		personnes.add(new Personne("François", "Mauxion"));
		personnes.add(new Personne("Argann", "Bonneau"));
	}

	public static void notify(Personne cassin_bro) {
		System.out.println("Salut " + cassin_bro.getPrenom());
	}
}
