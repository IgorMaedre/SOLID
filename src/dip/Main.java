package dip;

public class Main {
	
	static RespiratorySymptom r = new RespiratorySymptom(1, 40, 10);
	static CardioVascularSymptom c = new CardioVascularSymptom(2, 60, 11);
	static NeuroMuscularSymptom n = new NeuroMuscularSymptom(3, 70, 12);
	static Covid19Pacient p = new Covid19Pacient("Iker", 30);
	
	static CalculateAfection1 ca = new CalculateAfection1();
	static CalculateIncrement1 ci = new CalculateIncrement1();

	public static void main(String[] args) {
		
		p.addSymptom(r);
		p.addSymptom(c);
		p.addSymptom(n);
		
		double impact = p.calcCovid19Impact(ca, ci);
		
		System.out.println("Impaktua hau da: " + impact);

	}

}
