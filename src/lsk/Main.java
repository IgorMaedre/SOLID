package lsk;

public class Main {
	
	static RespiratorySymptom r = new RespiratorySymptom("Eztula", 2, 20);
	static NeuroMuscularSymptom nm = new NeuroMuscularSymptom("Bizkarreko mina", 3, 100);
	static CardioVascularSymptom cv = new CardioVascularSymptom("Anemia", 2, 70);
	static IncurableSymptom i = new IncurableSymptom("Tristura", 0, 0);
	
	static Covid19Pacient p = new Covid19Pacient("Iker", 30);

	public static void main(String[] args) {
		
		p.addSymptom(r);
		p.addSymptom(nm);
		p.addSymptom(cv);
		p.addSymptom(i);
		
		p.showSymptoms();
		
		p.cure();
		

	}

}
