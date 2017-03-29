package by.htp.transport;

import by.htp.transport.domen.*;

public class Test {
	public static void main(String[] args) {
		Poezd poezd = new Poezd(10);
		poezd.getSostavWagons[0].setPasangers(45);
		poezd.getSostavWagons[1].setPasangers(100);
		poezd.getSostavWagons[2].setPasangers(20);
		poezd.getSostavWagons[3].setPasangers(25);
		poezd.getSostavWagons[4].setPasangers(30);
		poezd.getSostavWagons[5].setPasangers(35);
		poezd.getSostavWagons[6].setPasangers(40);
		poezd.getSostavWagons[7].setPasangers(15);
		poezd.getSostavWagons[9].setKomfort(1);
		poezd.getSostavWagons[7].setKomfort(2);
		poezd.getSostavWagons[5].setKomfort(3);
		poezd.getSostavWagons[8].setKomfort(1);
		poezd.getSostavWagons[1].setKomfort(2);
		poezd.getSostavWagons[4].setKomfort(1);
		
		TransportStation.sortKomfort(poezd);
		poezd.printAll();
		}
}
