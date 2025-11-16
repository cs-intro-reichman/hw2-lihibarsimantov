/*
Feedback:
Great work!
Yam
*/



// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt (args[0]); // the input number
		String mode = args[1]; // the mode
		// For each number from 1 to N, compute the number of steps to reach 1
		int sequenceCount = 0;
		for (int i=1; i<=N; i++){
			if (mode.equals("v")){
				System.out.print(i + " ");
			}
			int countSteps = 1; // count of steps to reach 1
			int currentNumber = i; // current number in the sequence
			// Generate the Collatz sequence for the current number
				do {
					// If the current number is even, divide it by 2
					if (currentNumber % 2 == 0) {
						currentNumber = currentNumber / 2;
						countSteps = countSteps + 1;
						if (mode.equals("v")){
							System.out.print(currentNumber + " ");// print the current number if in v (verbose) mode
						}
					} else {
						// If the current number is odd, multiply it by 3 and add 1
						currentNumber = 3 * currentNumber + 1;
						countSteps = countSteps + 1;
						if (mode.equals("v")){
							System.out.print(currentNumber + " ");// print the current number if in v  (verbose) mode
						}
					}
				} while (currentNumber != 1);
				sequenceCount = sequenceCount + 1;
				if (mode.equals("v")){
					System.out.print("(" + countSteps + ")");// print the sequence count if in v (verbose) mode
				}
				if (mode.equals("v")){
					System.out.println();
				}
		}
        //If the program terminates and prints the summary line, it verifies the Collatz conjecture up to N.
		if (sequenceCount == N){
						System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}
	}

}

