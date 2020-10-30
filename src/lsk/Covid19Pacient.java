package lsk;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {

	Map<Symptom, Integer> symptoms = new HashMap<Symptom, Integer>();
	
	public Covid19Pacient(String a, int b) {
		super(a, b);
	}
	
	public void addSymptom(Symptom c){
		symptoms.put(c, 1);
	}
	
	public void showSymptoms() {
		for(Symptom s: symptoms.keySet()) {
			s.show();
		}
	}
	
	public void cure() {
		for(Symptom s: symptoms.keySet()) {
			if(s instanceof Curable) ((Curable) s).cure();
		}
	}

}
