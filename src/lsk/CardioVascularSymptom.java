package lsk;

public class CardioVascularSymptom extends Symptom implements Curable {
	
	public CardioVascularSymptom(String a, int b, int c) {
		super(a, b, c);
	}
	
	public void cure() {
		System.out.println("treatment applied to: " + this.name);
	}
	
}
