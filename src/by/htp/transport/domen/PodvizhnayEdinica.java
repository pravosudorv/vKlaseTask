package by.htp.transport.domen;

public abstract class PodvizhnayEdinica implements Comparable {
	private int mass;
	
	{
		mass = 1000;
	}
	
	public PodvizhnayEdinica(){}
	
	public PodvizhnayEdinica(int mass){
		initMass(mass);
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		initMass(mass);
	}
	
	private void initMass(int mass) {
		if(mass >= 1000 & mass <= 20000){
			this.mass = mass;
			}
	}
	
	public int compareTo(Object obj) {
		PodvizhnayEdinica edinica = (PodvizhnayEdinica)obj; 
		int results;
		results = this.getMass() - edinica.getMass();
		if(results != 0) {
			return (int) results/Math.abs(results);
		} 
		return 0;
	}

}
