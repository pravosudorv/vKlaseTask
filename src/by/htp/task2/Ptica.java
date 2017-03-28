package by.htp.task2;

public class Ptica {
	Kluv kluv = new Kluv();
	Krulo krulo = new Krulo();
	
	
	
	public void fly() {
		krulo.raskrutKrulo();
		krulo.mashet();
	}
	
	public void posadka() {
		System.out.println("приблизился к земле и снизил скорость");
		krulo.sloshitKrulo();
	}
	
	public void pitanie() {
		kluv.raskrutKluv();
		System.out.println("взял пищу");
		kluv.zakrutKluv();
	}
	
	public void ataka() {
		krulo.raskrutKrulo();
		kluv.raskrutKluv();
		System.out.println("крик");
		krulo.raskrutKrulo();
		kluv.zakrutKluv();
		System.out.println("удар");
		
	}
	
	
}
