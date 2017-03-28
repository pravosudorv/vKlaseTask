package by.htp.task1;

public class Student {
	private String id = "0000";
	private String familiya = "Иванов";
	private String name;
	private String otchestvo;
	private  int gr;
	private  String adres;
	private  String tell;
	private  String fakyltet;
	private String kyrs;
	private String grypa;

	public Student() {};

	public Student(String id, String familiya, String name, String otchestvo, int gr, String adres, String tell, String fakyltet, String kyrs, String grypa) {
		this.id = id;
		this.familiya = familiya;
		this.name = name;
		this.otchestvo = otchestvo;
		this.gr = gr;
		this.adres = adres;
		this.tell = tell;
		this.fakyltet = fakyltet;
		this.kyrs = kyrs;
		this.grypa = grypa;
	}
	
	public Student(String id, String familiya, String name, String otchestvo, int gr, String fakyltet, String kyrs, String grypa) {
		this.id = id;
		this.familiya = familiya;
		this.name = name;
		this.otchestvo = otchestvo;
		this.fakyltet = fakyltet;
		this.kyrs = kyrs;
		this.grypa = grypa;
		this.gr = gr;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the famililiya
	 */
	public String getFamiliya() {
		return familiya;
	}

	/**
	 * @param famililiya the famililiya to set
	 */
	public void setFamiliya(String familiya) {
		this.familiya = familiya;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the otchestvo
	 */
	public String getOtchestvo() {
		return otchestvo;
	}

	/**
	 * @param otchestvo the otchestvo to set
	 */
	public void setOtchestvo(String otchestvo) {
		this.otchestvo = otchestvo;
	}

	/**
	 * @return the gr
	 */
	public int getGr() {
		return gr;
	}

	/**
	 * @param gr the gr to set
	 */
	public void setGr(int gr) {
		this.gr = gr;
	}

	/**
	 * @return the adres
	 */
	public String getAdres() {
		return adres;
	}

	/**
	 * @param adres the adres to set
	 */
	public void setAdres(String adres) {
		this.adres = adres;
	}

	/**
	 * @return the tell
	 */
	public String getTell() {
		return tell;
	}

	/**
	 * @param tell the tell to set
	 */
	public void setTell(String tell) {
		this.tell = tell;
	}

	
	public String getFakyltet() {
		return fakyltet;
	}

	
	public void setFakyltet(String fakyltet) {
		this.fakyltet = fakyltet;
	}

	
	public String getKyrs() {
		return kyrs;
	}

	
	public void setKyrs(String kyrs) {
		this.kyrs = kyrs;
	}

	
	public String getGrypa() {
		return grypa;
	}


	public void setGrypa(String grypa) {
		this.grypa = grypa;
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [getId()=" + getId() + ", getFamiliya()=" + getFamiliya() + ", getName()=" + getName()
				+ ", getOtchestvo()=" + getOtchestvo() + ", getGr()=" + getGr() + ", getAdres()=" + getAdres()
				+ ", getTell()=" + getTell() + ", getFakyltet()=" + getFakyltet() + ", getKyrs()=" + getKyrs()
				+ ", getGrypa()=" + getGrypa() + "]";
	}

	public void tostring() {
		System.out.println(getFamiliya()+ " " + getName()+" " + getOtchestvo());
	}
}
