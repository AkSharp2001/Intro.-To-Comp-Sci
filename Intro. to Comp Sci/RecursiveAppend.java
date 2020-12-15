/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Akshar Patel, aap279@scarletmail.rutgers.edu, aap279
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {

		if(n <= 0) {
			return original;
		}
		else {
			n--;
			return original + appendNTimes(original, n); 
		}
    }

    public static void main (String[] args) {

    	// String s = "cat";
    	// int num = Integer.parseInt(args[0]);
    	// System.out.print(appendNTimes(s,num));
	}
}
