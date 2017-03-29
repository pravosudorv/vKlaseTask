package by.htp.transport.domen;

public abstract class PodvizhnayEdinica {
	private int mass;
	
	{
		mass = 1000;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		if(mass >= 1000){
		this.mass = mass;
		}
	}

}
