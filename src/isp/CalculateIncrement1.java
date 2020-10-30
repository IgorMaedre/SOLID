package isp;

public class CalculateIncrement1 implements CalculateIncrement {
	
	public double getIncrementByYear(Ageable a, double afection) {
		double increment = 0;
		int years = a.getYears();
		
		if(years > 65) 
			increment = afection * 0.5;
		
		return increment;		
	}

}
