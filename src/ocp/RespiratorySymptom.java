package ocp;

public class RespiratorySymptom extends Symptom {

	public RespiratorySymptom(int a, int b, int c) {
		super(a, b, c);
	}
	
	public int getCovidImpact() {
		return this.covidImpact;
	}
	
	public int getSeverityIndex() {
		return this.severityIndex;
	}
	
	public int getAffectedDays() {
		return this.affectedDays;
	}
	
}
