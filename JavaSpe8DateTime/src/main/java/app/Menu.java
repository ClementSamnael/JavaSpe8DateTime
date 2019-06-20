package app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		int choix = 0;

		Scanner scan = new Scanner(System.in);
		while (choix != 4) {
			System.out.println("Choix de la date");
			System.out.println("1. Saisir une date (jour/mois/annee");
			System.out.println("2. Saisir un temps (heures:minutes:secondes");
			System.out.println("3. Saisir une date et un temps (jour/mois/annee heures:minutes:secondes");
			System.out.println("4. Quitter");
			choix = scan.nextInt();
			switch (choix) {
			case 1:
				addDate(scan);
				break;
			case 2:
				addTime(scan);
				break;
			case 3:
				addDateTime(scan);
				break;
			case 4:
				System.out.println("Fermeture de l'Application");
			default:
				System.out.println("Je n'ai pas compris la requête");
				break;
			}
		}
		scan.close();
	}

	public static void addDate(Scanner scan) {

		int year = 0, month = 0, day = 0;

		boolean valid = false;

		while (!valid) {
			System.out.println("Entrer l'annee en 4 chiffres");
			year = scan.nextInt();
			if (year > 0 && year < LocalDate.now().getYear()) {
				valid = true;
			} else {
				System.out.println("Anné incorrecte");
			}
		}
		System.out.println();
		while (!valid) {
			System.out.println("Entrer le mois en chiffre");
			month = scan.nextInt();
			if (month > 0 && month <= 12) {
				valid = true;
			} else {
				System.out.println("Mois incorrect");
			}
		}
		System.out.println();
		LocalDate testDay = LocalDate.of(year, month, 1);
		while (!valid) {
			System.out.println("Entrer le jour en chiffre");
			day = scan.nextInt();
			if (day > 0 && day <= testDay.lengthOfMonth()) {
				valid = true;
			} else {
				System.out.println("Jour incorrect");
			}
		}

		LocalDate ld = LocalDate.of(year, month, day);
		System.out.println(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	public static void addTime(Scanner scan) {

		int hour = 0, minute = 0, second = 0;

		boolean valid = false;

		while (!valid) {
			System.out.println("Entrer l'heure désirée");
			hour = scan.nextInt();
			if (hour > 0 && hour <= 12) {
				valid = true;
			} else {
				System.out.println("Heure incorrecte");
			}
		}
		System.out.println();
		while (!valid) {
			System.out.println("Entrer les minutes");
			minute = scan.nextInt();
			if (minute > 0 && minute <= 59) {
				valid = true;
			} else {
				System.out.println("Minutes incorrect");
			}
		}
		System.out.println();
		while (!valid) {
			System.out.println("Entrer les secondes");
			second = scan.nextInt();
			if (second > 0 && second < 60) {
				valid = true;
			} else {
				System.out.println("Seconde incorrect");
			}
		}

		LocalTime lt = LocalTime.of(hour, minute, second);
		System.out.println(lt.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
	}

	public static void addDateTime(Scanner scan) {
		
		int year = 0, month = 0, day = 0;
		int hour = 0, minute = 0, second = 0;
		boolean valid = false;

		while (!valid) {
			System.out.println("Entrer l'annee en 4 chiffres");
			year = scan.nextInt();
			if (year > 0 && year < LocalDate.now().getYear()) {
				valid = true;
			} else {
				System.out.println("Anné incorrecte");
			}
		}
		System.out.println();
		while (!valid) {
			System.out.println("Entrer le mois en chiffre");
			month = scan.nextInt();
			if (month > 0 && month <= 12) {
				valid = true;
			} else {
				System.out.println("Mois incorrect");
			}
		}
		System.out.println();
		LocalDate testDay = LocalDate.of(year, month, 1);
		while (!valid) {
			System.out.println("Entrer le jour en chiffre");
			day = scan.nextInt();
			if (day > 0 && day <= testDay.lengthOfMonth()) {
				valid = true;
			} else {
				System.out.println("Jour incorrect");
			}
		}
		
		while (!valid) {
			System.out.println("Entrer l'heure désirée");
			hour = scan.nextInt();
			if (hour > 0 && hour <= 12) {
				valid = true;
			} else {
				System.out.println("Heure incorrecte");
			}
		}
		System.out.println();
		while (!valid) {
			System.out.println("Entrer les minutes");
			minute = scan.nextInt();
			if (minute > 0 && minute <= 59) {
				valid = true;
			} else {
				System.out.println("Minutes incorrect");
			}
		}
		System.out.println();
		while (!valid) {
			System.out.println("Entrer les secondes");
			second = scan.nextInt();
			if (second > 0 && second < 60) {
				valid = true;
			} else {
				System.out.println("Seconde incorrect");
			}
		}
		LocalDateTime ldt = LocalDateTime.of(year, month, day, hour, minute, second);
		System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
	}
}
