package lsk;

public class NeuroMuscularSymptom extends Symptom implements Curable {

	public NeuroMuscularSymptom(String a, int b, int c) {
		super(a, b, c);
	}
	
	public void cure() {
		System.out.println("treatment applied to: " + this.name);
	}
	
}
