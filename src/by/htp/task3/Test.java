package by.htp.task3;

public class Test {
	
	public static void main(String[] args) {
	Poezd poezd = new Poezd(10);
	poezd.sostavWagons[0].setPasangers(45);
	poezd.sostavWagons[1].setPasangers(100);
	poezd.sostavWagons[2].setPasangers(20);
	poezd.sostavWagons[3].setPasangers(25);
	//poezd.sostavWagons[4].setPasangers(30);
	poezd.sostavWagons[5].setPasangers(35);
	poezd.sostavWagons[6].setPasangers(40);
	poezd.sostavWagons[7].setPasangers(15);
	poezd.sostavWagons[9].setKomfort(1);
	//poezd.sostavWagons[7].setKomfort(2);
	poezd.sostavWagons[5].setKomfort(3);
	poezd.sostavWagons[8].setKomfort(1);
	poezd.sostavWagons[1].setKomfort(2);
	poezd.sostavWagons[4].setKomfort(1);
	
	TransportStation.sortKomfort(poezd);
	poezd.printAll();
	}

}
