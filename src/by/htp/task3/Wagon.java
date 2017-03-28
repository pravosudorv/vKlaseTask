package by.htp.task3;

public class Wagon {
	private int komfort = 4; 
	private int pasangers = 0;
	private int seating = 50;
	private int baggage = 0;
	private static final int KB = 20;
	
	public Wagon() {};
	
	public Wagon(int komfort, int seating) {
		this.komfort = komfort;
		this.seating = seating;
	}
	
	public Wagon(int komfort, int seating, int pasangers) {
		this.komfort = komfort;
		this.seating = seating;
		this.pasangers = pasangers;
	}
	
	public Wagon(int komfort, int seating, int pasangers, int baggage) {
		this.komfort = komfort;
		this.seating = seating;
		this.pasangers = pasangers;
		this.baggage = baggage;
	}
	
	public int getKomfort() {
		return komfort;
	}

	public void setKomfort(int komfort) {
		this.komfort = komfort;
	}

	public int getPasangers() {
		return pasangers;
	}

	public void setPasangers(int pasangers) {
		if(pasangers <= seating) {
		this.pasangers = pasangers;
		} else {
			this.pasangers = seating;
		}
	}

	public int getSeating() {
		return seating;
	}

	public void setSeating(int seating) {
		this.seating = seating;
	}

	public int getBaggage() {
		return baggage;
	}

	public void setBaggage(int baggage) {
		if(baggage <= pasangers * KB)
		this.baggage = baggage;
	}
	
	public void print() {
		System.out.println("komfort " + komfort + ", pasangers " + pasangers + " seating " + seating);
	}
}
