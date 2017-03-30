package by.htp.transport.logica;

import by.htp.transport.domen.*;

public class Print {
	
	public static void print(Poezd poezd) {
		for (int i = 0; i < poezd.getKyrsor(); i++) {
			if(proverkaPasangersWagon(poezd.getPodvizhnayEdinica(i))) {
				PasangersWagon wagon = (PasangersWagon) (poezd.getPodvizhnayEdinica(i));
				print(wagon);
			}
		}
	}
	
	public static void print(PasangersWagon wagon) {
		System.out.println("PasangersWagon, komfort: "+ wagon.getKomfort() + "; seating: " + wagon.getSeating() +
				                "; pasangers: " + wagon.getPasangers() + "; baggage" + wagon.getBaggage());
	}
	
	private static boolean proverkaPasangersWagon(PodvizhnayEdinica edinica) {
		if (edinica instanceof PasangersWagon) {
			return true;
		} else {
			return false;
		}
	}
}


