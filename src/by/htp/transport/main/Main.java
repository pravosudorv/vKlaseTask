package by.htp.transport.main;

import by.htp.transport.domen.*;
import by.htp.transport.logica.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
	
	Poezd poezd = new Poezd();
	
	poezd.addPodvizhnayEdinica(new PasangersWagon());
	poezd.addPodvizhnayEdinica(new PasangersWagon("plackart"));
	poezd.addPodvizhnayEdinica(new PasangersWagon("kype", 20));
	poezd.addPodvizhnayEdinica(new PasangersWagon("kype", 30));
	poezd.addPodvizhnayEdinica(new PasangersWagon("kype", 25));
	poezd.addPodvizhnayEdinica(new PasangersWagon());
	Print.print(poezd);
	
	Arrays.sort(poezd.sostavWagons, new SortedByKomfort());
	}
}
