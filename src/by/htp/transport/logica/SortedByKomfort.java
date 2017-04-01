package by.htp.transport.logica;

import by.htp.transport.domen.*;
import java.util.Comparator;

public class SortedByKomfort implements Comparator<PodvizhnayEdinica> {
	public int compare(PodvizhnayEdinica wagon1, PodvizhnayEdinica wagon2) {
		PasangersWagon edinica1 = null;
		PasangersWagon edinica2 = null;
		if(wagon1 instanceof PasangersWagon) {
		edinica1 = (PasangersWagon) wagon1;
		}
		
		if(wagon1 instanceof PasangersWagon) {
		edinica2 = (PasangersWagon) wagon1;
		}
		
		int komfort1 = edinica1.getIntKomfort();
		int komfort2 = edinica2.getIntKomfort();

		if (komfort1 > komfort2) {
			return -1;
		} else {
			if (komfort1 < komfort2) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}
