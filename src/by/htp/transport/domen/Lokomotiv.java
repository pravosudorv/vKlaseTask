package by.htp.transport.domen;

public class Lokomotiv extends PodvizhnayEdinica implements Propulsion{
	private int power;
	private final int maxSped;
	//private String tyaga;
	
	public Lokomotiv() {
		maxSped = 90;
	}
	
	public Lokomotiv(int maxSped) {
		if(maxSped <= 160) {
		this.maxSped = maxSped;
		} else {
			this.maxSped = 90;
		}
	}
	
	public void go(Poezd poezd) {
		if(provercaSoedineniyaSostava(poezd)) {
			
		}
	}
	
	private boolean provercaSoedineniyaSostava(Poezd poezd) {
		for(int i =0; i < poezd.getKyrsor(); i++) {
			if(this.equals(poezd.getPodvizhnayEdinica(i))) {
				return true;
			}
		}
		return false;
	}

}
