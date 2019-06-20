package date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AppDates8 {

	public static void main(String[] args) {

		// Objectif 1 : Afficher la date courante
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println(currentTime);

		// Objectif 2 : Afficher la date aux US
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Chicago"));
		LocalDateTime ldt = zdt.toLocalDateTime();
		System.out.println(ldt);

		// Objectif 3 : Afficher le jour, le mois, l'année
		System.out.println(currentTime.getDayOfWeek());
		System.out.println(currentTime.getMonth());
		System.out.println(currentTime.getYear());

		// Objectif 4 : Calculer une difference entre deux dates
		LocalDateTime afterTime = currentTime.plus(5, ChronoUnit.HOURS);
		Duration duration = Duration.between(currentTime, afterTime);
		System.out.println(duration);

		// Objectif 5 : Afficher la date au format voulu
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println(currentTime.format(formatter));
	}
}
