package lsk;

public abstract class Symptom {
	
	public String name;
	public int severityIndex;
	public int covidImpact;
	
	public Symptom(String a, int b, int c) {
		this.name = a;
		this.severityIndex = b;
		this.covidImpact = c;
	}
	
	public int getCovidImpact() {
		return this.covidImpact;
	}
	
	public int getSeverityIndex() {
		return this.severityIndex;
	}
	
	public void show() {
		System.out.println("symptom value: " + this.name + " severityIndex: " + this.severityIndex + " covidImpact: " + this.covidImpact);
	}

}
