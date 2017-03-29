package by.htp.transport.domen;

public class Poezd {
	private PodvizhnayEdinica[] sostavWagons;
	private int kyrsor = 0;
	private static final int INIT_SIZE = 20;
	private static final double PERCENT = 0.75;
	
	public Poezd() {
		this.sostavWagons = new PodvizhnayEdinica[INIT_SIZE];
	}

	public Poezd(int size) {
		this.sostavWagons = new PodvizhnayEdinica[size];
	}
	
	public void addPodvizhnayEdinica(PodvizhnayEdinica edinica) {
		if(edinica.equals(null)) {
			return;
		}
		if(kyrsor == sostavWagons.length *PERCENT) {
			inkrementSizePoezd();
		}
		sostavWagons[kyrsor] = edinica;
		kyrsor++;
 	}

	private void inkrementSizePoezd() {
		PodvizhnayEdinica[] newPoezd = new PodvizhnayEdinica[newSize()];
		for(int i = 0; i < kyrsor; i++) {
			newPoezd[i] = sostavWagons[i];
		}
		sostavWagons = newPoezd;
	} 
	
	private int newSize() {
		int k = 3;
		int n = 2;
		int newSize = sostavWagons.length * k / n;
		return newSize;
	}
	
	public void delPodvizhnayEdinica(int index) {
		if(index < kyrsor) {
		sostavWagons[index-1] = null;
		sdvig(index);
		}
	}
	
	private void sdvig(int index) {
		for(int i = index; i < kyrsor; i++) {
			sostavWagons[i-1] = sostavWagons[i];
		}
		sostavWagons[kyrsor] = null;
		kyrsor--;
	}
	
	
}
