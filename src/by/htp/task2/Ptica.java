package by.htp.task2;

public class Ptica {
	Kluv kluv = new Kluv();
	Krulo krulo = new Krulo();
	
	
	
	public void fly() {
		krulo.raskrutKrulo();
		krulo.mashet();
	}
	
	public void posadka() {
		System.out.println("����������� � ����� � ������ ��������");
		krulo.sloshitKrulo();
	}
	
	public void pitanie() {
		kluv.raskrutKluv();
		System.out.println("���� ����");
		kluv.zakrutKluv();
	}
	
	public void ataka() {
		krulo.raskrutKrulo();
		kluv.raskrutKluv();
		System.out.println("����");
		krulo.raskrutKrulo();
		kluv.zakrutKluv();
		System.out.println("����");
		
	}
	
	
}
