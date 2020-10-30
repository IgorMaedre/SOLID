package srp;

public class CalculateImpact {
	
	public double calculate(Pacient p, double afec, double inc) {
		
		double impact = afec + inc;
		
		if(p.getYears() < 10) impact = 0;
		
		return impact;
	}

}
