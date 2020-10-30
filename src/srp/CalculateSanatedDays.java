package srp;

import java.util.Map;

public class CalculateSanatedDays {
	
	public int calculate (Map<Symptom, Integer> symptoms) {

		int maxDays = 0;
		
		//calculate largest affected days
		for(Symptom c:symptoms.keySet())
			if (maxDays < c.getAffectedDays()) maxDays = c.getAffectedDays();
		
		return maxDays;
		
	}

}
