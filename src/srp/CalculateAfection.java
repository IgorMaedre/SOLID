package srp;

import java.util.Map;

public class CalculateAfection {
	
	public double calculate(Map<Symptom, Integer> symptoms) {
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
