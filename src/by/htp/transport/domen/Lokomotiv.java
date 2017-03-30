package by.htp.transport.domen;

public class Lokomotiv extends PodvizhnayEdinica implements Propulsion{
	private int power;
	//private String tyaga;
	
	
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
