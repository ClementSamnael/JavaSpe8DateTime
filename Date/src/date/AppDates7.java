package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class AppDates7 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		// Objectif 1 : Afficher la date courante
		Date date = Calendar.getInstance().getTime();
		System.out.println(date);    
		
		// Objectif 2 : Afficher la date aux US
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		format.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
		System.out.println(format.format(date));   
		
		// Objectif 3 : Afficher le jour, le mois, l'année   
		System.out.println(date.getDay());    
		System.out.println(date.getMonth()); 
        System.out.println(date.getYear());   
        
        // Objectif 4 : Calculer une difference entre deux dates   
        Date date2 = new Date(date.getTime() + 10000);   
        System.out.println(date2.getTime() - date.getTime());     
        
        // Objectif 5 : Afficher la date au format voulu     
        System.out.println(format.format(date)); 
	}

}
