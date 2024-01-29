package PracticePrograms;

public class MonthlyEMICalculator {

	public static void main(String[] args) {
		// E = P*r*(1+r)^n/((1+r)^n-1) 

		double tenureInMonths = 48; 
		double annualInterestRate = 10.75;
		double principal =700000;
		
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        
        double monthlyRate = (annualInterestRate/100)/12;
        
        double numarator2 =  principal*monthlyInterestRate*Math.pow(1+monthlyInterestRate,tenureInMonths);
        
        double denominator2= Math.pow(1+monthlyInterestRate,tenureInMonths)-1;
        
        float EMI = (float) (numarator2/denominator2);

        System.out.println("Monthly EMI: " + EMI);
    }
}
		