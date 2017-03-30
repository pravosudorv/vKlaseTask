package by.htp.transport.logica;

import by.htp.transport.domen.*;

public class BiletnoeBuro {

	public static void sumaPasangers(Poezd poezd) {
		if (proverkaNull(poezd)) {
			int grosPasangers = 0;
			int grosBaggage = 0;
			for (int i = 0; i < poezd.getKyrsor(); i++) {
				if (proverkaPasangersWagon(poezd.getPodvizhnayEdinica(i))) {
					PasangersWagon wagon = (PasangersWagon) (poezd.getPodvizhnayEdinica(i));
					grosPasangers += wagon.getPasangers();
					grosBaggage += wagon.getBaggage();
				} else {
					continue;
				}
			}
			System.out.println("Общее количество пасажиров: " + grosPasangers + "; Количество багажа: " + grosBaggage);
		}
	}

	private static boolean proverkaNull(Poezd poezd) {
		if (!"null".equals(poezd)) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean proverkaPasangersWagon(PodvizhnayEdinica edinica) {
		if (edinica instanceof PasangersWagon) {
			return true;
		} else {
			return false;
		}
	}

	public static void search(Poezd poezd, int min, int max) {
		if (proverkaNull(poezd)) {
			for (int i = 0; i < poezd.getKyrsor(); i++) {
				if (proverkaPasangersWagon(poezd.getPodvizhnayEdinica(i))) {
					PasangersWagon wagon = (PasangersWagon) (poezd.getPodvizhnayEdinica(i));
					if (min <= wagon.getPasangers()	&& max >= wagon.getPasangers()) {
						poezd.print(i);
					}
				}
			}
		}
	}
}
