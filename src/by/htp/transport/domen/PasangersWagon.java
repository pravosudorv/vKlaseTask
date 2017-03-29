package by.htp.transport.domen;

public class PasangersWagon extends PodvizhnayEdinica {
	private String komfort;
	private int intKomfort;
	private String[] listKomfort = new String[] { "matual", "plackart", "kype", "sv" };
	private int pasangers;
	private int seating;
	private int baggage;
	private static final int KB = 20;

	{
		komfort = "matual";
		seating = 50;
		pasangers = 0;
		baggage = 0;
		intKomfort = 1;
	}

	public PasangersWagon() {
	};

	public PasangersWagon(String komfort) {
		initKomfort(komfort);
	}

	public PasangersWagon(String komfort, int pasangers) {
		initKomfort(komfort);
		this.pasangers = pasangers;
	}

	public PasangersWagon(String komfort, int pasangers, int baggage) {
		initKomfort(komfort);
		this.pasangers = pasangers;
		this.baggage = baggage;
	}

	public String getKomfort() {
		return komfort;
	}

	public void setKomfort(String komfort) {
		if(pasangers == 0) {
			if(proverkaKomfort(komfort))
			initKomfort(komfort);
		}else{
			System.out.println("vagon c paasazhirami, cmenit nelzya");
		}
	}

	public int getPasangers() {
		return pasangers;
	}

	public void setPasangers(int pasangers) {
		if (pasangers <= seating) {
			this.pasangers = pasangers;
		} else {
			this.pasangers = seating;
			System.out.println("");
		}
		if (baggage > pasangers * KB) {
			baggage = pasangers * KB;
		}
	}

	public int getBaggage() {
		return baggage;
	}

	public void setBaggage(int baggage) {
		if (baggage <= pasangers * KB)
			this.baggage = baggage;
	}

	private boolean proverkaKomfort(String komfort) {
		for (String i : listKomfort) {
			if (komfort.equals(komfort)) {
				return true;
			}
		}
		return false;
	}

	private void initKomfort(String komfort) {
		switch (komfort) {
		case "matual":
			this.komfort = "matual";
			this.seating = 900;
			this.intKomfort = 1;
			break;
		case "plackart":
			this.komfort = "plackart";
			this.seating = 60;
			this.intKomfort = 2;
			break;
		case "kype":
			this.komfort = "kype";
			this.seating = 40;
			this.intKomfort = 3;
			break;
		case "sv":
			this.komfort = "sv";
			this.seating = 30;
			this.intKomfort = 4;
			break;
		}
	}

	public void print() {
		System.out.println("komfort :" + komfort + ", pasangers :" + pasangers + " seating :" + seating);
	}

}
