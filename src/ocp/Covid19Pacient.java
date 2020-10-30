package ocp;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {

	Map<Symptom, Integer> symptoms = new HashMap<Symptom, Integer>();
	
	public Covid19Pacient(String a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	public void addSymptom(Symptom s){
		symptoms.put(s, 1);
	}
	
	double calcCovid19Impact() {
		double afection = 0;
		double increment = 0;
		double impact;
		
		//calculate afection
		for(Symptom c:symptoms.keySet())
			if (c.getCovidImpact() > 50) {
					afection = afection + c.getSeverityIndex() * symptoms.get(c);
			}
		afection = afection / symptoms.size();
		
		//calculate increment
		if(this.getYears()>65) 
			increment = afection * 0.5;
		
		//calculate impact
		impact = afection + increment;
		
		return impact;

	}
	
	int sanatedDays() {
		
		int maxDays = 0;
		
		//calculate largest affected days
		for(Symptom c:symptoms.keySet())
			if (maxDays < c.getAffectedDays()) maxDays = c.getAffectedDays();
		
		return maxDays;
		
	}

}
