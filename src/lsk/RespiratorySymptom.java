package lsk;

public class RespiratorySymptom extends Symptom implements Curable {

	public RespiratorySymptom(String a, int b, int c) {
		super(a, b, c);
	}
	
	public void cure() {
		System.out.println("treatment applied to: " + this.name);
	}
	
}
