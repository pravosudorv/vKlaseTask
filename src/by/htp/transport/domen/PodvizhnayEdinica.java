package by.htp.transport.domen;

public abstract class PodvizhnayEdinica {
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

}
