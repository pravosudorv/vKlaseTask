package by.htp.task1;

public class Secretar {

	
	
	public static  void sortVuvodFakyltet(Student[] baza, String fakyltet) {
		for (int i = 0; i < baza.length; i++) {
			if (baza[i].getFakyltet().equals(fakyltet)) {
				baza[i].tostring();
			}
		}
	}

	public static void sortVuvodGR(Student[] baza, int gr) {
		for (int i = 0; i < baza.length; i++) {
			if (baza[i].getGr()%1000 > gr%1000) {
				baza[i].tostring();
			}
		}
	}

	public static void sortVuvodGrypa(Student[] baza, String grypa) {
		for (int i = 0; i < baza.length; i++) {
			if (baza[i].getGrypa().equals(grypa)) {
				baza[i].tostring();
			}
		}
	}
}
