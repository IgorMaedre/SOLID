package dip;

import java.util.Map;

public class CalculateAfection1 implements CalculateAfection {

	public double calculate(Covid19Pacient p) {
		Map<Symptom, Integer> symptoms = p.symptoms;
		double afection = 0;
		int elems = 0;
		
		for(Symptom c:symptoms.keySet())
			if (c.getCovidImpact() > 50) {
					afection = afection + c.getSeverityIndex() * symptoms.get(c);
					elems++;
			}
		afection = afection / elems;
		
		return afection;
	}
	
}
