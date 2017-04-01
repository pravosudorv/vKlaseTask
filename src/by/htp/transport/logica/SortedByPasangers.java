package by.htp.transport.logica;

import by.htp.transport.domen.*;
import java.util.Comparator;

public class SortedByPasangers implements Comparator<PasangersWagon> {
	public int compare(PasangersWagon wagon1, PasangersWagon wagon2) {

		int pasangers1 = wagon1.getPasangers();
		int pasangers2 = wagon2.getPasangers();

		if (pasangers1 < pasangers2) {
			return -1;
		} else {
			if (pasangers1 > pasangers2) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}