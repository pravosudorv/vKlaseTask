package by.htp.transport.logica;

import by.htp.transport.domen.*;

public class Sostavitel {

	public static void sortKomfort(Poezd poezd) {
		if(!"null".equals(poezd)) {
			otdelenie
		PodvizhnayEdinica temp;
		for (int i = 0; i < poezd.getKyrsor(); i++) {
			for (int j = 0; j < poezd.getKyrsor(); j++) {
				if (poezd.getPodvizhnayEdinica(i).getIntKomfort() < poezd.getSostavWagons[j].getIntKomfort()) {
					temp = poezd.getSostavWagons[i];
					poezd.getSostavWagons[i] = poezd.getSostavWagons[j];
					poezd.getSostavWagons[j] = temp;
				}
			}
		}
	}
	}
	
	
}
