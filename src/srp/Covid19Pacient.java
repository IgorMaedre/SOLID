package srp;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {

	Map<Symptom, Integer> symptoms = new HashMap<Symptom, Integer>();
	
	public Covid19Pacient(String a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	public void addSymptom(Symptom c){
		symptoms.put(c, 1);
	}
	
	double calcCovid19Impact() {
		double afection, increment, impact;
		CalculateAfection calcAfec = new CalculateAfection();
		CalculateIncrement calcInc = new CalculateIncrement();
		CalculateImpact calcImp = new CalculateImpact();
		
		//calculate afection
		afection = calcAfec.calculate(symptoms);
		
		//calculate increment
		increment = calcInc.calculate(this, afection);
		
		//calculate impact
		impact = calcImp.calculate(this, afection, increment);
		
		return impact;

	}
	
	int sanatedDays() {
		
		CalculateSanatedDays calcSan = new CalculateSanatedDays();
		
		return calcSan.calculate(symptoms);
		
	}

}
