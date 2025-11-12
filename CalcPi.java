// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numberOfTerms = Integer.parseInt (args[0]); // the number of terms that should be used in the calculation.
		double piApproximation = 0.0; // the approximation of PI
		for (int k=1; k<= numberOfTerms ; k++ ) {
			if (k % 2 != 0) {
				piApproximation = piApproximation + (1.0/(2.0*k - 1.0));
			} else {
				piApproximation = piApproximation - (1.0/(2.0*k - 1.0));
			}
		}
		System.out.println( "pi according to Java: " + Math.PI );
		piApproximation = piApproximation * 4.0;// multiply the sum by 4 to get the approximation of PI
		System.out.println( "pi,  approximated:     " + piApproximation );
	}
}
