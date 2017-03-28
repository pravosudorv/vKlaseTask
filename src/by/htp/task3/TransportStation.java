package by.htp.task3;

public class TransportStation {

	public static void sumaPasangers(Poezd poezd) {
		int grosPasangers = 0;
		int grosBaggage = 0;
		for (int i = 0; i < poezd.sostavWagons.length; i++) {
			grosPasangers += poezd.sostavWagons[i].getPasangers();
			grosBaggage += poezd.sostavWagons[i].getBaggage();
		}
		System.out.println("Количество пасажиров в поезде: " + grosPasangers + "; Количество багажа " + grosBaggage);
	}

	public static void sortKomfort(Poezd poezd) {
		Wagon temp;

		for (int i = 0; i < poezd.sostavWagons.length; i++) {
			for (int j = 0; j < poezd.sostavWagons.length; j++) {
				if (poezd.sostavWagons[i].getKomfort() < poezd.sostavWagons[j].getKomfort()) {
					temp = poezd.sostavWagons[i];
					poezd.sostavWagons[i] = poezd.sostavWagons[j];
					poezd.sostavWagons[j] = temp;
				}
			}
		}
	}
	
	public static void search(Poezd poezd , int min, int max) {
		for (int i = 0; i < poezd.sostavWagons.length; i++) {
			if(min <= poezd.sostavWagons[i].getPasangers() && max >= poezd.sostavWagons[i].getPasangers()) {
				poezd.print(i);
			}
		}
	}
}
