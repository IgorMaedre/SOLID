package isp;

public class Pacient implements Ageable{

	public String name;
	public int years;
	
	public Pacient(String a, int b) {
		name = a;
		years = b;
	}
	
	public String getName() {
		return name;
	}
	
	public int getYears() {
		return this.years;
	}
	
}
