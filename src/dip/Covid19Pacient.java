package dip;

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
	
	double calcCovid19Impact(CalculateAfection ca, CalculateIncrement ci) {
		double afection, increment, impact;
		
		//calculate afection
		afection = ca.calculate(this);
		
		//calculate increment
		increment = ci.calculate(this, afection);
		
		//calculate impact
		impact = afection + increment;
		
		return impact;

	}

}
