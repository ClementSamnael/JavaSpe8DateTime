package app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import util.Util;

public class Menu {

	private static List<LocalDate> date = new ArrayList<LocalDate>();

	private static List<LocalTime> time = new ArrayList<LocalTime>();
	private static List<LocalDateTime> dateTime = new ArrayList<LocalDateTime>();

	public static void main(String[] args) {
		Util.mockList(date);

		int choix = 0;

		Scanner scan = new Scanner(System.in);
		while (choix != 10) {
			System.out.println("1. Saisir une date (jour/mois/année)");
			System.out.println("2. Saisir un temps (heures:minutes:secondes)");
			System.out.println("3. Saisir une date et un temps (jour/mois/annee heures:minutes:secondes)");
			System.out.println("4. Affichage des Listes");
			System.out.println("10. Quitter");
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
				// Afficher les listes
				// Aplliquer un filtre et/ou un tri
				show(scan);
				break;

			case 10:
				System.out.println("Fermeture de l'Application");
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
			if (year > 0 && year <= LocalDate.now().getYear()) {
			} else {
				System.out.println("Année incorrecte");
			}
			System.out.println("Entrer le mois en chiffre");
			month = scan.nextInt();
			if (month > 0 && month <= 12) {
			} else {
				System.out.println("Mois incorrect");
			}
			LocalDate testDay = LocalDate.of(year, month, 1);
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
		date.add(ld);
	}
	public static void addTime(Scanner scan) {

		int hour = 0, minute = 0, second = 0;

		boolean valid = false;

		while (!valid) {
			System.out.println("Entrer l'heure désirée");
			hour = scan.nextInt();
			if (hour >= 0 && hour <= 23) {
				valid = true;
			} else {
				System.out.println("Heure incorrecte");
			}
			System.out.println("Entrer les minutes");
			minute = scan.nextInt();
			if (minute > 0 && minute <= 59) {
				valid = true;
			} else {
				System.out.println("Minutes incorrect");
			}
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
		time.add(lt);
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
			System.out.println("Entrer le mois en chiffre");
			month = scan.nextInt();
			if (month > 0 && month <= 12) {
				valid = true;
			} else {
				System.out.println("Mois incorrect");
			}
			LocalDate testDay = LocalDate.of(year, month, 1);
			System.out.println("Entrer le jour en chiffre");
			day = scan.nextInt();
			if (day > 0 && day <= testDay.lengthOfMonth()) {
				valid = true;
			} else {
				System.out.println("Jour incorrect");
			}
			System.out.println("Entrer l'heure désirée");
			hour = scan.nextInt();
			if (hour > 0 && hour <= 12) {
				valid = true;
			} else {
				System.out.println("Heure incorrecte");
			}
			System.out.println("Entrer les minutes");
			minute = scan.nextInt();
			if (minute > 0 && minute <= 59) {
				valid = true;
			} else {
				System.out.println("Minutes incorrect");
			}
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
		dateTime.add(ldt);

	}

	public static void show(Scanner scan) {
		int choix = 0;
		while (choix != 4) {
			System.out.println("1. Liste de Dates");
			System.out.println("2. Liste de Temps");
			System.out.println("3. Liste de Dates et de Temps");
			System.out.println("4. Quitter");
			choix = scan.nextInt();
			switch (choix) {
			case 1:
				// Renvoie le menu des dates avec les filtres et les tris
				showDate(scan);
				break;
			case 2:
				// Renvoie le menu des temps avec les filtres et les tris
				showTime(scan);
				break;
			case 3:
				// Renvoie le menu des dates et des temps avec les filtres et les tris
				break;
			case 4:
				System.out.println("Retour");
				break;
			}
		}
	}

	public static void showDate(Scanner scan) {
		int choix = 0;
		while (choix != 4) {
			System.out.println("1. Afficher les dates");
			System.out.println("2. Filtrer les dates");
			System.out.println("3. Trier les dates");
			System.out.println("4. Retour");
			choix = scan.nextInt();
			switch (choix) {
			case 1:
				// Afficher les dates
				date.stream().forEach(dates -> System.out.println(dates));
				break;
			case 2:
				// Filtrer les dates selon année, mois, jour
				dateFilter(scan);
				break;
			case 3:
				// Trier selon année, mois, jour
				dateSorted(scan);
				break;
			case 4:
				System.out.println("Retour");
				break;
			}
		}
	}
	public static void dateFilter(Scanner scan) {
		int choix = 0;
		while (choix != 4) {
			System.out.println("1. Filtrer sur les années");
			System.out.println("2. Filtrer sur les mois");
			System.out.println("3. Filtrer sur les jours");
			System.out.println("4. Retour");
			choix = scan.nextInt();
			switch (choix) {
			case 1:
				// Filtrer sur les années
				System.out.println("Donner une année : ");
				int sYear = scan.nextInt();
				if (sYear < 0 && sYear > LocalDate.now().getYear())
					break;
				final int fYear = sYear;
				date.stream().filter(y -> y.getYear() < fYear);
				System.out.println(date);
				break;
			case 2:
				// Filtrer sur les mois
				System.out.println("Donner un mois : ");
				int sMonth = scan.nextInt();
				if (sMonth < 0 && sMonth > LocalDate.now().getMonthValue())
					break;
				final int fMonth = sMonth;
				date.stream().filter(m -> m.getMonthValue() < fMonth);
				System.out.println(date);
				break;
			case 3:
				// Filtrer sur les jours
				System.out.println("Donner un jour : ");
				int sDay = scan.nextInt();
				if (sDay < 0 && sDay > LocalDate.now().getDayOfMonth())
					break;
				final int fDay = sDay;
				date.stream().filter(d -> d.getDayOfMonth() < fDay);
				System.out.println(date);
				break;
			case 4:
				System.out.println("Retour");
				break;
			}
		}
	}

	public static void dateSorted(Scanner scan) {
		int choix = 0;
		while (choix != 4) {
			System.out.println("1. Trier sur les années");
			System.out.println("2. Trier sur les mois");
			System.out.println("3. Trier sur les jours");
			System.out.println("4. Retour");
			choix = scan.nextInt();
			switch (choix) {
			case 1:
				// Trier sur les années
				date.stream().sorted(Comparator.comparing(LocalDate::getYear));
				System.out.println(date);
				break;
			case 2:
				// Trier sur les mois
				date.stream().sorted(Comparator.comparing(LocalDate::getMonth));
				System.out.println(date);
				break;
			case 3:
				// Trier sur les jours
				date.stream().sorted(Comparator.comparing(LocalDate::getDayOfMonth));
				System.out.println(date);
				break;
			case 4:
				System.out.println("Retour");
				break;
			}
		}
	}

	public static void showTime(Scanner scan) {
		int choix = 0;
		while (choix != 4) {
			System.out.println("1. Afficher les temps");
			System.out.println("2. Filtrer les temps");
			System.out.println("3. Trier les temps");
			System.out.println("4. Retour");
			choix = scan.nextInt();
			switch (choix) {
			case 1:
				// Afficher les temps
				date.stream().forEach(dates -> System.out.println(dates));
				break;
			case 2:
				// Filtrer les dates selon heures, minutes, secondes
				timeFilter(scan);
				break;
			case 3:
				// Trier sselon heures, minutes, secondes
				timeSorted(scan);
				break;
			case 4:
				System.out.println("Retour");
				break;
			}
		}
	}
	public static void timeFilter(Scanner scan) {
		int choix = 0;
		while (choix != 4) {
			System.out.println("1. Filtrer sur les heures");
			System.out.println("2. Filtrer sur les minutes");
			System.out.println("3. Filtrer sur les secondes");
			System.out.println("4. Retour");
			choix = scan.nextInt();
			switch (choix) {
			case 1:
				// Filtrer sur les heures
				System.out.println("Donner une heure : ");
				int sHour = scan.nextInt();
				if (sHour < 0 && sHour > LocalTime.now().getHour())
					break;
				final int fHour = sHour;
				time.stream().filter(h -> h.getHour() < fHour);
				System.out.println(time);
				break;
			case 2:
				// Filtrer sur les minutes
				System.out.println("Donner les minutes : ");
				int sMinutes = scan.nextInt();
				if (sMinutes < 0 && sMinutes > LocalTime.now().getMinute())
					break;
				final int fMinutes = sMinutes;
				time.stream().filter(m -> m.getMinute() < fMinutes);
				System.out.println(time);
				break;
			case 3:
				// Filtrer sur les secondes
				System.out.println("Donner les secondes : ");
				int sSeconde = scan.nextInt();
				if (sSeconde < 0 && sSeconde > LocalTime.now().getSecond())
					break;
				final int fSeconde = sSeconde;
				time.stream().filter(s -> s.getSecond() < fSeconde);
				System.out.println(time);
				break;
			case 4:
				System.out.println("Retour");
				break;
			}
		}
	}
	public static void timeSorted(Scanner scan) {
		int choix = 0;
		while (choix != 4) {
			System.out.println("1. Trier sur les années");
			System.out.println("2. Trier sur les mois");
			System.out.println("3. Trier sur les jours");
			System.out.println("4. Retour");
			choix = scan.nextInt();
			switch (choix) {
			case 1:
				// Trier sur les heures
				time.stream().sorted(Comparator.comparing(LocalTime::getHour));
				System.out.println(date);
				break;
			case 2:
				// Trier sur les minutes
				time.stream().sorted(Comparator.comparing(LocalTime::getMinute));
				System.out.println(date);
				break;
			case 3:
				// Trier sur les secondes
				time.stream().sorted(Comparator.comparing(LocalTime::getSecond));
				System.out.println(date);
				break;
			case 4:
				System.out.println("Retour");
				break;
			}
		}
	}

}
