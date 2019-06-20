package app;

import imp.Chat;
import imp.Chien;
import inter.Animal;

public class Application {

	public static void main(String[] args) {
		Animal animal = new Chien();
		animal.cri();

		Animal animal2 = new Chat();
		animal2.cri();
	}
}
