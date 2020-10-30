package lsk;

public class Pacient {

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
		return years;
	}
	
	public void setName(String a) {
		name = a;
	}
	
	public void setYears(int a) {
		years = a;
	}
	
}
