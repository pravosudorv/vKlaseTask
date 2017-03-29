package by.htp.transport;

import by.htp.transport.domen.*;

public class TransportStation {
	public static void sumaPasangers(Poezd poezd) {
		int grosPasangers = 0;
		int grosBaggage = 0;
		for (int i = 0; i < poezd.getSostavWagons.length; i++) {
			grosPasangers += poezd.getSostavWagons[i].getPasangers();
			grosBaggage += poezd.getSostavWagons[i].getBaggage();
		}
		System.out.println("Общее количество пасажиров: " + grosPasangers + "; Количество багажа: " + grosBaggage);
	}

	public static void sortKomfort(Poezd poezd) {
		Wagon temp;

		for (int i = 0; i < poezd.getSostavWagons.length; i++) {
			for (int j = 0; j < poezd.getSostavWagons.length; j++) {
				if (poezd.getSostavWagons[i].getKomfort() < poezd.getSostavWagons[j].getKomfort()) {
					temp = poezd.getSostavWagons[i];
					poezd.getSostavWagons[i] = poezd.getSostavWagons[j];
					poezd.getSostavWagons[j] = temp;
				}
			}
		}
	}
	
	public static void search(Poezd poezd , int min, int max) {
		for (int i = 0; i < poezd.getSostavWagons.length; i++) {
			if(min <= poezd.getSostavWagons[i].getPasangers() && max >= poezd.getSostavWagons[i].getPasangers()) {
				poezd.print(i);
			}
		}
	}
}
