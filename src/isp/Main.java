package isp;

public class Main {
	
	static RespiratorySymptom r = new RespiratorySymptom(1, 40, 10);
	static CardioVascularSymptom c = new CardioVascularSymptom(2, 60, 11);
	static NeuroMuscularSymptom n = new NeuroMuscularSymptom(3, 70, 12);
	
	static Covid19Pacient cp = new Covid19Pacient("Iker", 30);
	static Pertsona p = new Pertsona("Imanol", 70);
	
	static CalculateAfection1 ca = new CalculateAfection1();
	static CalculateIncrement1 ci = new CalculateIncrement1();

	public static void main(String[] args) {
		
		cp.addSymptom(r);
		cp.addSymptom(c);
		cp.addSymptom(n);
		
		double impact = cp.calcCovid19Impact(ca, ci);
		
		System.out.println("Impaktua " + impact + " da " + cp.getName() + " pazientearentzako. \n");
		
		double increment = ci.getIncrementByYear(p, 40);
		
		System.out.println("Inkrementua " + increment + " da " + p.getName() + " pertsonarentzako.\n");

	}

}
