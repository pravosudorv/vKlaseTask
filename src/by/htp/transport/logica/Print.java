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
		if(!"null".equals(edinica)) {
		if (edinica instanceof PasangersWagon) {
		//if (getClass(PasangersWagon).equals) {	
			return true;
		} else {
			return false;
			}
		} else {
			return false;
		}
	}
}


