package by.htp.task3;

public class Poezd {
	Wagon[] sostavWagons;
	
	public Poezd() {
		this.sostavWagons = new Wagon[1];
		this.sostavWagons[0] = new Wagon();
	}
	
	public Poezd(int size) {
		this.sostavWagons = new Wagon[size];
		for(int i = 0; i < size; i++) {
			this.sostavWagons[i] = new Wagon();
		}
	}
	
	public Poezd(int size, int komfort, int seating) {
		this.sostavWagons = new Wagon[size];
		for(int i = 0; i < size; i++) {
			this.sostavWagons[i] = new Wagon( komfort, seating);
		}
	}
	
	public void print(int i) {
		System.out.print("№ вагона " + (i+1) + ", ");
		sostavWagons[i].print();
	}
	
	public void printAll() {
		for (int i = 0; i < sostavWagons.length; i++) {
			print(i);
		}
	}
}
