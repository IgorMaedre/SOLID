package isp;

public class Pertsona implements Ageable {
	
	String izena;
	int adina;
	
	public Pertsona (String name, int years) {
		this.izena = name;
		this.adina = years;
	}
	
	public String getName() {
		return this.izena;
	}
	
	public int getYears() {
		return this.adina;
	}

}
