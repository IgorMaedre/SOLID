package srp;

public class CalculateIncrement {
	
	public double calculate(Pacient p, double afection) {
		double increment = 0;
		
		if(p.getYears() > 65) 
			increment = afection * 0.5;
		
		if(p.getYears() > 45 &&  p.getYears() <= 65)
			increment = afection * 0.3;
		
		return increment;		
	}

}
