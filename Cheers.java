//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String name = args[0]; // the name to cheer for
            name = name.toUpperCase(); // convert the name to uppercase
            String anLetters = "AEFHILMNORSX"; // for these letters we use "an" instead of "a"
            int cheerCount = Integer.parseInt(args[1]); // number of times to cheer each letter
            for (int i = 0; i < name.length(); i++) {
                char currentChar = name.charAt(i);
                String anOrA = "a "; // default is "a"
                for (int j=0; j<anLetters.length(); j++){
                    if (name.charAt(i) == anLetters.charAt(j)) {
                            anOrA = "an ";// change to "an" if the letter is in anLetters
                    }
                }
                System.out.println("Give me " + anOrA + currentChar + ": " + currentChar + "!");// print the cheer for the current letter
            }
            System.out.println("What does that spell?");
            // Print the name with exclamation marks cheerCount times
            for (int k = 0; k < cheerCount; k++) {
                System.out.println(name + " !!!"); 
                }
        }
}