package metier;

import java.util.Date;

public class Jour {
	public static long nbreDejours(Date date1, Date date2) {
		long nbreJours=date2.getTime()-date1.getTime();
		nbreJours = (nbreJours/(1000 *60*60*24)+1);
		return nbreJours;
	}
}
