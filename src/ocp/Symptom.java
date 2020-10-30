package ocp;

public abstract class Symptom {
	
	public int severityIndex;
	public int covidImpact;
	public int affectedDays;
	
	public Symptom( int a, int b, int c) {
		this.severityIndex = a;
		this.covidImpact = b;
		this.affectedDays = c;
	}
	
	public abstract int getSeverityIndex();
	public abstract int getCovidImpact();
	public abstract int getAffectedDays();

}
