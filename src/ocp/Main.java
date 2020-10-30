package ocp;

public class Main {
	static RespiratorySymptom r = new RespiratorySymptom(1, 40, 10);
	static CardioVascularSymptom c = new CardioVascularSymptom(2, 60, 11);
	static NeuroMuscularSymptom n = new NeuroMuscularSymptom(3, 70, 12);
	static Covid19Pacient p = new Covid19Pacient("Iker", 30);

	public static void main(String[] args) {
		
		p.addSymptom(r);
		p.addSymptom(c);
		p.addSymptom(n);
			
		System.out.println("This is the impact " + p.calcCovid19Impact() + " the pacient " + p.getName() + " has suffered.");
		
	}
}
